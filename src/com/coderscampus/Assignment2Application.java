package com.coderscampus;
import java.util.Scanner;
public class Assignment2Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int answer = 1 + (int)(Math.random() * 100);
		System.out.println(answer);
        Scanner sc = new Scanner(System.in);
        boolean flag = false;
        System.out.println("Pick a number between 1 and 100");
        for (int i=0; i<5; i++) {
            if (sc.hasNextInt()) {
                int guess = sc.nextInt();
                if (guess < answer && guess >= 1 && guess <= 100 && i != 4) {
                    System.out.println("Plese pick a higher number");
                }
                if (guess < 1 || guess > 100) {
                    System.out.println("Your guess is not between 1 and 100, please try again");
                    i--;
                } 
                if (guess > answer && guess >= 1 && guess <= 100 && i != 4) {
                    System.out.println("Please pick a lower number");
                }
                if (guess == answer) {
                    System.out.println("You win!");
                    flag = true;
                    break;
                }
            } else {
                System.out.println("incorrect input, try again");
                i--;
                sc.next();
            }
        }
        if (!flag) {
            System.out.print("You lose, the number to guess was " + answer);
        }
        sc.close();
	}

}
