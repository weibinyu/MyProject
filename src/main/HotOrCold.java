package main;



import java.util.Random;

public class HotOrCold {
	Random rand = new Random();
	
	public int RandomNum() {
		int i = rand.nextInt(75)+1;
		if(i < 1 || i> 75)
			throw new IllegalArgumentException();
		
		return i;
	}

	public void CheckInput(int input) {
		if(input < 1 || input > 75){
			throw new IllegalArgumentException();
		}
		else{
			return;
		}
	}

	public String Compare(int i, int lastinput, int input) {
		String s = null;
		if(input == i){
			s= "Congratz you got the right number!";
			return s;
			}	
		if(i-lastinput < i - input){
			s="Cold!You are getting Farther!";
		}
		if(i-lastinput > i - input){
			s="Hot!You are getting Closer!";
		}
		return s;
	}

	public Object RestChance() {
		return null;
	}

}
