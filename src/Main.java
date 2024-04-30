import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("첫번째 숫자를 입력하세요: ");
        int fristNum = sc.nextInt();
        System.out.println("두번째 숫자를 입력하세요: ");
        int secondNum = sc.nextInt();

        System.out.println("사칙연산 기호를 입력하세요: ");
        char ch = sc.next().charAt(0);

    }
}