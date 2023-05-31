# Graph
## Assignment 6
## Created four classes: MyGraph, Edge, Vertex and Main

# Vertex

## Table of Contents

- Methods
    - addAdjVertex
    - getAdjVertex
    - getData
    - getDistance
    - setDistance
    - getPrevious
    - setPrevious
    - toString

## Methods

## Fields and constructor:

```java
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
```

## addAdjVertex
```java
public void addAdjVertex(Vertex<V> destination, double weight) {
        adjVertex.put(destination, weight);
    }
```

### This method returns a map of the adjacent vertices and their corresponding edge weights connected to the current vertex.

## getData 

```java
public V getData() {
        return data;
    }
```
### This method returns the data associated with the current vertex.

## getDistance 

```java
public double getDistance() {
        return distance;
    }
```
### This method returns the distance value of the current vertex.

## setDistance 

```java
public void setDistance(double distance) {
        this.distance = distance;
    }
```

### This method sets the distance value of the current vertex.

## getPrevious 

```java
public Vertex<V> getPrevious() {
        return previous;
    }
```

### This method returns the previous vertex in the shortest path to the current vertex.

## setPrevious 

```java
public void setPrevious(Vertex<V> previous) {
        this.previous = previous;
    }
```
### This method sets the previous vertex of the current vertex in the shortest path.

## toString 

```java
@Override
    public String toString() {
        return "Vertex " + data;
    }
```

### This method returns a string representation of the current vertex.

# Edge

- Methods
    - getSource()
    - getDestination()
    - getWeight()
    - setSource(Vertex<V> source)
    - setDestination(Vertex<V> destination)
    - setWeight(double weight)
  
 ## Fields and constructor:

 ```java
  private Vertex<V> source;
    private Vertex<V> destination;
    private double weight;

    public Edge(Vertex<V> source, Vertex<V> destination, double weight) {
        this.source = source;
        this.destination = destination;
        this.weight = weight;
    }
 ```

## getSource() 

```java
public Vertex<V> getSource() {
        return source;
    }
```

### Returns the source vertex of the edge.

## getDestincation() 

```java
public Vertex<V> getDestination() {
        return destination;
    }
```

### Returns the destination vertex of the edge.

## getWeight() 

```java
public double getWeight() {
        return weight;
    }
```

### Returns the weight of the edge.

## setSource(Vertex<V> source)

```java
public void setSource(Vertex<V> source) {
        this.source = source;
    }
```

### Sets the source vertex of the edge.

## setDestination(Vertex<V> destination)

```java
public void setDestination(Vertex<V> destination) {
        this.destination = destination;
    }
```  
  
### Sets the destination vertex of the edge.

## setWeight(double weight)

```java
public void setWeight(double weight) {
        this.weight = weight;
    }
```  
  
### Sets the weight of the edge.

# MyGraph

- Methods
    - addVertex()
    - addEdge()
    - getEdges()
    - getVertices()
    - bfs(Vertex<V> start)
    - dijkstra(Vertex<V> start)
  
 ## Fields and constructor:

 ```java
  private Map<Vertex<V>, List<Edge<V>>> adjacencyList;

    public MyGraph() {
        adjacencyList = new HashMap<>();
    }
 ```
 
## addVertex() 

```java
public void addVertex(Vertex<V> vertex) {
        adjacencyList.put(vertex, new ArrayList<>());
    }
```

## addEdge() 

```java
public void addEdge(Vertex<V> source, Vertex<V> destination, double weight) {
        Edge<V> edge = new Edge<>(source, destination, weight);
        adjacencyList.get(source).add(edge);
    }
```

### This method adds an edge between two vertices in the graph with the given source, destination, and weight.

## getEdge() 

```java
public List<Edge<V>> getEdges(Vertex<V> vertex) {
        return adjacencyList.get(vertex);
    }
```

### This method returns a list of all edges in the graph.

## getVertices() 

```java
public Set<Vertex<V>> getVertices() {
        return adjacencyList.keySet();
    }
```

### This method returns a list of all vertices in the graph.

## bfs(Vertex<V> start) 

```java
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
```

### This method performs a breadth-first search starting from the specified start vertex.

## bfs(Vertex<V> start) 

```java
public void dijkstra(Vertex<V> start) {
        PriorityQueue<Vertex<V>> priorityQueue = new PriorityQueue<>(Comparator.comparingDouble(Vertex::getDistance));
        Set<Vertex<V>> visited = new HashSet<>();

        start.setDistance(0);
        priorityQueue.offer(start);

        while (!priorityQueue.isEmpty()) {
            Vertex<V> currentVertex = priorityQueue.poll();
            visited.add(currentVertex);

            List<Edge<V>> edges = getEdges(currentVertex);
            for (Edge<V> edge : edges) {
                Vertex<V> neighbor = edge.getDestination();
                double newDistance = currentVertex.getDistance() + edge.getWeight();
                if (newDistance < neighbor.getDistance()) {
                    neighbor.setDistance(newDistance);
                    neighbor.setPrevious(currentVertex);
                }

                if (!visited.contains(neighbor)) {
                    priorityQueue.offer(neighbor);
                }
            }
        }
    }
```

### This method performs Dijkstra's algorithm starting from the specified source vertex to find the shortest paths to all other vertices in the graph.




 
  
  
  
