package assignment4;

import java.util.Scanner;

public class WAP6 {
    public static void main(String[] args) {
        System.out.println("Enter Your String : ");
        String s= new Scanner(System.in).nextLine();
        if(checkpangram(s)){
            System.out.println("Pangram");
        }else {
            System.out.println("Not a pangram");
        }
    }
    public static boolean checkpangram(String s){
        s=s.toUpperCase();
        s=s.replace(" ","");
        s=s.replace(".","");
        char str[]=s.toCharArray();
        int arr[]=new int[26];
        for(int i=0;i< str.length;i++){
            int index=str[i]-65;
            arr[index]=1;
        }
        for (int i=0;i< arr.length;i++){
            //System.out.println(arr[i]);
            if(arr[i]!=1){
                return false;
            }
        }
        return true;
    }

}
