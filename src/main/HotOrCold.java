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

	public void CheckInput(Object input) {
		if(input instanceof Integer){
			int i = (Integer) input;
			if(i < 1 || i > 75){
				throw new IllegalArgumentException();
			}
			
		}else{
			throw new IllegalArgumentException();
		}
	}

	public String Compare(int i, int lastinput, int input) {
		String s = null;
		return s;
	}

}
