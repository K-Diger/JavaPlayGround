package Calender.WarmmingUpV2;

//학습목표
//
//        변수를 사용할 수 있다.
//        Scanner와 println()를 사용할 수 있다.
//        이해가 안 되는 내용도 넘어갈 수 있다.
//
//        요구사항
//
//        키보드로 입력받은 두 숫자의 합을 구한다.
//        입력 및 출력 예시
//
//        두 수를 입력하세요.
//        5 10 (엔터)
//        두 수의 합은 15입니다.
//


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("두 수를 입력하세요.");

        String[] splitNumber = br.readLine().split(" ");

        int firstNumber = Integer.parseInt(splitNumber[0]);
        int secondNumber = Integer.parseInt(splitNumber[1]);

        System.out.println("두 수의 합은 " + (firstNumber + secondNumber) + "입니다.");

    }
}
