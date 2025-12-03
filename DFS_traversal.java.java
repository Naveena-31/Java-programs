import java.util.*;
public class Main
{
	public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter vertices:");
		 int vertices=sc.nextInt();
		 System.out.println("Enter edges:");
		 int edges=sc.nextInt();
		 List<List<Integer>> graph=new ArrayList<>();
		 for(int i=0;i<vertices;i++){
		     graph.add(new ArrayList<>());
		 }
		 for(int i=0;i<edges;i++){
		     int u=sc.nextInt();
		     int v=sc.nextInt();
		     graph.get(u).add(v);
		     graph.get(v).add(u);
		 }
		 System.out.println("Enter vertex:");
		 int startVertex=sc.nextInt();
		 boolean[] visited=new boolean[vertices];
		 System.out.println("DFS traversal");
		 dfstraversal(graph,visited,startVertex);
	}
	public static void dfstraversal(List<List<Integer>> graph, boolean[] visited,int startVertex){
	    visited[startVertex]=true;
	    System.out.print(startVertex+" ");
	    for(int nei:graph.get(startVertex)){
	        if(!visited[nei]){
	            dfstraversal(graph,visited,nei);
	        }
	    }
	}
}