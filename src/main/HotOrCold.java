package main;



import java.util.Random;

public class HotOrCold {
	Random rand = new Random();
	int restChance = 0;
	
	public int RandomNum() {
		int i = rand.nextInt(75)+1;
		return i;
	}

	public void CheckInput(int input) {
		if(input < 1 || input > 75){
			throw new IllegalArgumentException();
		}
	}

	public String Compare(int i, int lastinput, int input) throws Exception {
		String s = null;
		if(input == i){
			s= "Congratz you got the right number!";
			System.out.print(s);
			throw new Exception();
		}	
		if(i-lastinput < i - input){
			s="Cold!You are getting Farther!";
		}
		if(i-lastinput > i - input){
			s="Hot!You are getting Closer!";
		}
		if(i -lastinput == i - input || i -lastinput == (i - input)*-1){
			s="Distance didn't change!";
		}
		return s;
	}

	public int RestChance() throws Exception {
		restChance++;
		if(restChance == 11){
			System.out.print("Your chances are over, sorry you lost");
			throw new Exception();
		}
		return restChance;
	}

}
