package DFS;
import  Graph.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * Created by bandit on 11/17/15.
 */
public class DFS {
    public Graph<String,Integer> graph = new Graph<String, Integer>();
    public void insertVertex(Vertex vertex){
        graph.addVertex(vertex);
    }
    public void insertEdge(Vertex from,Vertex to,Integer weight){
        graph.addEdge(from,to,weight);
    }
    private String execut="";
    public void Algorithm(int i){
        Vertex tmp = graph.getVertex(i);
        tmp.visit();
        execut+=tmp.getName().toString()+" ";
        List<Vertex> arr = graph.getVertex(i).getAdjcent();
        for (int itt = 0; itt < arr.size(); itt++) {
            Vertex get = arr.get(itt);
            if(graph.getVertex(graph.getIndex((String)get.getName())).notVisited()) {
                Algorithm(graph.getIndex((String)get.getName()));
            }
        }
    }
    public String result(){
        return execut;
    }
}
