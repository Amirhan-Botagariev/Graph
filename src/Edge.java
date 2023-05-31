public class Edge<V> {
    private Vertex<V> source;
    private Vertex<V> destination;
    private Double weight;

    public Edge(Vertex<V> source, Vertex<V> destination, Double weight) {
        this.source = source;
        this.destination = destination;
        this.weight = weight;
    }

    public Vertex getSource(){
        return source;
    }

    public Vertex<V> getDestination() {
        return destination;
    }

    public Double getWeight() {
        return weight;
    }

    public void setSource(Vertex<V> source) {
        this.source = source;
    }

    public void setDestination(Vertex<V> destination) {
        this.destination = destination;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }
}
