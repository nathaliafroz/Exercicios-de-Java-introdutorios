
package desafio04;
import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        int numero, qtd = 0, pares = 0, soma = 0, maior = Integer.MIN_VALUE, menor = Integer.MAX_VALUE;
        
        Scanner entrada = new Scanner(System.in);
        
        for(;;){
            System.out.println("Digite um numero ou '0' para parar: ");
            numero = entrada.nextInt();
            
            if(numero == 0){
                break;
            }
             qtd++;
             
             if(numero % 2 == 0){
                 pares++;
             }
             
             soma+= numero;
             
             if(numero > maior){
                 maior = numero;
             }
             if(numero < menor){
                 menor = numero;
             
             }
            
        }
        
        System.out.println("Quantidade de numeros lidos: " +qtd);
        System.out.println("Quantidade de pares: " +pares);
        System.out.println("Somatória dos números: " + soma);
        
        if (qtd > 0){
            double media = (double)soma / qtd;
            System.out.println("Média dos numeros: " +media);
        } else{
            System.out.println("Não foi digitado nenhum numero");
               
        }
        
        System.out.println("Maior numero digitado: " + maior);
        System.out.println("Menor numero digitado: " + menor);
        
    }
    
}
