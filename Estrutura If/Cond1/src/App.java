import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int hi = sc.nextInt();
        int hf = sc.nextInt();

        int duracao;
        if (hi < hf)
            duracao = hf - hi;
        else 
            duracao = 24 - hi + hf;

        System.out.println("O JOGO DUROU " + duracao + " HORAS.");
        
        sc.close();
    }
}
