import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        for(int c = 0; c < x; c++){
            if (c % 2 == 1)
                System.out.println(c);
        }

        sc.close();
    }
}
