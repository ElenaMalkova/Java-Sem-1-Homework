
// Вывести все простые числа от 1 до 1000
import java.util.ArrayList;

public class task2 {
    public static void main(String[] args) {
        ArrayList<Integer> primeNums = new ArrayList<Integer>();
        primeNums.add(2);
        for (int i = 2; i <= 1000; i++) {
            for (int j = 2; j <= i; j++) {
                if (i % j == 0) {
                    break;
                }
                if (j == i / 2) {
                    primeNums.add(i);
                    break;
                } else
                    continue;

            }
        }
        System.out.println("Простые числа от 1 до 1000: " + primeNums);
    }
}
