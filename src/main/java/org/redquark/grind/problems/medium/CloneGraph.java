package org.redquark.grind.problems.medium;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class CloneGraph {

    /**
     * Time complexity - O(n)
     * Space complexity - O(n)
     */
    public Node cloneGraph(Node node) {
        // Special case
        if (node == null) {
            return null;
        }
        // Map to store the mapping of original node and the cloned node
        Map<Node, Node> mappings = new HashMap<>();
        // Queue to traverse the graph in BFS
        Queue<Node> nodes = new ArrayDeque<>();
        // Create the cloned node corresponding to the given "node"
        Node clone = new Node(node.val);
        // Map these nodes
        mappings.put(node, clone);
        // Add the node in the queue
        nodes.offer(node);
        // Traverse the graph in BFS manner
        while (!nodes.isEmpty()) {
            // Get the node at the front of the queue
            Node currentNode = nodes.poll();
            // Traverse through all the neighbors of this node
            for (Node neighbor : currentNode.neighbors) {
                // Check if this node has already been visited or not
                if (!mappings.containsKey(neighbor)) {
                    mappings.put(neighbor, new Node(neighbor.val));
                    nodes.offer(neighbor);
                }
                // Get the value of the current node as key. It will
                // return us the corresponding cloned node and we will
                // add to its neighbors
                mappings.get(currentNode).neighbors.add(mappings.get(currentNode));
            }
        }
        return clone;
    }

    static class Node {
        final int val;
        List<Node> neighbors;

        Node(int val) {
            this.val = val;
            this.neighbors = new ArrayList<>();
        }
    }
}
