package lp2_2b;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		FileInputStream buscar = null;

		Scanner sc = new Scanner(System.in);

		boolean x = false;

		while (x == false) {
			try {
				System.out.println("\nDigite o nome do arquivo de leitura que queira encontrar: ");
				buscar = new FileInputStream(sc.nextLine());

				int aux;

				while ((aux = buscar.read()) != -1) {
					System.out.println(buscar.read());
				}
				buscar.close();
			}

			catch (FileNotFoundException e) {
				System.out.println("\nArquivo não encontrado!");
				x = false;

			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}