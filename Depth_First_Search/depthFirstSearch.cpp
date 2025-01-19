#include "../_Graph/graph.cpp"
#include <bits/stdc++.h>

using namespace std;

vector<Vertex*> depthFirstSearch(Graph* G, Vertex* src) {
    set<Vertex*> visited;
    stack<Vertex*> s;
    vector<Vertex*> result;

    s.push(src);
    visited.insert(src);
    while (!s.empty()) {
        Vertex* vertex = s.top(); s.pop();
        result.push_back(vertex);
        for (Edge* edge : G->getAdjacencyList()[vertex]) {
            Vertex* neighbor = edge->v;
            if (visited.find(neighbor) == visited.end()) {
                s.push(neighbor);
                visited.insert(neighbor);
            }
        }
    }
    return result;
}
