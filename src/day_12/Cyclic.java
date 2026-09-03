package day_12;

public class Cyclic {
	static boolean hascycle(int [][] graph,int node,int parent,boolean[] visited) {
		visited[node]=true;
		for(int neighbour:graph[node]) {
			if(!visited[neighbour]) {
				if(hascycle(graph,neighbour,node,visited))
					return true;
			}
			else if(neighbour!=parent) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) {
		int[][] graph= {{1,2},{0,2},{0,1}};
		boolean[] visited =new boolean[3];
		if(hascycle(graph,0,-1,visited))
			System.out.println("cycle exists");
		else
			System.out.println("no cycle");
	}

}
