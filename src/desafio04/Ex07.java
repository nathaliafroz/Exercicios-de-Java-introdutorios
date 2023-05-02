
package desafio04;
import java.util.Scanner;
public class Ex07 {
    public static void main(String[] args) {
        int num;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite um numero inteiro: ");
        num = entrada.nextInt();
        
        System.out.println("Em ordem decrecente");
        
        for(int i = num; i >= 0; i--){
            System.out.println(i);
        
        }
        
    }
}
