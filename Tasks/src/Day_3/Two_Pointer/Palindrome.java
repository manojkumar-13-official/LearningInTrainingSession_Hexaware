package Day_3.Two_Pointer;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine().trim();
        if(isPalindrome(s)){
            System.out.println("The Given String is a Palindrome");
        }else{
            System.out.println("The Given String is not a Palindrome");
        }
    }

    private static boolean isPalindrome(String s) {
        int st = 0, end = s.length()-1;
        while(st < end){
            if(s.charAt(st)!=s.charAt(end)){
                return false;
            }
            st++;
            end--;
        }
        return true;
    }
}
