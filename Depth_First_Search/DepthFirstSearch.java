package Depth_First_Search;

import java.util.*;

import _Graph.*;

public class DepthFirstSearch {
    public List<Vertex> depthFirstSearch(Graph G, Vertex src) {
        Set<Vertex> visited = new HashSet<>();
        Stack<Vertex> stack = new Stack<>();
        List<Vertex> result = new ArrayList<Vertex>();

        stack.push(src);
        visited.add(src);
        while (!stack.isEmpty()) {
            Vertex vertex = stack.pop();
            result.add(vertex);
            for (Edge edge : G.getAdjacencyList().get(vertex)) {                
                Vertex neighbor = edge.v();
                if (!visited.contains(neighbor)) {
                    stack.push(neighbor);
                    visited.add(neighbor);
                }
            }
        }
        return result;
    }
}
