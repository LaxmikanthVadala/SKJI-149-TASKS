import java.util.Scanner;

public class TASK1_A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] notes = {100, 50, 10, 5, 2, 1};
        int count = 0;

        for (int i = 0; i < notes.length; i++) {
            count += N / notes[i];
            N %= notes[i];
        }

        System.out.println(count);
    }
}
