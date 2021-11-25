package Algoritmo;

public class Edge {

	private int source,target,weight;
	
     public Edge(){
         source = target = weight = 0;
     }
	
	public void setValues(int source, int target, int weight) {
		this.source = source;
		this.target = target;
		this.weight = weight;
	}
	
	
	public int getSource() {
		return source;
	}

	public int getTarget() {
		return target;
	}

	public int getWeight() {
		return weight;
	}
	
	
	public void printEdge() {
		System.out.print(source + "," + target + "  " + weight + "\n");
	}
	
}