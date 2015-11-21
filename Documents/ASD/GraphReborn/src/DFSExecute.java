import DFS.DFS;

/**
 * Created by bandit on 11/17/15.
 */
public class DFSExecute extends GraphExecute{
    static DFS dfs= new DFS();

    public static void main(String[] args) {
        dfs.graph = Execute(dfs.graph);
        String kek = "";
        dfs.Algorithm(0);
        kek=dfs.result();
        System.out.println(kek);
    }
}
