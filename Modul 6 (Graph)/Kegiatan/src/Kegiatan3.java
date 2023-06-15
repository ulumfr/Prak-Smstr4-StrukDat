import java.util.*;

class Graph {
    private int numVertices;
    private LinkedList<Integer>[] adjacencyList;

    public Graph(int data) {
        this.numVertices = data;
        adjacencyList = new LinkedList[data];

        for (int vertexIndex = 0; vertexIndex < data; vertexIndex++) {
            adjacencyList[vertexIndex] = new LinkedList<>();
        }
    }

    public void addEdge(int source, int destination) {
        adjacencyList[source].add(destination);
    }

    public void BFS(int startVertex) {
        boolean[] visited = new boolean[numVertices];
        Queue<Integer> queue = new LinkedList<>();

        visited[startVertex] = true;
        queue.add(startVertex);

        while (!queue.isEmpty()) {
            int currentVertex = queue.poll();
            System.out.print(currentVertex + " ");

            for (int adjacentVertex : adjacencyList[currentVertex]) {
                if (!visited[adjacentVertex]) {
                    visited[adjacentVertex] = true;
                    queue.add(adjacentVertex);
                }
            }
        }
        System.out.println();
    }

    public void DFS(int startVertex) {
        boolean[] visited = new boolean[numVertices];
        DFSUtil(startVertex, visited);
        System.out.println();
    }

    private void DFSUtil(int vertex, boolean[] visited) {
        visited[vertex] = true;
        System.out.print(vertex + " ");

        for (int adjacentVertex : adjacencyList[vertex]) {
            if (!visited[adjacentVertex]) {
                DFSUtil(adjacentVertex, visited);
            }
        }
    }

    public void traverseGraph(int option, int startVertex) {
        switch (option) {
            case 1:
                System.out.print("Hasil BFS\t: ");
                BFS(startVertex);
                break;
            case 2:
                System.out.print("Hasil DFS\t: ");
                DFS(startVertex);
                break;
            default:
                System.out.println("Pilihan Tidak Valid.");
                break;
        }
    }
}

public class Kegiatan3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Graph graph = new Graph(12);

        graph.addEdge(1, 2);
        graph.addEdge(2, 1);
        graph.addEdge(1, 4);
        graph.addEdge(4, 6);
        graph.addEdge(2, 5);
        graph.addEdge(5, 2);
        graph.addEdge(5, 3);
        graph.addEdge(5, 7);
        graph.addEdge(5, 9);
        graph.addEdge(9, 5);
        graph.addEdge(6, 7);
        graph.addEdge(7, 6);
        graph.addEdge(9, 8);
        graph.addEdge(8, 9);
        graph.addEdge(7, 11);
        graph.addEdge(11, 7);
        graph.addEdge(8, 11);
        graph.addEdge(11, 10);

        int option = 0;

        while (option != 3) {
            System.out.println("\n=== Graph (BFS & DFS) ===");
            System.out.println("1. BFS");
            System.out.println("2. DFS");
            System.out.println("3. Exit");
            System.out.print("\nPilihan\t: ");
            option = input.nextInt();

            if (option == 1 || option == 2) {
                System.out.print("\nVertex Awal\t: ");
                int startVertex = input.nextInt();

                graph.traverseGraph(option, startVertex);
                System.out.println();
            } else if (option != 3) {
                System.out.println("Pilihan Tidak Valid.");
            }
        }
    }
}
