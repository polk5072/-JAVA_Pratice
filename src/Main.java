import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        기본적인 변수 선언

        int n = 15;     // 십진수 15
        int m = 015;    // 8진수 13
        int k = 0x15;   // 16진수 21
        int l = 0b0101; // 2진수 5

        long lk = 150l;
        String kor = null; // String 은 객체이므로 null이 할당가능하다.

        */


        /* 조건 연산자
        * 조건 연산자는 3개의 피연산자로 구성되어 삼항 연산자라고도 한다.
        * 형식 *

         condition ? opr2 : opr3





        int x = 5;
        int y = 3;
        int s = (x>y) ? 1:-2; // x > y 이므로 1이 s에 할당된다

        System.out.println(s); // 1이 출력됨
        */

        /* 비트 연산
        컴퓨터는 모든 정보를 0과 1값만 가지는 2진수로 저장한다.

        여기서 2진수의 한 자리를 비트 bit 라고 부르며, 8 비트를 1byte라고 한다.

        십진수 10을 한 바이트로 표현하면 00001010이다.
        */

        /*  byte flag; //byte의 8개의 각 비트는 8개의 센서 값을 각각 가리킨다.

        if(flag & 0b00001000 ==0) System.out.println("온도는 0도 이하");
        else System.out.println("온도는 0도 이상"); */

        /* 비트 시프트 연산
        byte a = 5; //0b00000101 로 저장됨
        byte b = (byte) (a << 2); // a 값을 왼쪽으로 2비트만큼 이동.
        // 즉 0b00000101 > 0b00010100
        // >> 와 <<는 1비트씩 시프트 할 때마다 나누기2 / 곱하기 2의 효과가 각각 나타난다.

        // 논리적 오른쪽 시프트
        byte x = 20; // 20 할당
        byte y = (byte)(x >>> 2);

        System.out.println(b); // 20이 출력됨
        System.out.println(y); // 0b00010100 -> 0b00000101  => 5

        //산술적 오른쪽 시프트
        byte k = (byte) 0xf8; // 1111 1000

        // 2의 보수 표현법 공부하기

         */





    }
}