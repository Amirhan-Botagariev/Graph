import java.util.HashMap;
import java.util.Map;
public class Vertex<V> {
    private V data;
    private Map<Vertex<V>, Double> adjVertex;
    private double distance;
    private Vertex<V> previous;

    public Vertex(V data) {
        this.data = data;
        this.adjVertex = new HashMap<>();
        this.distance = Double.POSITIVE_INFINITY;
        this.previous = null;
    }

    public void addAdjVertex(Vertex<V> destination, double weight) {
        adjVertex.put(destination, weight);
    }

    public Map<Vertex<V>, Double> getAdjVertex() {
        return adjVertex;
    }

    public V getData() {
        return data;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public Vertex<V> getPrevious() {
        return previous;
    }

    public void setPrevious(Vertex<V> previous) {
        this.previous = previous;
    }

    @Override
    public String toString() {
        return "Vertex " + data;
    }
}