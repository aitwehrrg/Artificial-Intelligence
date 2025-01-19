#include "edge.cpp"
#include <bits/stdc++.h>

using namespace std;

class Graph {
    map<Vertex*, set<Edge*>> adjacencyList;
    set<Vertex*> vertices;

    public:
    inline map<Vertex*, set<Edge*>> getAdjacencyList() const;
    inline set<Vertex*> getVertices() const;
    Vertex* addVertex(string label, int heuristic);
    optional<Vertex*> getVertex(string label) const;
    Edge* addEdge(Vertex* u, Vertex* v, int w);
};

inline map<Vertex*, set<Edge*>> Graph::getAdjacencyList() const { return adjacencyList; }

inline set<Vertex*> Graph::getVertices() const { return vertices; }

Vertex* Graph::addVertex(string label, int heuristic) {
    Vertex* vertex = new Vertex(label, heuristic);
    vertices.insert(vertex);
    adjacencyList[vertex] = set<Edge*>();
    return vertex;
}

optional<Vertex*> Graph::getVertex(string label) const {
    for (Vertex* vertex : getVertices())
        if (vertex->label == label) return vertex;
    return nullopt;
}

Edge* Graph::addEdge(Vertex* u, Vertex* v, int w) {
    Edge* edge = new Edge(u, v, w);
    adjacencyList[u].insert(edge);
    return edge;
}
