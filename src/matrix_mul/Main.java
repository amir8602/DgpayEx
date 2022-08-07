package matrix_mul;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("row1 : ");
        Integer row1 = scanner.nextInt();
        System.out.println("column1 : ");
        Integer column1 = scanner.nextInt();

        System.out.println("row2 : ");
        Integer row2 = scanner.nextInt();
        System.out.println("column2 : ");
        Integer column2 = scanner.nextInt();

        if (column2.equals(row2)) {
            Integer[][] matrix1 = new Integer[row1][column1];
            Integer[][] matrix2 = new Integer[row2][column2];
            Integer[][] result = new Integer[row1][column2];

            System.out.println("matrix1 : ");
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < column2; j++) {
                    matrix1[i][j] = scanner.nextInt();
                }
            }
            System.out.println("matrix2 : ");
            for (int i = 0; i < row2; i++) {
                for (int j = 0; j < column2; j++) {
                    matrix2[i][j] = scanner.nextInt();
                }
            }


            Integer sum =0;
            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < column2; j++) {
                    for (int k = 0; k < row2; k++) {

                        sum = sum + (matrix1[i][k] * matrix2[k][j]);
                    }
                    result[i][j] = sum;
                    sum = 0;
                }
            }





            for (int i = 0; i < row1; i++) {
                for (int j = 0; j < column2; j++) {
                    System.out.println(result[i][j]);
                }
            }
        } else {
            System.out.println("oops!!!");
        }



    }
}
