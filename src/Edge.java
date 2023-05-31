public class Edge<V> {
    private Vertex<V> source;
    private Vertex<V> destination;
    private Double weight;

    public Edge(Vertex<V> source, Vertex<V> destination, Double weight) {
        this.source = source;
        this.destination = destination;
        this.weight = weight;
    }

}
