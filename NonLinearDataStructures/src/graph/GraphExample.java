package graph;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

class Graph {
	class Node {
		private String label;

		Node(String label) {
			this.label = label;
		}

		@Override
		public String toString() {
			return label;
		}
	}

	private Map<String, Node> nodes = new HashMap<String, Node>();
	private Map<Node, ArrayList<Node>> adjacenyList = new HashMap<Node, ArrayList<Node>>();

	public void addNode(String label) {
		Node node = new Node(label);
		nodes.putIfAbsent(label, node);
		adjacenyList.putIfAbsent(node, new ArrayList<>());
	}

	public void addEdge(String from, String to) {
		if (!nodes.keySet().contains(to))
			throw new IllegalStateException();
		if (!nodes.keySet().contains(from))
			throw new IllegalStateException();
		Node fromNode = nodes.get(from);
		Node toNode = nodes.get(to);
		adjacenyList.get(fromNode).add(toNode);
	}

	// Remove node from Graph
	public void removeNode(String label) {
		if (!nodes.keySet().contains(label))
			throw new IllegalStateException();

		Node removedNode = nodes.get(label);
		nodes.remove(label);
		Collection<Node> keys = adjacenyList.keySet();
		// For removing list associated with that node
		adjacenyList.remove(removedNode);

		// for removing all the edges from other node to the node that is to be removed.
		for (Node key : keys) {
			if (adjacenyList.get(key).contains(removedNode))
				adjacenyList.get(key).remove(removedNode);
		}

		System.out.println(label + " removed successfully");
	}

	// Remove edge from graph
	public void removeEdge(String from, String to) {
		if (!nodes.keySet().contains(to))
			throw new IllegalStateException();
		if (!nodes.keySet().contains(from))
			throw new IllegalStateException();

		Node fromNode = nodes.get(from);
		Node toNode = nodes.get(to);

		if (adjacenyList.get(fromNode).contains(toNode)) {
			adjacenyList.get(fromNode).remove(toNode);
			System.out.println("Edge from " + from + " to " + to + " removed successfully.");
		} else {
			System.out.println("There is no edge from " + from + " to " + to + ".");
		}

	}

	public void print() {
		for (Node nodeC : adjacenyList.keySet()) {
			System.out.println(nodeC + "------>" + adjacenyList.get(nodeC));
		}
	}
}

public class GraphExample {
	public static void main(String[] args) {
		Graph graph = new Graph();
		graph.addNode("A");
		graph.addNode("B");
		graph.addNode("C");
		graph.addNode("D");
		graph.addEdge("A", "B");
		graph.addEdge("A", "C");
		graph.addEdge("A", "D");
		graph.addEdge("B", "C");
		graph.addEdge("B", "D");
		graph.addEdge("C", "D");
		graph.addEdge("D", "C");
		graph.addEdge("D", "B");
		graph.addEdge("D", "A");
//		graph.print();
//		graph.removeNode("C");
//		graph.print();
		graph.removeEdge("A", "D");
		graph.print();
		graph.removeEdge("C", "A");
	}
}
