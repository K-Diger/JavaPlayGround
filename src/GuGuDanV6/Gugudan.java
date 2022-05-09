package GuGuDanV6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//요구사항
//
//        구구단을 구현하기 위해 반복적으로 발생하는 부분이 있다.
//        반복적으로 발생하는 부분을 메소드를 활용해 반복되는 부분을 줄인다.

public class Gugudan {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int [] resultByMethod = calculate(Integer.parseInt(br.readLine()));
        printGuGuDan(resultByMethod);
    }

    public static int[] calculate(int dan) {
        int[] result = new int[9];

        for (int i = 1; i < 10; i++) {
            result[i-1] = dan * i;
        }

        return result;
    }

    public static void printGuGuDan(int[] result) {

        for (int i = 0; i < 9; i++) {
            System.out.println(result[i]);
        }
    }
}
