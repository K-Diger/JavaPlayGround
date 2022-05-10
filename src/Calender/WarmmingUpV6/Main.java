package Calender.WarmmingUpV6;

//학습 목표
//
//        if를 사용한다.
//        반복문을 사용한다.
//
//        요구사항
//
//        월을 입력하면 해당월의 달력을 출력한다.
//        달력은 모양은 1단계에서 작성한 모양으로 만든다.
//        1일은 일요일로 정해도 무방하다.
//        -1을 입력받기 전까지 반복 입력받는다.
//        프롬프트를 출력한다.
//
//        입력 및 출력 예시
//
//        월을 입력하세요.
//        > 3
//        일 월 화 수 목 금 토
//        --------------------
//        1  2  3  4  5  6  7
//        8  9 10 11 12 13 14
//        15 16 17 18 19 20 21
//        22 23 24 25 26 27 28
//        29 30 31
//        월을 입력하세요.
//        > -1
//        Bye~


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
                System.out.println("Bye ~!");
                break;
            }

            switch (month) {
                case 1, 3, 5, 7, 8, 10, 12:
                    System.out.println("일 월 화 수 목 금 토");
                    System.out.println("--------------------");
                    System.out.println("1  2  3  4  5  6  7");
                    System.out.println("8 9 10 11 12 13 14");
                    System.out.println("15 16 17 18 19 20 21");
                    System.out.println("22 23 24 25 26 27 28");
                    System.out.println("29 30 31");
                    break;
                case 2:
                    System.out.println("일 월 화 수 목 금 토");
                    System.out.println("--------------------");
                    System.out.println("1  2  3  4  5  6  7");
                    System.out.println("8 9 10 11 12 13 14");
                    System.out.println("15 16 17 18 19 20 21");
                    System.out.println("22 23 24 25 26 27 28");
                    break;
                case 4, 6, 9, 11:
                    System.out.println("일 월 화 수 목 금 토");
                    System.out.println("--------------------");
                    System.out.println("1  2  3  4  5  6  7");
                    System.out.println("8 9 10 11 12 13 14");
                    System.out.println("15 16 17 18 19 20 21");
                    System.out.println("22 23 24 25 26 27 28");
                    System.out.println("29 30");
                    break;
            }
        }
    }
}
