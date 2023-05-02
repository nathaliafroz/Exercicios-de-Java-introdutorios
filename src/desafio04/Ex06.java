
package desafio04;
import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        int pares = 0, impares = 0;
        
        Scanner entrada = new Scanner (System.in);
        
        for(int i = 1; i <=10; i++){
            System.out.println("Digite o "+i+" numero: ");        
            int num = entrada.nextInt();
                    
            if(num % 2 == 0){
                pares++;
            }else{
                impares++;
            }
        }
        System.out.println("Pares: "+pares + "\nImpares: " + impares);
        
    }
}
