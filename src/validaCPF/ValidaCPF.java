package validaCPF;

import java.util.Scanner;

public class ValidaCPF {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] cpf = new int[11];
		int opcao = 0;
		int soma = 0;
		int soma2 = 0;
		int resto = 0;
		int peso1 = 10;
		int peso2 = 11;
		int primeiroD;
		int segundoD;
		
			System.out.println("================ Valida CPF =================");
			System.out.println("=== Digite seu CPF para saber se é válido ===");
			System.out.println("========= Digite dígito por dígito ==========");
			for (int i = 0; i < 11; i++) {
				cpf[i] = sc.nextInt();
			}
			for (int i = 0; i < 9; i++) {
				soma += cpf[i] * peso1;
				peso1--;
			}
			resto = soma % 11;
			if (resto < 2) {
				primeiroD = 0;
			} else { primeiroD = 11 - resto;}
			for (int i =0; i < 10; i++) {
				soma2 += cpf[i] * peso2;
				peso2--;
			}
			resto = soma2 % 11;
			if (resto < 2) {
				segundoD = 0;
			} else { segundoD = 11 - resto;}
			if (primeiroD == cpf[9] && segundoD == cpf[10]) {
				System.out.println("== CPF Válido! ==");
			} else { System.out.println("== CPF Inválido! ==");}

	}

}
