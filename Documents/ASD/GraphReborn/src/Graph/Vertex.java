package Graph;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * Created by bandit on 11/12/15.
 */
public class Vertex<Name> {
    /*Vertex definition*/
    private static Function<Object,Comparable> comparator = new Function<Object, Comparable>() {
        @Override
        public Comparable apply(Object o) {
            return (Comparable)o;
        }
    };
    public Name name;
    List<Vertex> adjecnt = new ArrayList<>();
    boolean visited = false;
    public Vertex() {
    }

    public void visit(){
        visited = true;
    }

    public Vertex(Name name) {
        this.name = name;
    }

    public void addAdjecnt(Vertex tmp){
       if(!adjecnt.contains(tmp))
        adjecnt.add(tmp);
    }

    public String outAdjacent(){
        String out ="";
        for (Vertex vertex : adjecnt) {
            out+=vertex.name.toString();
        }
        return out;
    }

    public boolean notVisited(){
        return  !visited?true:false;
    }
    public void updateVertex(Vertex a,Vertex b){
        if(comparator.apply(this.name).compareTo(a.name)==0)
            addAdjecnt(b);
        if(comparator.apply(this.name).compareTo(b.name)==0)
            addAdjecnt(a);
    }

    public Name getName(){
        return name;
    }
    public List<Vertex> getAdjcent(){
        return  adjecnt;
    }
    private  int attend = 1000000;
    private String path = "";

    public int getAttend() {
        return attend;
    }

    public void setAttend(int attend) {
        this.attend = attend;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }
}
