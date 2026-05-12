import java.util.Scanner;

public class SumaDosNumeros {
      
    public static void main(String [] args){
        int num1, num2, r;
        System.out.println("----suma de dos digitos");
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("ingresa el primer valor");
        num1 = scanner.nextInt();
        System.out.println("ingresa el segundo valor");
        num2 = scanner.nextInt();
        r= num1 + num2;
        System.out.println("el resultado es: "+ r);
        scanner.close();
    }
}
