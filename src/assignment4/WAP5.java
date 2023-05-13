package assignment4;

import java.util.Scanner;

public class WAP5 {
    public static void main(String[] args) {
        System.out.println("Enter Your first String : ");
        String a=new Scanner(System.in).nextLine();
        System.out.println("Enter Your second String : ");
        String b=new Scanner(System.in).nextLine();
        boolean x=checkAnagaram(a,b);
        if(x)
            System.out.println("Anagram");
        else
            System.out.println("Not a Anagram");
    }
    public static boolean checkAnagaram(String a,String b){
        if(a.length()==b.length()){
            a=a.toLowerCase();
            b=b.toLowerCase();
            char arr1[]=a.toCharArray();
            char arr2[]=b.toCharArray();
            for(int i=0;i<arr1.length;i++){
                for (int j=0;j<i;j++){
                    if(arr1[i]<arr1[j]){
                        char temp=arr1[i];
                        arr1[i]=arr1[j];
                        arr1[j]=temp;
                    }
                    if(arr2[i]<arr2[j]){
                        char temp=arr2[i];
                        arr2[i]=arr2[j];
                        arr2[j]=temp;
                    }
                }
            }
            //System.out.println(Arrays.toString(arr1));
            //System.out.println(Arrays.toString(arr2));
            for(int i=0;i< arr1.length;i++){
                if(arr1[i]!=arr2[i]){
                    return false;
                }
            }
            return true;

        }else{
            return false;
        }


    }

}
