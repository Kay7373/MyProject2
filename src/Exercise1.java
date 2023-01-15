import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int num1 = sc.nextInt();

        System.out.println("Введите второе число: ");
        int num2 = sc.nextInt();

        if (Math.abs(num1) > Math.abs(num2)) {
            int rez = num1 / 2;
            System.out.println("Первое число деленное на два: "+rez);
        }
        else {
            System.out.println("Второе число больше первого по абсолютной величине");
        }
    }
}
