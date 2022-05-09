package GuGuDan.GuGuDanV3;

// 요구사항
//
//        지금까지 2 ~ 5단까지 구현하기 위해 단순, 반복적인 작업이 많았다.
//        이 같은 단순, 반복적인 작업을 변수와 반복문을 활용해 제거하면서 6단과 7단을 구현한다.



public class Gugudan {
    public static void main(String[] args) {

        int i = 1;

        while (i < 10) {
            System.out.println("6 * " + i + " = " + 6 * i);
            i ++;
        }

        System.out.println("------------------------------");

        for (int j = 1; j < 10; j++) {
            System.out.println("7 * " + j + " = " + 7 * j);
        }
    }
}
