import java.util.Scanner;
public class exception_practice {
    // 예외처리
     public static void main(String[] args) {

         Scanner scanner = new Scanner(System.in);

         int dividend; // 나뉨수
         int divisor; // 나눗수

         //Exception in thread "main" java.lang.ArithmeticException: / by zero
         //at Main.main(Main.java:35)
          // 0으로 나누므로 예외처리가 된다.

         //이를 try catch 문을 사용하여 해결해보면

         while(true) {
             System.out.print("나뉨수를 입력하시오 : ");
             dividend = scanner.nextInt();

             System.out.print("나눗수를 입력하시오 : ");
             divisor = scanner.nextInt();

             try {
                 System.out.println(dividend + "를 " + divisor + "로 나눈 몫은 " + dividend / divisor + "입니다");
                 break;
             }
             catch (ArithmeticException e){
                 System.out.println("0으로는 나눌 수 없습니다. 다시 입력하세요");
             } finally {
                 System.out.println("프로그램이 종료됩니다.");
             }
         }
         scanner.close();

      //  위와 같이 try - catch 문을 사용하여 예외 상황을 처리할 수 있다
  }
}
