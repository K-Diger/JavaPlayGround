package GuGuDan.GuGuDanFinal;

//         최종 요구사항 1
//
//        사용자가 입력한 값에 따라 크기가 다른 구구단을 계산해 출력한다.
//        예를 들어 사용자가 8을 입력하면 팔팔단, 19를 입력하면 십구십구단(2 * 1에서 19 * 19)을 계산해 출력한다.
//        이 요구사항은 앞의 실습을 소화했으면 구현할 수 있기 때문에 생략한다.
//
//        최종 요구사항 2
//
//        사용자가 입력한 값에 따라 크기가 다른 구구단을 계산해 출력한다.
//        예를 들어 사용자가 "8,7"과 같은 문자열을 입력하면 팔칠단을 구현한다.
//        팔칠단은 2 * 1 ... 2 * 7, 3 * 1 ... 3 * 7, ... , 8 * 1 ... 8 * 7 까지 구현하는 것을 의미한다.


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String inputValue = br.readLine();

        int[][] finalResult;


        if (inputValue.length() != 1) {

            String[] spitedValue = inputValue.split(",");

            int first = Integer.parseInt(spitedValue[0]);
            int second = Integer.parseInt(spitedValue[1]);

            GuGuDan guGuDans = new GuGuDan();

            finalResult = guGuDans.inputIsTwoCalculate(first, second);

            Arrays.stream(finalResult)
                    .flatMapToInt(Arrays::stream)
                    .forEach(System.out::println);
        }

        //숫자를 한개 입력했을 때
        else if (inputValue.length() == 1) {
            GuGuDan guGuDan = new GuGuDan();

            finalResult = guGuDan.inputIsOneCalculate(Integer.parseInt(inputValue));

            Arrays.stream(finalResult)
                    .flatMapToInt(Arrays::stream)
                    .forEach(System.out::println);
        }
    }
}

class GuGuDan {

    public int[][] inputIsOneCalculate(int dan) {

        int[][] result = new int[dan-1][dan];
        
        if (dan >= 2 && dan <= 9) {

            //2단부터 입력한 단까지
            for (int i = 2; i <= dan; i++) {

                //입력한 수까지의 구구단
                for (int j = 1; j <= dan; j++) {
                    
                    //배열의 인덱스에 맞게 해주기 위하여 반복자를 조정한다.
                    result[i-2][j-1] = i * j;
                }
            }
        }
        return result;
    }


    public int[][] inputIsTwoCalculate(int dan, int max) {

        int[][] result = new int[dan-1][max];

        if (dan >= 2 && dan <= 9) {

            //2단부터 입력한 단까지
            for (int i = 2; i <= dan; i++) {

                //입력한 수까지의 구구단
                for (int j = 1; j <= max; j++) {

                    //배열의 인덱스에 맞게 해주기 위하여 반복자를 조정한다.
                    result[i-2][j-1] = i * j;
                }
            }
        }
        return result;
    }
    
}
