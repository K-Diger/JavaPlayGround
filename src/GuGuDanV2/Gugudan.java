package GuGuDanV2;


//요구사항
//
//        구구단에서 4단과 5단을 계산한 결과 값을 변수에 저장한 후 저장한 변수 값을 출력한다.
//        4단과 5단은 한번 결정하면 바뀌지 않는 값이다. 따라서 4단과 5단에 해당하는 상수 값으로 만든 후 프로그램을 구현한다.
//        예를 들어 4단은 4 곱하기 1 계산 결과 값을 i라는 변수에 저장하고, i라는 변수에 저장한 결과 값을 출력한다.
//        사용자가 입력한 숫자 값에 해당하는 단을 출력한다.
//        예를 들어 사용자가 4라는 숫자를 입력하면 4단 전체를 계산해 출력한다.


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

public class Gugudan {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int result = 0;

        System.out.print("출력하고자 하는 단을 입력해주세요 : ");
        int select = Integer.parseInt(br.readLine());

        if (select == 4) {
            for (int i = 1; i < 10; i++) {
                result = 4 * i;
                System.out.println("4 * " + i + " = " + result);
            }
        } else if (select == 5) {
            for (int i = 1; i < 10; i++) {
                result = 5 * i;
                System.out.println("5 * " + i + " = " + result);
            }
        } else {
            System.out.println("잘못 입력하셨습니다.");
        }

        functionalGuGuDanV2(select);

    }

    static void functionalGuGuDanV2(int select) {

        System.out.println("------------------------------------");

        if (select == 4) {
            IntStream.range(1, 10)
                    .forEach(e -> System.out.println("4 * " + e + " = " + 4 * e));
        } else if (select == 5) {
            IntStream.range(1, 10)
                    .forEach(e -> System.out.println("5 * " + e + " = " + 5 * e));
        } else {
            System.out.print("잘못 입력하셨습니다.");
        }

    }
}
