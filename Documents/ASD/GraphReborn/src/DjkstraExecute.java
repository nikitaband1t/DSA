import Djkstra.Djkstra;
import Graph.Graph;

/**
 * Created by bandit on 11/21/15.
 */
public class DjkstraExecute extends GraphExecute {
    static Djkstra djkstra = new Djkstra();

    public static void main(String[] args) {
        djkstra.graph = Execute(djkstra.graph);
        djkstra.Algorithm("Вологда");
        System.out.println(djkstra.path("Курск")+" "+djkstra.graph.getVertex(djkstra.graph.getIndex("Курск")).getAttend());
    }
}
