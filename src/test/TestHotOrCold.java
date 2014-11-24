package test;

import static org.junit.Assert.*;
import main.HotOrCold;

import org.junit.Test;


public class TestHotOrCold {
	@Test public void TryHotOrCold(){
		new HotOrCold();
	}
	@Test public void CreateRandomNum(){
		HotOrCold h = new HotOrCold();
		int rand = h.RandomNum();
		assertNotEquals(rand,h.RandomNum());
	}
	@Test public void RandomNumSize(){
		try{
		HotOrCold h = new HotOrCold();
		if(h.RandomNum()<1||h.RandomNum()>75){
			fail("Should throw IllegalArgumentException");
		}
		}catch(IllegalArgumentException e){}
	}
}
