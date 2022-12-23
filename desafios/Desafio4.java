package desafios;

import java.util.Locale;
import java.util.Scanner;

public class Desafio4 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite a quantidade de entradas: ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			String texto = lerEntrada(sc);

			StringBuilder primeiraParte = new StringBuilder(texto.substring(0, texto.length() / 2));
			StringBuilder segundaParte = new StringBuilder(texto.substring(texto.length() / 2));
			primeiraParte.reverse();
			segundaParte.reverse();

			System.out.println(primeiraParte.toString() + segundaParte.toString());
		}
	}

	public static String lerEntrada(Scanner sc) {
		String texto = sc.nextLine();

		while (texto.isEmpty()) {
			texto = sc.nextLine();
		}

		if (stringValida(texto, 2, 100)) {
			return texto;
		} else {

			System.out.println("A frase precisa ter no mínimo 2 e no máximo 100 caracteres.");
			return lerEntrada(sc);
		}
	}

	public static boolean stringValida(String texto, int minimo, int maximo) {
		return texto.length() >= minimo && texto.length() <= maximo;
	}
}