package lp2_2b;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Ex2 {

	public static void main(String[] args) {

		FileInputStream entrada = null;
		FileOutputStream maior = null;
		FileOutputStream menor = null;

		try {

			entrada = new FileInputStream("entrada.txt");
			maior = new FileOutputStream("maior.txt");
			menor = new FileOutputStream("menor.txt");

			int numeros;

			while ((numeros = entrada.read()) != -1) {
				if (numeros > 128) {
					System.out.println("maior: " + numeros);
					maior.write(numeros);
				}

				else {
					if (numeros <= 128) {
						System.out.println("menor: " + numeros);
						menor.write(numeros);
					}
				}
			}
		}

		catch (IOException e) {
			e.printStackTrace();
		}

		finally {
			try {
				entrada.close();
				maior.close();
				menor.close();
			}

			catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}