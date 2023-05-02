
package desafio04;
import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite um limite inferior: ");
        int inferior = entrada.nextInt();
        
        System.out.println("Digite um limite superior: ");
        int superior = entrada.nextInt();
        
        System.out.println("Intervalo crescente: ");
        
        for(int i = inferior; i <= superior; i++)
            System.out.println(i);
    }
}
