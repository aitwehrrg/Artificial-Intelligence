from .._Graph.graph import *
from collections import deque

def breadth_first_search(G: Graph, src: Vertex) -> list[Vertex]:
    visited: set[Vertex] = set()
    stack: deque[Vertex] = deque()
    result: list[Vertex] = []

    stack.append(src)
    visited.add(src)
    while stack:
        vertex: Vertex = stack.pop()
        result.append(vertex)
        for edge in G.get_adjacency_list()[vertex]:
            neighbor: Vertex = edge.v()
            if neighbor not in visited:
                stack.append(neighbor)
                visited.add(neighbor)
    return result
