package test;

import static org.junit.Assert.*;
import main.HotOrCold;

import org.junit.Test;


public class TestHotOrCold {
	@Test public void TryHotOrCold(){
		new HotOrCold();
	}
	HotOrCold h = new HotOrCold();
	int lastinput = 0;
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
		assertThrow("n");
	}
	@Test public void 	TestInputTooLarge(){
		assertThrow(76);
	}
	@Test public void 	TestInputTooLow(){
		assertThrow(0);
	}
	public void assertThrow(Object input){
		try{
			h.CheckInput(input);
			fail("Should throw illegalArgumentExecption");
			}catch(IllegalArgumentException e){}
	}
	@Test public void 	TestCompareifFarther(){
		int randomNum = 70;
		int input = 40;
		int lastinput = 60;
		if(randomNum -lastinput < randomNum - input){
			assertEquals("Cold!You are getting Farther!",h.Compare(randomNum,lastinput,input));
			}
		}
	@Test public void 	TestCompareIfCloser(){
		int randomNum = 70;
		int input = 65;
		int lastinput = 60;
		if(randomNum -lastinput > randomNum - input){
			assertEquals("Hot!You are getting Closer!",h.Compare(randomNum,lastinput,input));
			}	
		}
}
