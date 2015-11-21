package BFS;

import Graph.*;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

/**
 * Created by bandit on 11/17/15.
 */
public class BFS {
    public Graph<String,Integer> graph = new Graph<String, Integer>();
    public BFS(){}
     private String output="";
     public OwnQueue Algorithm(int index){
       OwnQueue queue  = new OwnQueue();
       OwnQueue output = new OwnQueue();
       queue.queue.add(graph.getVertex(index));
       while(!queue.queue.isEmpty()){
           Vertex<String> vertex = queue.queue.poll();
           graph.getVertex(graph.getIndex(vertex.getName())).visit();
           for (Vertex vert : vertex.getAdjcent()) {
               if(graph.getVertex(graph.getIndex((String)vert.getName())).notVisited()) {
                   queue.queue.add(graph.getVertex(graph.getIndex((String) vert.getName())));
                   graph.getVertex(graph.getIndex((String)vert.getName())).visit();
               }
           }
           output.queue.add(vertex);
       }
        return output;
    }
}
