from .._Graph.graph import *
from queue import Queue

def breadth_first_search(G: Graph, src: Vertex) -> list[Vertex]:
    visited: set[Vertex] = set()
    queue: Queue[Vertex] = Queue()
    result: list[Vertex] = []

    queue.put(src)
    visited.add(src)
    while queue:
        vertex: Vertex = queue.get()
        result.append(vertex)
        for edge in G.get_adjacency_list()[vertex]:
            neighbor: Vertex = edge.v()
            if neighbor not in visited:
                queue.put(neighbor)
                visited.add(neighbor)
    return result
