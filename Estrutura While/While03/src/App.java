import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int alcool = 0;
        int gasolina = 0;
        int diesel = 0;
        int comb = sc.nextInt();

        while (comb != 4){
            if (comb == 1)
                alcool += 1;
            else if (comb == 2)
                gasolina += 1;
            else if (comb == 3)
                diesel += 1;
            
            comb = sc.nextInt();
        
        }
        
        System.out.println("MUITO OBRIGADO");
        System.out.println("Álcool: " + alcool);
        System.out.println("Gasolina: " + gasolina);
        System.out.println("Diesel: " + diesel);
        
        sc.close();
    }
}