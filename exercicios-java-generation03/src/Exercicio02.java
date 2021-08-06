import java.util.Scanner;

// Um dado � lan�ado 10 vezes e o valor correspondente � anotado. 
// Fa�a um programa que gere um vetor com os lan�amentos, escreva esse vetor. 
// A seguir determine e imprima a m�dia aritm�tica dos lan�amentos, contabilize e;
// Apresente tamb�m quantas foram as ocorr�ncias da maior pontua��o.

public class Exercicio02 {
	
public static void main(String[] args) {
		
		try (Scanner ler = new Scanner(System.in)) {
			double[] lancamento = new double[10];
			double soma = 0.0, maior = 0.0, media = 0.0;

			int x, maiorPontuacao = 0;
					

			for(x=0; x <= 9; x++){

				System.out.println("Digite os Lan�amentos: ");
				lancamento[x] = ler.nextInt();
											
				soma = soma + lancamento[x];
				media = soma / 10;

				if(lancamento[x] == maior){
					maiorPontuacao++;
					
				}if(maior < lancamento[x]){
					maior = lancamento[x];
				}
			}
			System.out.println("A soma dos lan�amentos �: " + soma);
			System.out.println("\nA m�dia dos lan�amentos �: " + media);
			System.out.println("\nA quantidade do maior lan�amento �: " + (maiorPontuacao+1) + " e o maior lan�amento foi: " + maior);
		}
	}
}