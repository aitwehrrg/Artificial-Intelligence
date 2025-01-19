#include "../_Graph/graph.cpp"
#include <bits/stdc++.h>

using namespace std;

vector<Vertex*> breadthFirstSearch(Graph* G, Vertex* src) {
    set<Vertex*> visited;
    queue<Vertex*> q;
    vector<Vertex*> result;

    q.push(src);
    visited.insert(src);
    while (!q.empty()) {
        Vertex* vertex = q.front(); q.pop();
        result.push_back(vertex);
        for (Edge* edge : G->getAdjacencyList()[vertex]) {
            Vertex* neighbor = edge->v;
            if (visited.find(neighbor) == visited.end()) {
                q.push(neighbor);
                visited.insert(neighbor);
            }
        }
    }
    return result;
}
