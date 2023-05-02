
package desafio04;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        int num1, num2;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite primeiro valor: ");
        num1 = entrada.nextInt();
        System.out.println("Digite segundo valor: ");
        num2 =  entrada.nextInt();
        
        
        if(num1 != num2){
            System.out.println("Quadrado do primeiro valor é: " +num1*2 + " Quadrado de segundo valor é: " +num2*2);
           
        } else {
            System.out.println("O cubo dos números é: " + num1*num1*num1);
        
        }
    }
}
