public class Dijkstra
{
    public void algo(int[][]graph, int source)
    {
        int count = graph.length;
        boolean[] isVisited = new boolean[count];
        int [] distance = new int [count];
        for (int i = 0; i < count; i++)
        {
            distance[i] = Integer.MAX_VALUE;
            isVisited[i] = false;
        } 
        distance[source] = 0;
        for (int i = 0; i < count; i++)
        {
            int vertexMin = findMinVertexValue(distance, isVisited);
            isVisited[vertexMin] = true;    
            for (int neighbor = 0; neighbor < count; neighbor++)
            {
                if (graph[vertexMin][neighbor] != 0 && !isVisited[neighbor]  && (distance[neighbor] > distance[vertexMin] + graph[vertexMin][neighbor]))
                {
                    distance[neighbor] = graph[vertexMin][neighbor] + distance[vertexMin];
                }
            }
        }
        for (int i = 0; i < distance.length; i++)
        {
            System.out.println(String.format("Shortest Distance from %s to %s is %s", source, i, distance[i]));
        }

        

        
    }
    private int findMinVertexValue(int[] distance, boolean[] isVisited)
    {
        int minValue = Integer.MAX_VALUE;
        int vertexWithMinValue = -1;
        for (int i = 0; i < distance.length; i++)
        {
            if (!isVisited[i] && distance[i] < minValue)
            {
                minValue = distance[i];
                vertexWithMinValue = i;
            }
        }
        return vertexWithMinValue;
    }
    public static void main(String[] args) {
        int[][] graph  = {{0,0,1,2,0,0,0},{0,0,0,1,0,1,0}, {1,2,0,1,3,0,0}, { 2, 0, 1, 0, 0, 0, 1 }, { 0, 0, 3, 0, 0, 2, 0 }, { 0, 3, 0, 0, 2, 0, 1 }, { 0, 0, 0, 1, 0, 1, 0 }};
        Dijkstra sp = new  Dijkstra();
        sp.algo(graph, 0);
    }
}