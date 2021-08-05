package lp2_1b;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex_4 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		ArrayList<Integer> num = new ArrayList<Integer>();

		int numero;
		System.out.println("Digite numeros inteiros maiores que zero!: ");
		numero = sc.nextInt();
		
		
		do {
			if (numero > 0) {
				num.add(numero);
			numero = sc.nextInt();
			}
			
		} while (numero != 0);
		{
		}

		int menor = 0;
		for (int cont = 0; cont < num.size(); cont++) {

			if (menor > num.get(cont))
				menor = num.get(cont);
		}

		Collections.sort(num);
		System.out.println("Quantidade de números armazenados: " + num.size());
		System.out.println("O maior valor armazenado: " + num.get(num.size() - 1));
		System.out.println("O menor valor armazenado: " + num.get(menor));

	}

}
