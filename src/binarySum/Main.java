package binarySum;
import java.util.Scanner;

public class Main {
    //cast one integer to matrix of zero and one
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        Integer[] integers = new Integer[input.length()];
        for (int i = 0; i < input.length(); i++) {
            integers[i] = Integer.parseInt(input.charAt(i) + "");
        }
        Integer maximum = max(integers);
        System.out.println(maximum);
        Integer[][] matrix = new Integer[maximum][integers.length];
        for (int i = 0; i < integers.length; i++) {
            matrix[0][i] = integers[i];
        }

        Integer sum = 0;
        for (int j = 0; j < integers.length; j++) {
            for (int i = 0; i < maximum; i++) {
                if (sum < integers[j]) {
                    matrix[i][j] = 1;
                    sum++;
                } else {
                    matrix[i][j] = 0;
                }
            }
            sum = 0;
        }

//        for (int i = 0; i < maximum; i++) {
//            for (int j = 0; j < integers.length; j++) {
//                if(matrix[i][j]==0){
//                    matrix[i][j]=null;
//                }else{
//                    break;
//                }
//            }
//        }


        Integer [] integers1 = new Integer[maximum];

        for (int i = 0; i < maximum; i++) {
            integers1[i]=0;
            for (int j = 0; j < integers.length; j++) {
                integers1[i] = integers1[i]*10+matrix[i][j];
            }
        }


        for (int i = 0; i <integers1.length; i++) {
            System.out.println(integers1[i]);
        }

//        for (int i = 0; i < maximum; i++) {
//            for (int j = 0; j < integers.length; j++) {
//                System.out.printf(matrix[i][j] + "   ");
//            }
//            System.out.println();
//        }
        scanner.close();

    }
    public static Integer max(Integer[] integers) {
        Integer maximum = 0;
        for (int i = 0; i < integers.length; i++) {
            if (integers[i] > maximum)
                maximum = integers[i];
        }
        return maximum;
    }

}
