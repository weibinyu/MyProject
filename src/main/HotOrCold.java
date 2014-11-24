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

}
