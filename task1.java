
//Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int num = iScanner.nextInt();

        int sum = 0;
        int factorial = 1;
        for (int i = 1; i <= num; i++) {
            sum += i;
            factorial *= i;
        }
        iScanner.close();
        System.out.printf("Cумма чисел от 1 до " + num + ": " + sum);
        System.out.printf("\nПроизведение чисел от 1 до " + num + ": " + factorial);

    }
}
