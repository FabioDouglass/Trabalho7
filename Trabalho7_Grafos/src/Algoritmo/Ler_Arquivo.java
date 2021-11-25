package Algoritmo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Ler_Arquivo {

	private static Graph gh;
	

	public static void Ler(String fileName) {

		try(BufferedReader br = new BufferedReader(new FileReader(fileName))){
			
			String []info = br.readLine().split(" ");
			
			
			System.out.println("Vertices: " + info[0] + "\nArestas: " + info[1] + "\n");
			
			gh = new Graph( Integer.parseInt(info[0]), Integer.parseInt(info[1]) );
			
			String edge = br.readLine();
			
			
			while(edge != null) {
				
				System.out.println(edge);
				
				String []edgeInfor = edge.split(" ");
				
				gh.addEdge( Integer.parseInt(edgeInfor[0]) ,  Integer.parseInt(edgeInfor[1]) ,  Integer.parseInt(edgeInfor[2]));
				
				edge = br.readLine();
			}
			
			br.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
		}}
	
	
	public static Graph getGh() {
		return gh;
	}
	
}