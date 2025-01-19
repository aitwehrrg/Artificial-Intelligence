package _Graph;
import java.util.*;

public class Graph {
    private final Map<Vertex, Set<Edge>> adjacencyList;

    public Graph() {
        this.adjacencyList = new HashMap<>();
    }

    public Map<Vertex, Set<Edge>> getAdjacencyList() {
        return adjacencyList;
    }

    public Set<Vertex> getVertices() {
        return adjacencyList.keySet();
    }

    public Vertex addVertex(String label, int heuristic) {
        var vertex = new Vertex(label, heuristic);
        adjacencyList.put(vertex, new HashSet<>());
        return vertex;
    }

    public Optional<Vertex> getVertex(String label) {
        for (Vertex vertex : getVertices())
            if (vertex.label().equals(label)) return Optional.of(vertex);
        return Optional.empty();
    }

    public Edge addEdge(Vertex u, Vertex v, int w) {
        var edge = new Edge(u, v, w);
        adjacencyList.get(u).add(edge);
        return edge;
    }

    @Override
    public String toString() {
        var stringBuilder = new StringBuilder();
        for (Vertex vertex : getVertices())
            stringBuilder.append(vertex.label()).append(" : ").append(adjacencyList.get(vertex)).append("\n");
        return stringBuilder.toString();
    }
}
