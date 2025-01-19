package _Graph;
public record Vertex(String label, int heuristic) implements Comparable<Vertex> {
    @Override
    public int compareTo(Vertex other) {
        return Integer.compare(heuristic, other.heuristic);
    }
    
    @Override
    public String toString() {
        return label + "(" + heuristic + ")";
    }
}
