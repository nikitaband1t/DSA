package Graph;

/**
 * Created by bandit on 11/12/15.
 */
public class Edge<Name, Value> {
    /*return value almost weight of edge is Integer or Float*/
    public Value value;
    /*Coordinates*/
    public Vertex<Name> from;
    public Vertex<Name> to;
    public Edge(){}

    public Edge(Vertex<Name> from,Vertex<Name> to,Value value){
        this.value = value;
        this.from = from;
        this.to = to;
    }
    public Vertex getFrom(){
        return  from;
    }
    public  Vertex getTo(){
        return to;
    }
    public Value getLength(){
        return  value;
    }
}
