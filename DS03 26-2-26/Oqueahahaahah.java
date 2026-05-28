package oqueahahaahah;
import java.util.Scanner;
public class Oqueahahaahah {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Coloque o primeiro número: ");
        int a = sc.nextInt();
        
        System.out.println("Coloque o segundo número: ");
        int b = sc.nextInt();
        
        System.out.println("Coloque a operação com o símbolo representante dela (+, -, *, /, %): ");
        char operation = sc.next().charAt(0);
        
        if (operation == '+') {
            System.out.println(a + b);
        }
        else if (operation == '-') {
            System.out.println(a - b);
        }
        if (operation == '*') {
            System.out.println(a * b);
        }
        else if (operation == '/'){
            System.out.println(a / b);
        }
        if (operation == '%') {
            System.out.println(a % b);
        }
        
        sc.close();
    }
    
}
