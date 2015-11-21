package Djkstra;

import Graph.Graph;
import BFS.*;

import java.util.List;
import java.util.Queue;

import Graph.*;

/**
 * Created by bandit on 11/15/15.
 */
public class Djkstra {
    public Graph<String, Integer> graph;

    public Djkstra() {
    }

    public String path(String to){
        return (graph.getVertex(graph.getIndex(to))).getPath();
    }
    public void Algorithm(String from) {
        /*if graph have vertexes without adjacents*/
        graph.getVertexes().forEach(r -> {
            if (r.getAdjcent().size() == 0)
                r.visit();
        });

        OwnQueue queue = new OwnQueue();
        Vertex<String> statement = graph.getVertex(graph.getIndex(from));
        queue.queue.add(statement);
        statement.setAttend(0);
        statement.setPath(statement.getName());
        while (!queue.queue.isEmpty()) {
            /*create temporary vertex*/
            Vertex<String> vertex = queue.queue.poll();
            Vertex<String> graphPoint = graph.getVertex(graph.getIndex(vertex.getName()));
            List<Vertex> adjacent = graphPoint.getAdjcent();
            graphPoint.visit();
            adjacent.forEach(t -> {
                Vertex<String> v =  graph.getVertex(graph.getIndex((String) t.getName()));
                Integer length = (Integer) graph.getEdge(graphPoint.getName(), (String) v.getName()).getLength();
                if(v.getAttend()>length+graphPoint.getAttend()){
                    v.setAttend(length+graphPoint.getAttend());
                    v.setPath(graphPoint.getPath()+"->"+v.getName());
                }

            });
            String ind = "";
            Integer length = 100000;
            for (Vertex<String> v : (graph.getVertexes())) {
                if ( (v.getAttend() < length) && v.notVisited()) {
                    ind = v.getName();
                    length = v.getAttend();
                }
            }
            if (!ind.equals("")) {
                queue.queue.add(graph.getVertex(graph.getIndex(ind)));
            }
        }

    }
}
