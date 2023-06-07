package assignment3;

import java.util.Scanner;

class Guesser{
    int guessNum;
    Check c=new Check();
    int guessNum(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Guesser Kindly guess the Number :");
        guessNum=sc.nextInt();
        if(c.check(guessNum)){
            System.out.println("Enter Number between 1 to 10");
            Guesser g=new Guesser();
            return g.guessNum();
        }else {
            return guessNum;
        }
    }
}
class Player{
    int guessNum;
    Check c=new Check();
    int guessNum(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Player Kindly guess the Number :");
        guessNum=sc.nextInt();
        if(c.check(guessNum)){
            System.out.println("Enter Number between 1 to 10");
            Player p=new Player();
            return p.guessNum();
        }else {
            return guessNum;
        }

    }
}
class Check{
    boolean check(int n){
        if(n<=10 && n>0){
            return false;
        }else {
            return true;
        }
    }
}
class Umpire{
    int numFromGuesser;
    int numFromPlayer1;
    int numFromPlayer2;
    int numFromPlayer3;

    void collectNumFromGuesser(){
        Guesser g=new Guesser();
        numFromGuesser=g.guessNum();
    }
    void collectNumFromPlayers(){
        Player p1=new Player();
        Player p2=new Player();
        Player p3=new Player();
        numFromPlayer1=p1.guessNum();
        numFromPlayer2=p2.guessNum();
        numFromPlayer3=p3.guessNum();
    }
    void compare(){
        if(numFromGuesser==numFromPlayer1){
            if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3){
                System.out.println("All players won the Game");
            }else if(numFromGuesser==numFromPlayer2){
                System.out.println("Player 1 & 2 Won...");
            }else if(numFromGuesser==numFromPlayer3){
                System.out.println("Player 1 & 3 Won...");
            }else {
                System.out.println("Player 1 won the game");
            }
        }else if(numFromGuesser==numFromPlayer2){
            if(numFromGuesser==numFromPlayer3){
                System.out.println("Player 2 & 3 won the Game");
            }else {
                System.out.println("Player 2 won the game");
            }
        }else if(numFromGuesser==numFromPlayer3){
            System.out.println("Player 3 won the game");
        }else{
            System.out.println("Game Lost Try Again.");
        }
    }
}
public class GuesserGame {
    public static void main(String... args){
        Umpire u=new Umpire();
        u.collectNumFromGuesser();
        u.collectNumFromPlayers();
        u.compare();
    }
}
