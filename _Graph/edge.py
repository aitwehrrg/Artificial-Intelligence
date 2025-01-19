from vertex import *

class Edge:
    def __init__(self, u: Vertex, v: Vertex, w: int) -> None:
        self.__u: Vertex = u
        self.__v: Vertex = v
        self.__w: int = w
    
    def u(self) -> Vertex:
        return self.__u
    
    def v(self) -> Vertex:
        return self.__v
    
    def w(self) -> int:
        return self.__w
    
    def __str__(self) -> str:
        return '(' + str(self.__u) + ', ' + str(self.__v) + ', ' + str(self.__w) + ')'
