package lp2_1b;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Scanner;

public class Exe_5 {

		public static void main(String[] args) {
			
			String nome;
			Integer dia;
			Integer mes;
			Integer ano;
			LocalDate data;
			
			HashMap<String, LocalDate> hm = new HashMap<String, LocalDate>();
			
			do {
				Scanner sc = new Scanner(System.in);
				System.out.println("Digite seu nome ");
				nome=sc.nextLine();
				
				if(!(nome.isEmpty())) {
				System.out.println("Digite o dia do seu nascimento: ");
				dia=sc.nextInt();
				System.out.println("Digite o mês do seu nascimento: ");
				mes=sc.nextInt();
				System.out.println("Digite o ano do seu nascimento: ");
				ano=sc.nextInt();
				data = LocalDate.of(ano, mes, dia);
				hm.put(nome, data);}
			}
			while(!(nome.isEmpty()));
			
			System.out.println(hm);
	   }
	}