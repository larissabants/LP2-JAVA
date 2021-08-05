package lp2_2b;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Ex3 {

	public static void main(String[] args) {

		ArrayList<Integer> numeros = new ArrayList<Integer>();

		while (numeros.size() < 10) {
			int numero = new Random().nextInt(100) + 1;
			numeros.add(numero);
		}

		Collections.sort(numeros);
		System.out.println(numeros);

		FileOutputStream impares = null;
		FileOutputStream pares = null;

		try {
			pares = new FileOutputStream("pares.txt");
			impares = new FileOutputStream("impares.txt");

			for (int i = 0; i < numeros.size(); ++i) {
				if (numeros.get(i) % 2 == 0) {
					System.out.println("pares: " + numeros.get(i));
					pares.write(numeros.get(i));
				} else {
					System.out.println("impares: " + numeros.get(i));
					impares.write(numeros.get(i));
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				pares.close();
				impares.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}