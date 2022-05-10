package Calender.WarmmingUpV5;


//학습 목표
//
//        if를 사용한다.
//        반복문을 사용한다.
//
//        요구사항
//
//        전 단계와 비슷하게 반복입력을 받을 수 있게 구현한다.
//        입력하는 곳 앞에 프롬프트를 출력한다.
//        -1일 입력받을 경우 프로그램을 종료한다.
//
//        입력 및 출력 예시
//
//        월을 입력하세요.
//        > 3
//        3월은 31일까지 있습니다.
//        월을 입력하세요.
//        > 2
//        2월은 28일까지 있습니다.
//        월을 입력하세요.
//        > -1
//        Have a nice day!


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("반복횟수를 입력하세요.");

        int iter = Integer.parseInt(br.readLine());

        for (int i = 0; i < iter; i++) {

            System.out.println("월을 입력하세요.");

            int month = Integer.parseInt(br.readLine());

            if (month == -1) {
                System.out.println("Have a nice day!");
                break;
            }

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
}
