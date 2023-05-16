import	java.util.Locale;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int codigo = sc.nextInt();
        int quanti = sc.nextInt();
        
        
        double tot;
        if (codigo == 1)
            tot = quanti * 4.0;
        else if (codigo == 2)
            tot = quanti * 4.5;
        else if (codigo == 3)
            tot = quanti * 5.0;
        else if (codigo == 4)
            tot = quanti * 2.0;
        else
            tot = quanti * 1.5;
        
        System.out.printf("Total: R$ %.2f%n", tot);

        sc.close();
    }
}
