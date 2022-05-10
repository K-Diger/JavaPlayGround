package Calender.WarmmingUpV3;

//학습목표
//
//        변수를 사용할 수 있다.
//        if 를 사용할 수 있다.
//        배열을 사용해 본다.
//
//        요구사항
//
//        월을 입력하면 그 달이 몇일로 구성되어 있는지 출력하는 프로그램 작성하기
//        입력결과 예시
//
//        달을 입력하세요.
//        3 (엔터)
//        3월은 31일까지 있습니다.


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("달을 입력하세요.");

        int month = Integer.parseInt(br.readLine());

        switch (month) {
            case 1:
                System.out.println("1월은 31일까지 있습니다.");
                break;
            case 2:
                System.out.println("2월은 28일까지 있습니다.");
                break;
            case 3:
                System.out.println("3월은 31일까지 있습니다.");
                break;
            case 4:
                System.out.println("4월은 30일까지 있습니다.");
                break;
            case 5:
                System.out.println("5월은 31일까지 있습니다.");
                break;
            case 6:
                System.out.println("6월은 30일까지 있습니다.");
                break;
            case 7:
                System.out.println("7월은 31일까지 있습니다.");
                break;
            case 8:
                System.out.println("8월은 31일까지 있습니다.");
                break;
            case 9:
                System.out.println("9월은 30일까지 있습니다.");
                break;
            case 10:
                System.out.println("10월은 31일까지 있습니다.");
                break;
            case 11:
                System.out.println("11월은 30일까지 있습니다.");
                break;
            case 12:
                System.out.println("12월은 31일까지 있습니다.");
                break;

        }

    }
}
