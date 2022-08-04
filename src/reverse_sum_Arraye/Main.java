package reverse_sum_Arraye;

import java.util.Scanner;

public class Main {
// reverse arrays and sum them then reverse result
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer count = scanner.nextInt();
        Integer count1 = scanner.nextInt();

        Integer [] first = new Integer[count];
        Integer [] second = new Integer[count1];


        for (int i = 0; i < count; i++) {
            first[i] = scanner.nextInt();
        }
        for (int i = 0; i < count1; i++) {
            second[i] = scanner.nextInt();
        }

        Integer  result =reverse_sum_arraye(first , second);
        System.out.println(result);

    }


    public static Integer reverse_sum_arraye(Integer[] first , Integer[]second){
        String firstToString="";
        String secondToString="";
        char [] chars1 , chars2;
        for (int i = 0; i < first.length; i++) {
            firstToString = firstToString.concat(String.valueOf(first[i]));
        }
        for (int i = 0; i < second.length; i++) {
            secondToString = secondToString.concat(String.valueOf(second[i]));
        }
        chars1 = firstToString.toCharArray();
        chars2 = secondToString.toCharArray();

        firstToString="";
        for (int i = 0; i < chars1.length; i++) {
            firstToString = firstToString.concat(String.valueOf(chars1[chars1.length-1-i]));
        }
        secondToString="";
        for (int i = 0; i < chars2.length; i++) {
            secondToString = secondToString.concat(String.valueOf(chars2[chars2.length-1-i]));
        }

        Integer parseIntFirst = Integer.parseInt(firstToString);
        Integer parseIntSecond = Integer.parseInt(secondToString);
        Integer result = parseIntFirst+parseIntSecond;
        String resultToString = result + "";
        char[] chars3 = resultToString.toCharArray();
        resultToString="";
        for (int i = 0; i < chars3.length; i++) {
            resultToString = resultToString.concat(String.valueOf(chars3[chars3.length-1-i]));
        }
        result = Integer.parseInt(resultToString);
        return result;


    }


}
