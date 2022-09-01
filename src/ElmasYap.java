import java.util.Scanner;

public class ElmasYap {
    public static void main(String[] args) {
        Scanner girdi= new Scanner(System.in);
        int n= girdi.nextInt();

        for (int x = 1; x <= n; x++) {
            for (int i = 0; i < n-x; i++) {
                System.out.print(" ");
            }
            for (int k = 0; k < (2*x-1); k++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}
