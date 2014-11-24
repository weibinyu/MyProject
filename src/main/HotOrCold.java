package main;



import java.util.Random;

public class HotOrCold {
	Random rand = new Random();
	int restChance = 0;
	
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
	}

	public String Compare(int random, int lastinput, int input) throws Exception {
		String s = null;
		if(input == random){
			s= "Congratz you got the right number!";
			System.out.print(s);
			throw new Exception();
		}
		input=random - input;
		lastinput = random - lastinput;
		int i = 0, l=0;
		if(input > 0){
			for(int x = input;x > 0; x--)
				i++;
		}
		else if(input < 0){
			for(int x = input;x < 0; x++)
				i++;
		}
		if(lastinput < 0){
			for(int x = lastinput;x < 0; x++)
				l++;
		}
		else if(lastinput > 0){
			for(int x = lastinput;x > 0; x--)
				l++;
		}
		if(i > l)
			s="Cold!You are getting Farther!";
		if(i < l)
			s="Hot!You are getting Closer!";
		if(i == l)
			s="Distance didn't change!";
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
	public int test(HotOrCold hoc) throws Exception{
		return hoc.RandomNum();
	}
}
