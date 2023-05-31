import java.util.*;

public class MyGraph<V> {
    private Map<Vertex<V>, List<Edge<V>>> adjacencyList;

    public MyGraph() {
        adjacencyList = new HashMap<>();
    }

    public void addVertex(Vertex<V> vertex) {
        adjacencyList.put(vertex, new ArrayList<>());
    }

    public void addEdge(Vertex<V> source, Vertex<V> destination, double weight) {
        Edge<V> edge = new Edge<>(source, destination, weight);
        adjacencyList.get(source).add(edge);
    }


}
