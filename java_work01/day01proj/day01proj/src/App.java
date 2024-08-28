// Servlet&JSP는 Eclipse에서 하는것이 편함.
// JAVA 기본이나 Srping boot는 VS-Code도 편함
// - VS-Code가 가볍고 편하고 많은 확장기능이 있기 때문

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // 변수명 초기화는 변수를 선언할 때 초기값을 넣어 주는것
        // 초기값 = 리터럴
        // 변수 선언 : 타입 변수명 = 초기값;
        // 타입 은 기본 타입(8개), 참조 타입
         
        /*
        // 기본 타입:
            
            논리형 boolean
            실수형 float, double (부동 소수점을 갖음, 기본형: double)   // ex) 3.14, 3.14f(double)
            정수형 byte, short, int, long (정수형의 기본형: int)    // ex) 356, 356L(long)
            문자형 char (문자형도 정수형에 속함 -> 문자는 아스키코드이기 때문)
            +++++String은 문자열을 다루는 타입으로 기본형처럼 쓰이는 참조형(클래스)
         */
        // 키보드 입력
        Scanner scan = new Scanner(System.in);

        String greeting = "안녕 세계";
        System.out.print("이름입력: ");
        String name = scan.next();

        System.out.println(greeting);
    }
}
