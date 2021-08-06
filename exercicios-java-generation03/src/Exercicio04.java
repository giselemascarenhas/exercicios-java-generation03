import java.util.Scanner;

//Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
// em seguida, exiba a soma dos valores dela e a soma dos valores da primeira diagonal, ou seja, diagonal principal.

public class Exercicio04 {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);

		int[][] matriz = new int[3][3];

		int linha, coluna, total = 0;

		int somaDiagonal = 0;

		for(linha = 0; linha <3; linha++) {
			for(coluna = 0; coluna <3; coluna++) {
				
				System.out.println("Digite os números: ");
				matriz[linha][coluna] = leia.nextInt();
				total = total + matriz[linha][coluna];
				somaDiagonal = matriz[0][0] + matriz[1][1] + matriz[2][2];
			}
		}

		leia.close();

		System.out.println("A soma dos números é: " + total);
		System.out.println("A soma da diagonal principal é: " + somaDiagonal);

	}
}