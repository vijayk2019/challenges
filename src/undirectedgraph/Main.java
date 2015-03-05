package undirectedgraph;

import java.util.*;

public class Main implements Iterable<Integer> {

	private final Map<Integer, Set<Integer>> graph = new HashMap<Integer, Set<Integer>>();

	public Iterator<Integer> iterator() {
		return graph.keySet().iterator();
	}

	public boolean addNode(Integer node) {
		if (graph.containsKey(node)) {
			return false;
		}

		graph.put(node, new HashSet<Integer>());
		return true;
	}

	public int size() {
		return graph.size();
	}

	public void addEdge(Integer start, Integer dest) {

		if (!graph.containsKey(start) || !graph.containsKey(dest)) {
			System.out.println("Eithe start or End is not in graph yet\n");
		}
		graph.get(start).add(dest);
		graph.get(dest).add(start);
	}

	public boolean isEdgeExists(Integer start, Integer end) {
		if (!graph.containsKey(start) || !graph.containsKey(end)) {
			System.out.println("Eithe start or End is not in graph yet\n");
		}

		return graph.get(start).contains(end);
	}

	public boolean isNodeExists(Integer start) {
		return graph.containsKey(start);
	}

	public Iterable<Integer> getNodes() {
		return graph.keySet();
	}

	public static void main(String[] args) {

		int vertices, edges, testnum, start, end;
		Main obj = new Main();
		Scanner in = new Scanner(System.in);
		vertices = in.nextInt();
		edges = in.nextInt();
		while (in.hasNextInt()) {
			start = in.nextInt();
			end = in.nextInt();
			if (!obj.isNodeExists(start)) {
				obj.addNode(start);
			}
			if (!obj.isNodeExists(end)) {
				obj.addNode(end);
			}
			obj.addEdge(start, end);
			System.out.println("\nGraph Size: " + obj.size());
		}
		in.close();

	}
}
