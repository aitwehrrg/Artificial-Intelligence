#include "vertex.cpp"

struct Edge {
    public:
    Vertex* u;
    Vertex* v;
    int w;
    Edge(Vertex* u, Vertex* v, int w) : u(u), v(v), w(w) {}
};
