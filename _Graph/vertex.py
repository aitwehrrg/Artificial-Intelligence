class Vertex:
    def __init__(self, label: str, heuristic: int) -> None:
        self.__label: str = label
        self.__heuristic: int = heuristic
        
    def __str__(self) -> str:
        return self.__label + '(' + str(self.__heuristic) + ')'
