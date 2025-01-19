#include <string>

using namespace std;

struct Vertex {
    string label;
    int heuristic;
    Vertex(string label, int heuristic) : label(label), heuristic(heuristic) {}
};
