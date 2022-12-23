package desafios;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Desafio3 {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);

		System.out.printf("Informe o tamanho do lista: ");
		int n = sc.nextInt();

		System.out.println("Informe o número da diferença: ");
		int k = sc.nextInt();

		List<Integer> entradas = new ArrayList<Integer>();
		System.out.println("Informe os numeros da lista: ");
		for (int i = 0; i < n; i++) {
			sc = new Scanner(System.in);
			entradas.add(sc.nextInt());
		}

		List<Integer> comparacoes = new ArrayList<Integer>();
		comparacoes.addAll(entradas);

		int retorno = 0;
		for (Integer entrada : entradas) {
			for (Integer comparacao : comparacoes) {
				if ((entrada - comparacao) == k) {
					retorno++;
				}
			}
		}
		System.out.println("----------------------------");
		System.out.println(retorno);

		sc.close();
	}
}