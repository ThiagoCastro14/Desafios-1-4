package desafios;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Desafio1 {

	public static void main(String args[]) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = quantasLinhas(sc);
		int[] vect = new int[n];

		List<Integer> numerosPares = new ArrayList<>();
		List<Integer> numerosImpares = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			System.out.println("Digite um número: ");
			vect[i] = sc.nextInt();

			int restNumero = vect[i] % 2;

			if (restNumero == 0) {

				numerosPares.add(vect[i]);
			} else {

				numerosImpares.add(vect[i]);
			}
		}

		Collections.sort(numerosPares);
		Collections.sort(numerosImpares, Collections.reverseOrder());

		numerosPares.forEach(System.out::println);
		numerosImpares.forEach(System.out::println);
	}

	private static int quantasLinhas(Scanner sc) {
		System.out.println("Digite quantas linhas: ");
		int n = sc.nextInt();

		if (1 < n && n <= Math.pow(10, 5)) {
			return n;
		} else {
			System.out.println("Valor de linhas inválido!");
			return quantasLinhas(sc);
		}
	}
}