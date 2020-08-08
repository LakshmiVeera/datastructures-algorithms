package Graphs;
import java.util.*;
/**
 * Dijkestra Algorithm to find the shortest distance from source to all other vertices in the directed graph
 */
public class DijkestraShortestPath {
    int v;
    PriorityQueue<Node> queue;
    int dist[];
    boolean[] settled;
    List<List<Node>> graph;

    public DijkestraShortestPath(int v) {
        this.v = v;
        graph = new ArrayList<List<Node>>(v);
        dist = new int[v];
        settled = new boolean[v];
        queue = new PriorityQueue<Node>(new NodeComparator());

        for (int i = 0; i< v; i++){
            List edge = new ArrayList<Node>();
            graph.add(edge);
            dist[i] = Integer.MAX_VALUE;
        }
    }

    public void addEdge(int v, Node n){
        graph.get(v).add(n);
    }

    public int[] findShortestPath(int source) {
        queue.add(new Node(source, 0));
        dist[source] = 0;

        while(queue.size() > 0) {
            int n = queue.size();

            for (int i = 0; i < n; i++) {
                Node node = queue.poll();
                settled[node.value] = true;

                List<Node> neighbours = graph.get(node.value);

                for (Node neighbour : neighbours) {
                    int v = neighbour.value;
                    if (!settled[v]) {
                        int newDistance = dist[node.value] + neighbour.distance;
                        if (newDistance < dist[v]) {
                            neighbour.distance = newDistance;
                            dist[v] = newDistance;
                        }
                        queue.offer(neighbour);
                    }
                }
            }
        }
        return dist;
    }

    public static void main(String... args){
        int v = 5;
        DijkestraShortestPath dijkestraPath = new DijkestraShortestPath(v);
        dijkestraPath.addEdge(0, new Node(1, 1));
        dijkestraPath.addEdge(0, new Node(2, 8));
        dijkestraPath.addEdge(1, new Node(4, 2));
        dijkestraPath.addEdge(1, new Node(3, 3));
        dijkestraPath.addEdge(3, new Node(4, 2));
        dijkestraPath.addEdge(2, new Node(3, 1));

        int[] dist = dijkestraPath.findShortestPath(0);

        // print shortest distances to all vertices from source
        for (int i = 0; i < v; i++) {
            System.out.println("distance from 0 to " + i + " is " + dist[i]);
        }
    }
}

class Node {
    int value;
    int distance;

    public Node(int value, int distance) {
        this.value = value;
        this.distance = distance;
    }
}

class NodeComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        return ((Node)o1).distance - ((Node)o1).distance;
    }
}
