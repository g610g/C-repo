import java.util.*;

class Graph{
    //array of linked list to store for connections
    private LinkedList <Integer> adjacentList[];
    //array to track for visited nodes
    private HashSet<Integer> visitedNodes;

    Graph(int numberOfVertices)
    {
        //array of linked list
        adjacentList = new LinkedList[numberOfVertices];
        visitedNodes = new HashSet<Integer> ();
        //initiate each index of the array of linkedList into a linkedList of integer
        for (int i = 0; i < numberOfVertices; i++)
        {
            adjacentList[i] = new LinkedList<Integer>();
        }
    }
    void addEdge(int source, int destination)
    {
        //on adding, add the destination on its corresponding source
        adjacentList[source].add(destination);
        return;
    }
    void Dfs(int startingNode)
    {
        //set the hashset as visited 
        visitedNodes.add(startingNode);
        System.out.print(startingNode + " ");
        //create an iterator in order to iterate the linkedList
        Iterator<Integer> iterable = adjacentList[startingNode].listIterator();
        //while we have a node value on the list
        while(iterable.hasNext())
        {
            //get the value
            int adj = iterable.next();
            //check if the current vertex is already visited or not
            if (!(visitedNodes.contains(adj)))
            {
                //recursively traverse other node of the currently visited node and check 
                Dfs(adj);
            }
        }
    }
    public static void main(String[] args) {
        Graph graph = new Graph(5);
        graph.addEdge(0, 1);
        graph.addEdge(0,3);
        graph.addEdge(1, 2);
        graph.addEdge(1, 4);
        graph.addEdge(2, 3);
        graph.addEdge(3, 1);
        
        
        graph.Dfs(0);
    }

}