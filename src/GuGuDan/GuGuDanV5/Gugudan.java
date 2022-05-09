package GuGuDan.GuGuDanV5;

//요구사항
//
//        구구단 결과을 배열에 저장한 후 배열의 결과를 출력한다.


public class Gugudan {
    public static void main(String[] args) {
        int [] resultSet = new int[9];

        for (int i = 1; i < 10; i++) {
            resultSet[i-1] = 2 * i;

            System.out.println("2 * " + i + " = " + resultSet[i-1]);
        }

        for (int i = 0; i < resultSet.length; i++) {
            System.out.println(resultSet[i]);
        }
    }
}
