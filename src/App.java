import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue<Integer> resultQueue = new LinkedList<Integer>();
        int index = 0;
        int result = 0;

        while (true) {
            System.out.println("첫번째 숫자를 입력하세요: ");
            int fristNum = sc.nextInt();

            System.out.println("두번째 숫자를 입력하세요: ");
            int secondNum = sc.nextInt();

            System.out.println("사칙연산 기호를 입력하세요: ");

            String operator = sc.next();

            if (operator == "/" && secondNum == 0) {
                System.out.println("나눗셈 연산에서 부모(두번째 정수)에 0이 입력될 수 없습니다.");
            } else {
                switch (operator) {
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
                System.out.println("결과: " + result);
            }
            resultQueue.add(result);
            sc.nextLine();
            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력시 삭제)");
            String remove = sc.nextLine();
            if (remove.equals("remove")) {
                resultQueue.poll();
            }
            System.out.println("가장 먼저 연산결과를 조회하시겠습니까? (inquiry입력 시 조회)");
            String inquiry = sc.nextLine();
            if(inquiry.equals("inquiry")) {
                System.out.println("저장된 결과: ");
                for(int i = 0; i < resultQueue.size(); i++){
                    int temp = resultQueue.poll();
                    System.out.println(temp + " ");
                    resultQueue.add(temp);
                }
                System.out.println();
            }
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            String answer = sc.next();
            if (answer.equals("exit")) {
                break;
            }
            index++;
            sc.close();
        }
    }
}

