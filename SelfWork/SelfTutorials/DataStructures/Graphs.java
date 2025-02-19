/*
Initialization:  

import java.util.*;
class Graph {
    private Map<dataType, List<dataType>> adjList = new HashMap<>();

    public void addEdge(int source, int destination) {
        adjList.computeIfAbsent(source, k -> newArrayList<>()).add(destination);
    }
}
 */

 import java.util.*;
 public class Graphs {
    static class Graph {
        private Map<String, List<String>> friendConnections = new HashMap<>();
        public void addFriendship(String person1, String person2) {
            friendConnections.computeIfAbsent(person1, k -> new
            ArrayList<>()).add(person2);
            friendConnections.computeIfAbsent(person2, k -> new
            ArrayList<>()).add(person1); // Bidirectional friendship
        }

        public void printNetwork() {
            System.out.println("Social Network: \n");

            for (Map.Entry<String, List<String>> entry : friendConnections.entrySet()) {
                System.out.println(entry.getKey() + " is friends with " + entry.getValue());
            }
        }
    }
    
    public static void main(String[] args) {
        Graph socialGraph = new Graph();

        socialGraph.addFriendship("Patrick", "Vem");
        socialGraph.addFriendship("Patrick", "Reb");
        socialGraph.addFriendship("Patrick", "Marc");
        socialGraph.addFriendship("Reb", "Marc");
        socialGraph.addFriendship("Reb", "Vem");

        socialGraph.printNetwork();
    }
 }