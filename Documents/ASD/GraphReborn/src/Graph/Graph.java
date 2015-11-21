package Graph;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;

/**
 * Created by bandit on 11/12/15.
 */
public class Graph<Name, Data> implements Serializable{
protected List<Vertex<Name>> vertexes = new ArrayList<>();
protected List<Edge<Name, Data>> edges = new ArrayList<>();
    Function<Object,Comparable> comparator = new Function<Object, Comparable>() {
        @Override
        public Comparable apply(Object name) {
            return (Comparable)name;
        }
    };
    /*add Vertexes*/
    public void addVertex(Vertex vertex) {
        if(!vertexes.contains(vertex)) {
            vertexes.add(vertex);
        }
    }
    /*Get index of proper VertexName*/
    public int getIndex(Name tmp){
        for (int i = 0; i < vertexes.size(); i++) {
            if(comparator.apply(vertexes.get(i).getName()).compareTo(tmp)==0)
                return  i;
        }
        return -1;
    }
    /*Delete vertex by pointer adress*/
    public void removeVertex(Vertex vertex){
        vertexes.removeIf(vert->vert.equals(vertex));
    }
    /*AddEdge*/
    public void addEdge(Vertex from,Vertex to,Data weight){
        edges.add(new Edge<Name, Data>(from,to,weight));
        vertexes.forEach(vert->vert.updateVertex(from,to));
    }
    /*getEdge by VertexesName*/
    public Edge getEdge(Object from,Object to){
        for (Edge<Name, Data> edge : edges) {
            if(comparator.apply(edge.getFrom().getName()).compareTo(from)==0 && comparator.apply((edge.getTo().getName())).compareTo(to)==0)
                return edge;
        }
        return null;
    }
    /*getList edges almost for Djkstra Algorithm*/
    public List<Edge<Name,Data>> getEdges(){
        return edges;
    }
    public List<Vertex<Name>> getVertexes(){return vertexes;}
    /*According task requirements*/
    public String getAdjacent(Vertex query){
        return query.outAdjacent();
    }

    public Vertex getVertex(int i){
        return  vertexes.get(i);
    }
}
