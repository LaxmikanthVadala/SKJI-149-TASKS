import java.util.Scanner;

public class TASK2_B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long number = sc.nextLong();
        int count = 0;

        while (number > 0) {
            if (number % 10 == 4) {
                count++;
            }
            number /= 10;
        }

        System.out.println(count);
    }
}
