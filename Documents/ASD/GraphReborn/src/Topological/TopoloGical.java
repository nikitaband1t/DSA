package Topological;
import Graph.*;
import Graph.Graph;
import BFS.OwnQueue;

import java.util.Stack;

public class TopoloGical  {
    Graph<String,Integer> graph = new Graph<String, Integer>();
    public void doAlgorithm(String from){
        Stack<Vertex<String>> stack = new Stack<>();
        String st = "";
        stack.push(graph.getVertex(graph.getIndex(from)));
        while(!stack.isEmpty()){
            Vertex<String> vertex = stack.peek();
            int capasity = stack.size();
            if(!(vertex.getAdjcent().size()==0)) {
                vertex.getAdjcent().forEach(r -> {
                    if(graph.getVertex(graph.getIndex((String)r.getName())).notVisited())
                        stack.push(r);
                });
            }
            else{
                st+=stack.pop().getName();
            }
            if(capasity==stack.size())
                st+=stack.pop().getName();
        }
    }

}
