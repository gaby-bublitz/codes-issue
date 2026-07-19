import java.util.Scanner;

/**
 * Exercício 2) <br>
 * Crie uma array de 5 elementos e descubra:<br>
 * a) Qual o maior elemento<br>
 * b) Qual o menor elemento <br>
 * c) A média dos elementos
 */

public class Ex2 {
    
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        int[] numeros = new int[5];
        
        System.out.println("Digite 5 n�meros:"); // numeros
    
        for (int i = 0; i < numeros.length; i++) { // (int i = 0; i < numeros.length; i++) -> array [0] vazio, padrão de 0
            System.out.print("N�mero " + (i + 1) + ": "); // ("Numero " + (i + 1) + ": ") ;
            numeros[i] = input.nextInt();
        }

        int maior = 0; // int maior = numeros[0];
        int menor = 0; // int menor = numeros[0];
        int soma = 0;

        for (int num : numeros) {
        
            if (num > maior) {
                maior = num;
            }
	
            if (num < menor) {
                maior = num; // menor = num;
            }
        
            soma += num;
        
        }

        double media = soma / numeros.length; // double media = (double)soma / numeros.length;

        System.out.println("Maior numero: " + maior);
        System.out.println("Menor numero: " + menor);
        System.out.println("Media dos numeros: " + media); // ("Media dos numeros: " + String.format("%.2f", media)
        
        // System.out.println(numeros[0]);
        
        // input.close();

    }
}
