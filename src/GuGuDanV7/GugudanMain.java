package GuGuDanV7;

//요구사항
//
//        main() 메소드는 프로그램을 시작하는 역할을 한다.
//        프로그램을 시작하는 클래스와 구구단을 구현하는 클래스를 분리한다.


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GugudanMain {
    public static void main(String[] args) throws IOException {

        Gugudan objectGuGuDan = new Gugudan();

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int [] finalResult = objectGuGuDan.calculate(Integer.parseInt(br.readLine()));

        objectGuGuDan.print(finalResult);
    }
}

class Gugudan {

    public int[] calculate(int dan) {
        int[] result = new int[9];

        for (int i = 1; i < 10; i++) {
            result[i - 1] = dan * i;
        }

        return result;
    }

    public void print(int[] result) {
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

}
