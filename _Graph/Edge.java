package _Graph;
public record Edge(Vertex u, Vertex v, int w) {
    @Override
    public String toString() {
        return "(" + u + ", " + v + ", " + w + ")";
    }
}
