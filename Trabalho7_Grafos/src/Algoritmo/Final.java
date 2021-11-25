package Algoritmo;

public class Final {

	public static void main(String[] args) {

		Ler_Arquivo.Ler("Grafo2_BellManFord.txt");
		
		Escrita_Arquivo.escrever(Ler_Arquivo.getGh());
	}
}