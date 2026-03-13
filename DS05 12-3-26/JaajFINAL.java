package jaaj;
import java.util.Scanner;
public class JaajFINAL {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] a = new int[31];   
        for (int i = 0; i <= a.length; i++)
        {
            System.out.println("Coloque a temperatura do dia " + i + ": ");
            int n = scanner.nextInt();
            a[i] = n;
        }
        for (int i = 0; i <= a.length; i++){
            System.out.print(a[i] + " ");
        }
        scanner.close();
    }   
}