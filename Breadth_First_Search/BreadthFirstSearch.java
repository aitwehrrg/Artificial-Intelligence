package Breadth_First_Search;

import java.util.*;

import _Graph.*;

public class BreadthFirstSearch {
    public List<Vertex> breadthFirstSearch(Graph G, Vertex src) {
        Set<Vertex> visited = new HashSet<>();
        Queue<Vertex> queue = new LinkedList<>();
        List<Vertex> result = new ArrayList<Vertex>();

        queue.offer(src);
        visited.add(src);
        while (!queue.isEmpty()) {
            Vertex vertex = queue.poll();
            result.add(vertex);
            for (Edge edge : G.getAdjacencyList().get(vertex)) {                
                Vertex neighbor = edge.v();
                if (!visited.contains(neighbor)) {
                    queue.offer(neighbor);
                    visited.add(neighbor);
                }
            }
        }
        return result;
    }
}
