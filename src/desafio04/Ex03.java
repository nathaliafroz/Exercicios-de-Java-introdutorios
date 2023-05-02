
package desafio04;
import java.util.Scanner;
public class Ex03 {
    public static void main(String[] args) {
        int num;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite um valor: ");
        num = entrada.nextInt();
        
        if ((num % 3 == 0 && num % 5 != 00) || (num % 3 != 0 && num % 5 == 0)){
            System.out.println("O numero "+ num+ " é divisivel por 3 ou 5, mas não simultaneamente pelos dois.");
        } else {
            System.out.println("O numero não é divisivel por 3 ou 5, ou é divisivel simultaneamente pelos dois.");
               
        
        }
        
    
        
        
    }
}
