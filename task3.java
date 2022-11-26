
//Реализовать простой калькулятор (операции + - / * )
import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner numScanner = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        double a = numScanner.nextDouble();

        System.out.println("Введите знак операции (+, - , / или *): ");
        Scanner actionScanner = new Scanner(System.in);
        String action = actionScanner.nextLine();

        System.out.println("Введите второе число: ");
        double b = numScanner.nextDouble();

        double res = 0;
        numScanner.close();
        actionScanner.close();

        if (action.equals("+")) {
            res = a + b;
            System.out.println("Результат: " + res);
        } else if (action.equals("-")) {
            res = a - b;
            System.out.println("Результат: " + res);
        } else if (action.equals("*")) {
            res = a * b;
            System.out.println("Результат: " + res);
        } else if (action.equals("/")) {
            res = a / b;
            System.out.println("Результат: " + res);
        } else
            System.out.println("Ошибка ввода");

    }
}
