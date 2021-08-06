import java.util.Scanner;

// Um dado é lançado 10 vezes e o valor correspondente é anotado. 
// Faça um programa que gere um vetor com os lançamentos, escreva esse vetor. 
// A seguir determine e imprima a média aritmética dos lançamentos, contabilize e;
// Apresente também quantas foram as ocorrências da maior pontuação.

public class Exercicio02 {
	
public static void main(String[] args) {
		
		try (Scanner ler = new Scanner(System.in)) {
			double[] lancamento = new double[10];
			double soma = 0.0, maior = 0.0, media = 0.0;

			int x, maiorPontuacao = 0;
					

			for(x=0; x <= 9; x++){

				System.out.println("Digite os Lançamentos: ");
				lancamento[x] = ler.nextInt();
											
				soma = soma + lancamento[x];
				media = soma / 10;

				if(lancamento[x] == maior){
					maiorPontuacao++;
					
				}if(maior < lancamento[x]){
					maior = lancamento[x];
				}
			}
			System.out.println("A soma dos lançamentos é: " + soma);
			System.out.println("\nA média dos lançamentos é: " + media);
			System.out.println("\nA quantidade do maior lançamento é: " + (maiorPontuacao+1) + " e o maior lançamento foi: " + maior);
		}
	}
}