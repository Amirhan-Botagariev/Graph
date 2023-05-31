public class Edge<V> {
    private Vertex<V> source;
    private Vertex<V> destination;
    private double weight;

    public Edge(Vertex<V> source, Vertex<V> destination, double weight) {
        this.source = source;
        this.destination = destination;
        this.weight = weight;
    }

    public Vertex<V> getSource() {
        return source;
    }

    public Vertex<V> getDestination() {
        return destination;
    }

    public double getWeight() {
        return weight;
    }

    public void setSource(Vertex<V> source) {
        this.source = source;
    }

    public void setDestination(Vertex<V> destination) {
        this.destination = destination;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
