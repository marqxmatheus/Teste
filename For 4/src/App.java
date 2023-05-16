import java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        for(int i = 0; i < n; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            if (b != 0){
                double div = (double) a / b;
                System.out.printf("%.1f%n", div);
            }
            else
                System.out.println("divisão impossivel");
        }
        sc.close();
    }
}
