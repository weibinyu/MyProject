package main;

import java.util.Scanner;

public class Game {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[]args) throws Exception{
		HotOrCold h = new HotOrCold();
		int random = h.RandomNum();
		System.out.print("Enter your first integer: ");
		int lastInput = scan.nextInt();
		while(true){
			System.out.print(random + " Enter a integer: ");
			int input = scan.nextInt();
			h.CheckInput(input);
			System.out.println(h.Compare(random, lastInput, input));
			lastInput = input;
			h.RestChance();
		}
	}
}