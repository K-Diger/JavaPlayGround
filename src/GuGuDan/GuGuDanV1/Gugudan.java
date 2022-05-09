package GuGuDan.GuGuDanV1;


//구구단 2단 3단 출력하기

import java.util.stream.IntStream;

public class Gugudan {

    public static void main(String[] args) {
        
        
        // 2단 출력
        for (int i = 1; i < 10; i++) {
            System.out.println("2 * " + i + " = " + 2*i);
        }

        // 3단 출력
        for (int i = 1; i < 10; i++) {
            System.out.println("3 * " + i + " = " + 3*i);
        }

        //함수형 프로그래밍으로 2단 출력
        IntStream.range(1, 10).forEach(e -> System.out.println("2 * " + e + " = " + 2 * e));

        //함수형 프로그래밍으로 3단 출력
        IntStream.range(1, 10).forEach(e -> System.out.println("3 * " + e + " = " + 3 * e));

    }
}
