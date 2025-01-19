#include <string>
using std::string;

struct Vertex {
    string label;
    int heuristic;
    Vertex(string label, int heuristic) : label(label), heuristic(heuristic) {}
};
