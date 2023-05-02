
package desafio04;
import java.util.Scanner;
public class Ex04 {
    public static void main(String[] args) {
        int idade;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Jogador informe sua idade para saber em qual categoria pertence: ");
        idade = entrada.nextInt();
        
        if(idade >= 5 && idade <=7 ){
            System.out.println("Infantil A");
        }else if(idade >= 8  && idade <= 10 ){
            System.out.println("Infantil B");
        }else if(idade >=11  && idade <=13 ){
            System.out.println("Juvenil A");
        }else if(idade >= 14  && idade <= 17){
            System.out.println("Juvenil B");
        }else{
            System.out.println("Você ainda não pertence a uma categoria.");
        }
        
    
    }
    
    
    
    
}
