import Graph.*;
import BFS.*;
public class BFSExecute extends GraphExecute {
    static BFS bfs = new BFS();

    public static void main(String[] args) {
        bfs.graph = Execute(bfs.graph);
        OwnQueue result = bfs.Algorithm(0);
        while (!result.queue.isEmpty()) {
            System.out.print(result.queue.poll().getName()+" ");
        }
        System.out.println();

    }
}
