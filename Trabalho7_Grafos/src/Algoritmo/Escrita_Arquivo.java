package Algoritmo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Escrita_Arquivo {

	
	public static void escrever(Graph gh) {
		
		Scanner dado = new Scanner(System.in);
		
		System.out.println("\nDigite a raiz");
		int raiz = dado.nextInt();
		
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter("Resultado_Final.txt"))){
			
			  boolean hasNegativeCycle = gh.BellmanFord(raiz);
		
			  bw.append("Não tem ciclo negativo: " + hasNegativeCycle + "\n\n");			  
			  bw.append(gh.printArray());
		
			  bw.close();
			  
		} catch (IOException e) {
			e.printStackTrace();
		}}
	
}