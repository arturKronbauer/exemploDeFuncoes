package aplicacao;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1, n2, op;
		do {
			System.out.println("----- Menu -----");
			System.out.println("1 - Primos");
			System.out.println("2 - Perfeitos");
			System.out.println("3 - Amigos");
			System.out.println("4 - Sair");
			System.out.println("Qual a sua opção: ");
			op = sc.nextInt();
			switch (op) {
			case 1:
				System.out.println("Informe o número para testar:");
				n1 = sc.nextInt();
				System.out.println(primos(n1));
				break;
			case 2:
				System.out.println("Informe o número para testar:");
				n1 = sc.nextInt();
				System.out.println(perfeitos(n1));
			break;
			case 3:
				System.out.println("Informe o primeiro número para testar:");
				n1 = sc.nextInt();
				System.out.println("Informe o segundo número para testar:");
				n2 = sc.nextInt();
				System.out.println(amigos(n1,n2));
			}
		} while (op != 4);
	}

	public static int somaDivisores(int n) {
		int soma = 0, div = 1;
		for (div = 1; div < n; div++) {
			if (n % div == 0) {
				soma += div;
			}
		}
		return soma;
	}
	
	public static String amigos(int n1, int n2) {
		int soma1 = somaDivisores(n1);
		int soma2 = somaDivisores(n2);
		if ((soma1 == n2) && (soma2 == n1)) {
			return "Os números são amigos";
		}
		else {
			return "Os números não são amigos";
		}
	}
	
	public static String perfeitos(int n) {
		int soma = somaDivisores(n);
		if (soma == n) {
			return "Número Perfeito";
		} else {
			return "O número não é perfeito";
		} 
	}

	public static String primos(int n) {
		int div = 1, total = 0;
		for (div = 1; div <= n; div++) {
			if (n % div == 0) {
				total++;
			}
		}
		if (total <= 2) {
			return "Número Primo";
		} else {
			return "Número não é Primo";
		}
	}
}
