import java.text.Normalizer;
import java.util.Scanner;

/**
 * Considere a matriz do exercício: <br>
 * Você foi atarefado de desenvolver um programa que realiza uma análise de
 * dados em uma array bidimensional que representa a informação da temperatura
 * de uma determinada semana. Cada linha corresponde a um dia da semana e cada
 * coluna corresponde a uma hora do dia. <br>
 * Calcule: <br>
 * A média diária de um dia da semana específico. O usuário entrará com o dia da
 * semana por extenso, por exemplo “domingo”, então você deve pesquisar na linha
 * correspondente. <br>
 * A média da hora de todos os dias da semana. O usuário entrará com a hora, por
 * exemplo 15, então você deve pesquisar na coluna correspondente.
 * 
 */

public class Ex3correcao {
    public static void main(String[] args) {
	double[][] temperaturas = {
            
            { 22.1, 23.5, 24.0, 23.8, 22.6, 21.9, 21.7, 22.2, 23.0, 24.1, 24.5, 24.0, 24.3, 24.4, 24.0, 24.5, 24.1, 24.4, 24.8, 24.5, 24.3, 24.7, 24.9, 23.8 },
            { 21.8, 22.7, 23.2, 23.9, 23.7, 22.8, 22.5, 22.1, 22.9, 24.0, 24.6, 25.1, 26.2, 27.5, 28.1, 28.6, 29.2, 29.5, 28.9, 27.6, 26.4, 25.8, 25.1, 24.0 },
            { 20.7, 21.0, 21.5, 22.1, 22.5, 22.7, 22.9, 23.1, 23.5, 23.9, 24.2, 24.6, 25.0, 25.3, 25.6, 25.9, 26.2, 26.5, 26.8, 27.1, 27.4, 27.7, 27.9, 27.8 },
            { 20.2, 20.5, 21.0, 21.4, 21.8, 22.2, 22.5, 22.8, 23.1, 23.3, 23.6, 23.9, 24.2, 24.5, 24.8, 25.1, 25.4, 25.7, 26.0, 26.3, 26.6, 26.9, 27.1, 27.2 },
            { 19.8, 20.0, 20.3, 20.7, 21.1, 21.4, 21.8, 22.1, 22.4, 22.7, 23.0, 23.3, 23.6, 23.9, 24.2, 24.5, 24.8, 25.1, 25.4, 25.7, 26.0, 26.2, 26.3, 26.5 },
            { 19.5, 19.8, 20.1, 23.5, 23.9, 24.3, 24.7, 25.1, 25.5, 26.8, 27.1, 28.4, 28.7, 29.0, 28.3, 28.6, 28.9, 29.2, 28.5, 28.8, 28.1, 27.3, 27.5, 26.7 },
            { 19.2, 19.5, 19.9, 20.3, 20.7, 21.1, 21.5, 21.9, 22.3, 22.7, 23.1, 23.4, 23.7, 24.0, 24.3, 24.6, 24.9, 25.2, 25.5, 25.8, 26.1, 26.3, 26.5, 26.7 } };

	String[] diasSemana = { "domingo", "segunda", "terca", "quarta", "quinta", "sexta", "sabado" };

	Scanner input = new Scanner(System.in);

	System.out.print("Digite um dia da semana para calcular a media diaria: ");
        
	String diaEscolhido = input.next();
        input.nextLine();
        
        diaEscolhido = Normalizer.normalize(diaEscolhido, Normalizer.Form.NFD).replaceAll("[^\\p{ASCII}]", "").toLowerCase();
        
	int indiceDia = -1; // 0 -> domingo

	for (int i = 0; i < diasSemana.length; i++) {
            
            if (diasSemana[i].equalsIgnoreCase(diaEscolhido)) {
                
                indiceDia = i;
                break;
            }
        }
        
        if (indiceDia == -1) {
            System.out.println("Dia da semana inválido.");
            
        } else {
            double soma = 0;
            
            for (int i = 0; i < 24; i++) {
                soma += temperaturas[indiceDia][i];
            }
            
            double mediaDia = soma / 24;
            System.out.println("Media de temperatura na/no " + diaEscolhido + ": " + String.format("%.2f", mediaDia));
        }

        System.out.println();
        
	System.out.print("Digite a hora para calcular a media da temperatura atraves dos dias: ");
	int hora = input.nextInt();
        input.nextLine();
        
        if (hora < 0 || hora >= 24) {
            System.out.println("Hora inválida.");
        } else {
            double soma = 0;
            
            for (int i = 0; i < 7; i++) {
                soma += temperaturas[i][hora];
            }
            
            double mediaHora = soma / 7;
            System.out.println("Media da temperatura as " + hora + " horas: " + String.format("%.2f", mediaHora));
        }
        
        input.close();

    }
}
