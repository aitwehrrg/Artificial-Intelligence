from edge import *

class Graph:
    def __init__(self) -> None:
        self.__adjacency_list: dict[Vertex, set[Edge]] = {}
        
    def get_adjacency_list(self) -> dict[Vertex, set[Edge]]:
        return self.__adjacency_list
    
    def get_vertices(self) -> set[Vertex]:
        return set(self.__adjacency_list.keys())
    
    def add_vertex(self, label: str, heuristic: int) -> Vertex:
        vertex: Vertex = Vertex(label, heuristic)
        self.__adjacency_list[vertex] = set()
        return vertex
    
    def get_vertex(self, label: str) -> Vertex | None:
        for vertex in self.get_vertices:
            if vertex.label == label: return vertex
        return None
    
    def add_edge(self, u: Vertex, v: Vertex, w: int) -> Edge:
        edge: Edge = Edge(u, v, w)
        self.__adjacency_list[u].add(edge)
        return edge
    
    def __str__(self) -> str:
        s: str = ''
        for vertex in self.get_vertices():
            s += str(vertex) + ' : ' + str(self.__adjacency_list[vertex]) + '\n'
        return s
