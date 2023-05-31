import java.util.HashMap;
import java.util.Map;
public class Vertex<V> {
    private V data;
    private Map<Vertex<V>, Double> adjVertex;

    public void addAdjVertex(Vertex<V> destination, double weight){
        addAdjVertex(destination, weight);
    }

    
}
