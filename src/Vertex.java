import java.util.HashMap;
import java.util.Map;
public class Vertex<V> {
    private V data;
    private Map<Vertex<V>, Double> adjVertex;

    public void addAdjVertex(Vertex<V> destination, double weight){
        addAdjVertex(destination, weight);
    }

    public Map<Vertex<V>, Double> getAdjVertex(){
        return adjVertex;
    }

    public V getData(){
        return data;
    }

    public Vertex(V data){
        this.data = data;
        this.adjVertex = new HashMap<>();
    }

    @Override
    public String toString() {
        return "Vertex " +
                this.data;
    }
}
