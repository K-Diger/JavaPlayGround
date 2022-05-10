package Calender.WarmmingUpV7;

//학습 목표
//
//        프로그램 완성도 높이기
//        복잡한 프로그램 구현 방법 고민해 보기
//
//        요구사항
//
//        월을 입력받는다.
//        1일의 요일을 입력받는다.
//        출력한다.
//
//        입력 및 출력 예시
//
//        년도를 입력하세요.
//        YEAR> 2017
//        달을 입력하세요.
//        MONTH> 3
//        첫번째 요일을 입력하세요. (SU, MO, WE, TH, FR, SA)
//        WEEKDAY> WE
//
//        <<2017년  3월>>l
//        SU MO TU WE TH FR SA
//        ---------------------
//        1  2  3  4
//        5  6  7  8  9 10 11
//        ...


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("년도를 입력하세요. ");

        int year = Integer.parseInt(br.readLine());

        System.out.println("달을 입력하세요. ");

        int month = Integer.parseInt(br.readLine());

        System.out.println("첫번째 요일을 입력하세요. (SU, MO, TU, WE, TH, FR, SA)");

        String week = br.readLine();


        int maxDays = 0;

        int weekToInteger = 0;

        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12:
                maxDays = 31;
            case 2:
                maxDays = 28;
            case 4, 6, 9, 11:
                maxDays = 30;
        }

        switch (week) {
            case "SU":
                weekToInteger = 0;
            case "MO":
                weekToInteger = 1;
            case "TU":
                weekToInteger = 2;
            case "WE":
                weekToInteger = 3;
            case "TH":
                weekToInteger = 4;
            case "FR":
                weekToInteger = 5;
            case "SA":
                weekToInteger = 6;
        }

        System.out.println("<<" + year + "년 " + month + "월>>");
        System.out.println("SU MO TU WE TH FR SA");
        System.out.println("---------------------");

        for (int i = 0; i < weekToInteger; i++) {
            System.out.print("   ");

        }


        for (int i = 7 - weekToInteger; i <= maxDays; i++) {

            if (i % 7 == 0) {
                System.out.println();
            }

            System.out.print(i + " ");

        }

    }
}