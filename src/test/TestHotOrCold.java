package test;

import static org.junit.Assert.*;
import main.HotOrCold;

import org.junit.Test;


public class TestHotOrCold {
	@Test public void TryHotOrCold(){
		new HotOrCold();
	}
	HotOrCold h = new HotOrCold();
	@Test public void CreateRandomNum(){
		int rand = h.RandomNum();
		assertNotEquals(rand,h.RandomNum());
	}
	@Test public void RandomNumSize(){
		try{
		if(h.RandomNum()<1||h.RandomNum()>75){
			fail("Should throw IllegalArgumentException");
		}
		}catch(IllegalArgumentException e){}
	}
	@Test public void 	TestInputIsInt(){
		try{
			h.CheckInput("n");
			fail("Should throw illegalArgumentExecption");
			}catch(IllegalArgumentException e){}
	}
	@Test public void 	TestInputTooLarge(){
		try{
			h.CheckInput(76);
			fail("Should throw illegalArgumentExecption");
			}catch(IllegalArgumentException e){}
	}
	@Test public void 	TestInputTooLow(){
		try{
			h.CheckInput(0);
			fail("Should throw illegalArgumentExecption");
			}catch(IllegalArgumentException e){}
	}
}
