
import java.util.Scanner;

public class MainRational {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rational ps1 = new Rational(5, 10);
        Rational ps2 = new Rational(5, 10);
        Menu_exercise5 mn = new Menu_exercise5();
        int a;
        while (true) {
            System.out.println("Menu: ");
            System.out.println("--------------------------------------------------");
            System.out.println("1. add");
            System.out.println("2. subtract");
            System.out.println("3. mutiple:");

            System.out.println("4. devide: ");
            System.out.println("input number: ");
            a = sc.nextInt();
            switch (a) {
                case 1:
                    mn.add(ps2, ps1);
                    break;
                case 2:
                    mn.subtract(ps2, ps1);
                    break;

                case 3:
                    mn.mutiple(ps2, ps1);
                    break;

                case 4:
                    mn.device(ps2, ps1);
                    break;

                default:
                    break;
            }

        }

    }
}