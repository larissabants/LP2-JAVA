package lp2_1b;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Ex_3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<Jogador> lista = new ArrayList<Jogador>();

		int i = 0;

		while (i <= lista.size()) {
			System.out.println("Nome do jogador: ");
			String nome = sc.next();
			System.out.println("Idade: ");
			Integer idade = sc.nextInt();
			System.out.println("Número: ");
			Integer numero = sc.nextInt();

			Jogador x = new Jogador(nome, idade, numero);
			lista.add(x);

			if (numero == 0) {
				break;

			}
		}
		System.out.println(lista);
		for (Jogador x : lista) {
			System.out.println(x);
		}
	}
}
