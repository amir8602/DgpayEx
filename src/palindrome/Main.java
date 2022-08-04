package palindrome;

import java.util.Scanner;
//palindrome
// aabbaa ------> is palindrome
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(checkPalindrome(input));
        scanner.close();

    }
// this method check string for to be palindrome
    public static boolean checkPalindrome(String input){
        Boolean check = true;
        char[] characters = input.toCharArray();
        for (int i = 0; i < characters.length/2; i++) {
            if(characters[i]!=characters[characters.length-1-i]){
                check =false;
                break;
            }
        }
        if (check)
            return true;
        else
            return false;
    }
}
