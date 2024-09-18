public class BasicGraph 
{
    public static void main(String[] args) 
    {
        int vertices = 5; // number of nodes
        int [][]graph = new int[5][5]; // array for the graph
        char []node = {'A','B','C','D','E'}; // representation of the nodes

        // Time to add edges to the graph
        Edge(graph,0,1); // A-B
        Edge(graph,1,2); // B-C
        Edge(graph,2,3); // C-D
        Edge(graph,3,0); // D-A
        Edge(graph,0,4); // A-E
        Edge(graph,4,3); // E-D

        // Print the title
        System.out.println("Matrix Of The Graph");
        System.out.print("  ");
        
        // Print the header
        for (int i = 0; i < vertices; i++)
        {
            System.out.print(node[i] + " ");
        }
        System.out.println();
        
        // Time to print the matrix
        for (int i = 0; i < vertices; i++) 
        {
            System.out.print(node[i] + " "); 
            for (int j = 0; j < vertices; j++) 
            {
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
    }
}
// Function to add an edge
public static void Edge(int[][] graph, int u, int v)
{
    graph[u][v] = 1; // Set the edge from u to v
    graph[v][u] = 1; // Set the edge from v to u vice-versa
}
}
