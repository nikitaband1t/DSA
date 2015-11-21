import Graph.*;

import java.io.*;

/**
 * Created by bandit on 11/12/15.
 */
public class GraphExecute {
    static Graph<String,Integer> grahics;
    static BufferedReader br;
    protected static Graph Execute(Graph graph) {
        try{
          graph = new Graph<String, Integer>();
          br = new BufferedReader(new FileReader("input.in"));
          String vertixes = br.readLine();
            for (String vert : vertixes.split(" ")) {
                graph.addVertex(new Vertex<String>(vert));
            }
            String[] edges = br.readLine().split(" ");
            for (int i = 0; i < edges.length; i+=3) {
                graph.addEdge(new Vertex(edges[i]),new Vertex(edges[i+1]),Integer.parseInt(edges[i+2]));
                System.out.println(i);
            }
    } catch (FileNotFoundException e) {
            e.printStackTrace();
            return null;
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return graph;
}

    public static void main(String[] args) {
        Execute(grahics);
    }
}