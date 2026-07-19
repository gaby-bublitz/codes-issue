import java.util.Scanner;

/**
 * Exercício 1) <br>

 * Descreva um algoritmo que vá lendo a altura de pessoas até o usuário entrar
 * com o número 0 <br>
 * Calcule a média de altura delas.
 * 
 */

public class Ex1 {

    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
        
        double altura;
	double somaAltura = 0;
	int contador = 0;
        
	while (true) {
            
            contador++; // (lugar errado)
            
            System.out.println("Insira a altura: ");
            altura = input.nextDouble();
            
            if (altura > 0) {
                
		somaAltura++; // somaAltura += altura;
                // contador++;
                
            } else {
		break;
            }
            
	}

	double media = altura / contador; // double media = somaAltura / contador;
	System.out.println("Média de altura: " + media + " metros");
        
        // System.out.println(contador);
        // System.out.println(somaAltura);
        
        // input.close();
    }

}
