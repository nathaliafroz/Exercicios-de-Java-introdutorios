
package desafio04;
import java.util.Scanner;
public class Ex10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double melhorTempo =  Double.MAX_VALUE;
        int voltaMelhorTempo = 0;
        double tempoTotal = 0;
        
        System.out.println("Digite o numero de voltas: ");
        int voltas = entrada.nextInt();
        
        for(int i = 1; i <= voltas; i++){
            System.out.println("Digite o tempo da "+ i + "º volta: ");
            double tempo = entrada.nextDouble();
            
            if(tempo < melhorTempo){
                melhorTempo = tempo;
                voltaMelhorTempo = i;            
            }
            
            tempoTotal += tempo;      
        }
        
        double tempoMedio = tempoTotal / voltas;
        
        System.out.println("Melhor tempo: " + melhorTempo);
        System.out.println("Melhor volta: " + voltaMelhorTempo);
        System.out.println("Tempo medio: " + tempoMedio);
    }
}
