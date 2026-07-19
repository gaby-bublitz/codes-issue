import java.util.Scanner;

/**
 * Exercício 2) <br>
 * Crie uma array de 5 elementos e descubra:<br>
 * a) Qual o maior elemento<br>
 * b) Qual o menor elemento <br>
 * c) A média dos elementos
 */

public class Ex2correcao {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int[] numeros = new int[5];
        
        System.out.println("Digite 5 numeros:"); // numeros
    
        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Numero " + (i + 1) + ": ");
            numeros[i] = input.nextInt();
        }

        int maior = numeros[0];
        int menor = numeros[0];
        int soma = 0;

        for (int num : numeros) {
        
            if (num > maior) {
                maior = num;
            }
	
            if (num < menor) {
                menor = num;
            }
        
            soma += num;
        
        }

        double media = (double)soma / numeros.length;

        System.out.println("Maior numero: " + maior);
        System.out.println("Menor numero: " + menor);
        System.out.println("Media dos numeros: " + String.format("%.2f", media));
        
        input.close();

    }
}
