package Best_First_Search;

import _Graph.*;
import java.util.*;

public class BestFirstSearch {
    public Optional<List<Vertex>> bestFirstSearch(Graph G, Vertex src, Vertex goal) {
        PriorityQueue<Vertex> queue = new PriorityQueue<>();
        Set<Vertex> visited = new HashSet<>();
        Map<Vertex, Vertex> parent = new HashMap<>();
        List<Vertex> result = new ArrayList<>();

        queue.add(src);
        while (!queue.isEmpty()) {
            Vertex vertex = queue.poll();
            if (vertex.equals(goal)) {
                while (vertex != null) {
                    result.add(vertex);
                    vertex = parent.get(vertex);
                }
                Collections.reverse(result);
                return Optional.of(result);
            }
            visited.add(vertex);
            for (Edge edge : G.getAdjacencyList().get(vertex)) {
                Vertex neighbor = edge.v();
                if (!visited.contains(neighbor)) {
                    if (!queue.contains(neighbor)) queue.add(neighbor);
                    parent.put(neighbor, vertex);
                }
            }
        }
        return Optional.empty();
    }
}
