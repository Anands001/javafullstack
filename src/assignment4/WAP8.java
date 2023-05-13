package assignment4;

import java.util.Scanner;

public class WAP8 {
    public static void main(String[] args) {
        System.out.println("Enter Your String : ");
        String a=new Scanner(System.in).nextLine();
        max(a);
    }
    public static void max(String s){
        char[] arr=s.toCharArray();
        char ch[]=new char[arr.length];
        int countarr[]=new int[arr.length];

        for(int i=0;i<arr.length;i++){
            int count=0;
            boolean dup=false;
            for(int j=0;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    count++;
                    if(arr[i]==ch[j]){
                        dup=true;
                    }
                }
            }
            if(!dup)
                ch[i]=arr[i];
            countarr[i]=count;
        }
        int max=findMax(countarr);
        for(int i=0;i<ch.length;i++){
            if(max==countarr[i]){
                if(ch[i]!=0)
                    System.out.print(ch[i]+"-"+max+"\n");
            }
        }
    }
    public static int findMax(int arr[]){
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        return max;
    }

}
