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

    public List<Edge<V>> getEdges(Vertex<V> vertex) {
        return adjacencyList.get(vertex);
    }

    public Set<Vertex<V>> getVertices() {
        return adjacencyList.keySet();
    }

    public void bfs(Vertex<V> start) {
        Set<Vertex<V>> visited = new HashSet<>();
        Queue<Vertex<V>> queue = new LinkedList<>();

        visited.add(start);
        queue.offer(start);

        while (!queue.isEmpty()) {
            Vertex<V> currentVertex = queue.poll();
            System.out.println(currentVertex);

            List<Edge<V>> edges = getEdges(currentVertex);
            for (Edge<V> edge : edges) {
                Vertex<V> neighbor = edge.getDestination();
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.offer(neighbor);
                }
            }
        }
    }


}
