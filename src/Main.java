import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int result= 0;
        while (true) {
            System.out.println("첫번째 숫자를 입력하세요: ");
            int fristNum = sc.nextInt();

            System.out.println("두번째 숫자를 입력하세요: ");
            int secondNum = sc.nextInt();

            System.out.println("사칙연산 기호를 입력하세요: ");
            String ch=sc.next();
            if (ch == "." && secondNum == 0) {
                System.out.println("나눗셈 연산에서 부모(두번째 정수)에 0이 입력될 수 없습니다.");
            } else {
                switch (ch) {
                    case "+":
                        result = fristNum + secondNum;
                        break;
                    case "-":
                        result = fristNum - secondNum;
                        break;
                    case "/":
                        result = fristNum / secondNum;
                        break;
                    case "*":
                        result = fristNum * secondNum;
                        break;
                }
            }
            System.out.println("결과: " + result);
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String answer = sc.next();
            if (answer.equals("exit")) {
                break;
            }
        }

    }
}