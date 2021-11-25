package Algoritmo;
import java.util.*;
import java.io.*;
  

class Graph {

	private int V, E, cont=0;
    private Edge []edges;
    private int[] distance;
	private Integer[] parent;
    
    private String caminho = " ";
	
   
    public Graph(int v, int e){
        this.V = v;
        this.E = e;
        
        edges = new Edge[e];
        
        for (int i = 0; i < e; ++i) {
        	edges[i] = new Edge();
        }
    }
    
    
    public void addEdge(int source, int target, int weight) {
    	edges[cont].setValues(source, target, weight);
    	cont++;
    }
   
     
    public boolean BellmanFord(int src){
    	        
        distance = new int[V+1];
        parent = new Integer[V+1];
        
        int u,v,weight;
        
            
        for (int i = 1; i <=  V; ++i) {
           distance[i] = Integer.MAX_VALUE;
        }
   
        distance[src] = 0;
             
            
        for (int x = 0; x < V-1; x++) {
            	
        	for (Edge e : edges) {
                 
        		u = e.getSource();
        		v = e.getTarget();                 
        		weight = e.getWeight();
                       
        		if ( (distance[u] != Integer.MAX_VALUE) && (distance[v] > (distance[u] + weight)) ) {
        			
        			 distance[v] = distance[u] + weight;	   	    
        			 parent[v]  = u;   
        		}
        	}}

        
       boolean resposta = true;
        
       for (Edge e : edges) {
        	
        	u = e.getSource();
        	v = e.getTarget();
        	weight = e.getWeight();
        	        
        	if( (distance[u] != Integer.MAX_VALUE) && (distance[v] > (distance[u] + weight)) ) {
        		 	
        		   distance[v] = distance[u]= -Integer.MAX_VALUE;
        		   parent[v] = parent[u] = null;
        		
        		   resposta = false;
        	}}
               
        return resposta;
    }
  

    public void Caminho(Integer target) {
    	
    	if(parent[target] == null) {
    		caminho += target +",";
    	}else {
    		Caminho(parent[target]);
    		caminho += target + ",";
    	}}
    
    
    public StringBuilder printArray() {
    	
    	 StringBuilder sb = new StringBuilder();
    	
    	 for(int x = 1; x<=V; x++) {	
    		 
    		 if(parent[x] != null) {
        		Caminho(x);
        		sb.append(x + "    Distancia:  " + distance[x] +"     " + caminho + "\n\n");
    		}
    		 
    		System.out.println(x  + "   D: " + distance[x] +"   " + caminho + "\n");
    		caminho=" ";
    	 }
    	 
    	 return sb;
     }
   
   
}