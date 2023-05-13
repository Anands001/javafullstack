package assignment4;

import java.util.Scanner;

public class WAP7 {
    public static void main(String[] args) {
        System.out.println("Enter Your String : ");
        String s= new Scanner(System.in).nextLine();
        if(checkUnique(s))
            System.out.println("Unique");
        else
            System.out.println("Not Unique");
    }
    public static boolean checkUnique(String s){
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<s.length();j++){
                if(s.charAt(i)==s.charAt(j)){
                    return false;
                }
            }
        }
        return true;
    }

}
