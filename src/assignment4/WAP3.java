package assignment4;

import java.util.Scanner;

public class WAP3 {
    public static void main(String[] args) {
        System.out.println("Enter Your String : ");
        String a=new Scanner(System.in).nextLine();
        boolean sol=checkPalindrome(a);
        if(sol){
            System.out.println("palindrome");
        }else {
            System.out.println("Not a palindrome");
        }
    }
    public static boolean checkPalindrome(String a){
        StringBuilder str=new StringBuilder("");
        for(int i=a.length()-1;i>=0;i--){
            str.append(a.charAt(i));
        }
        for (int i=0;i<a.length();i++){
            if(str.charAt(i)!=a.charAt(i)){
                return false;
            }
        }
        return true;
    }

}
