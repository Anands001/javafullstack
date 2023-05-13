package assignment4;

import java.util.Scanner;

public class WAP1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = input.nextLine();
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            if (result.indexOf(str.charAt(i)) == -1) {
                result += str.charAt(i);
            }
        }

        System.out.println("Original string: " + str);
        System.out.println("String after removing duplicates: " + result);
    }
}
