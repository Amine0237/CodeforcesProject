package July2023;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class IceSkating {

    static int n; // Number of snow drifts
    static List<Point> snowDrifts;
    static boolean[] visited;

    public static void main(String[] args) throws FileNotFoundException {
        // Scanner scanner = new Scanner(new File("src/input"));
        Scanner scanner = new Scanner(System.in);
        // Input the number of snow drifts
        n = scanner.nextInt();
        snowDrifts = new ArrayList<>();

        // Input the coordinates of each snow drift
        for (int i = 0; i < n; i++) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            snowDrifts.add(new Point(x, y));
        }

        // Mark all snow drifts as unvisited initially
        visited = new boolean[n];

        int connectedComponents = 0;
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(i); // finding all connected components to i
                connectedComponents++;
            }
        }

        // Number of additional snow drifts needed is the number of connected components minus 1
        int additionalSnowDrifts = connectedComponents - 1;
        System.out.println(additionalSnowDrifts);
    }

    // Depth-First Search (DFS) to explore the connected component starting from a snow drift
    static void dfs(int i) {
        visited[i] = true;
        Point current = snowDrifts.get(i);

        for (int j = 0; j < n; j++) {
            if (!visited[j]) {
                Point neighbor = snowDrifts.get(j);
                if (isAdjacent(current, neighbor)) {
                    dfs(j);
                }
            }
        }
    }

    // Helper function to check if two snow drifts are adjacent
    static boolean isAdjacent(Point p1, Point p2) {
        return (p1.x == p2.x) || (p1.y == p2.y);
    }
}
class Point {
    int x, y;
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}