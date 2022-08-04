package isHappy;

import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.Function;

public class Sample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer input = scanner.nextInt();

        Function<Integer , Integer> checkIsHappy = integer -> {
            double sum = 10d;
            while (sum>9){
                 sum=0d;
                while (integer>0){
                    sum = sum + Math.pow(integer%10,2);
                    integer = integer/10;
                }
                integer= (int) sum;
                System.out.println(sum);
            }
            return (int) sum;
        };
        BiFunction < Function<Integer , Integer> , Integer , Boolean> isHappy =
                (methodInput,varInput) -> methodInput.apply(varInput) == 1;
        System.out.println(isHappy.apply(checkIsHappy, input));

//        Function <Function<Integer,Integer>,Boolean> ss = integerIntegerFunction -> ;

    }
}
