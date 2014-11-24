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
	@Test public void 	TestInputTooLarge(){
		assertThrow(76);
	}
	@Test public void 	TestInputTooLow(){
		assertThrow(0);
	}
	public void assertThrow(int input){
		try{
			h.CheckInput(input);
			fail("Should throw illegalArgumentExecption");
			}catch(IllegalArgumentException e){}
	}
	@Test public void 	TestCompareifFarther() throws Exception{
		int randomNum = 70;
		int input = 40;
		int lastinput = 60;
		if(randomNum -lastinput < randomNum - input){
			assertEquals("Cold!You are getting Farther!",h.Compare(randomNum,lastinput,input));
			}
		}
	@Test public void 	TestCompareifCloser() throws Exception{
		int randomNum = 70;
		int input = 40;
		int lastinput = 60;
		if(randomNum -lastinput > randomNum - input){
			assertEquals("Hot!You are getting Closer!",h.Compare(randomNum,lastinput,input));
			}
		}
	@Test public void 	TestCompareIfNoChange() throws Exception{
		int randomNum = 50;
		int input = 40;
		int lastinput = 60;
		if(randomNum -lastinput == randomNum - input || randomNum -lastinput == (randomNum - input)*-1){
			assertEquals("Distance didn't change!",h.Compare(randomNum,lastinput,input));
			}	
		}
	@Test public void 	TestCompareIfEqual(){
		int randomNum = 70;
		int input = 70;
		int lastinput = 60;
		try{
		if(input == randomNum){
			assertEquals("Congratz you got the right number!",h.Compare(randomNum,lastinput,input));
			fail("should throw Excetion and show player won");
			}	
		}catch(Exception e){}
		}
	@Test public void TestRestChance(){
		assertRestChance(1);
		assertRestChance(2);
		assertRestChance(3);
		assertRestChance(4);
		assertRestChance(5);
		assertRestChance(6);
		assertRestChance(7);
		assertRestChance(8);
		assertRestChance(9);
		assertRestChance(10);
		try {
			if(h.RestChance()==11){
				if(h.RestChance()==11){
					fail("Should show chanes are over and throw an exception");
				}
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
		}
	}
	public void assertRestChance(int input){
		try {
			assertEquals(input,h.RestChance());
		} catch (Exception e) {
			// TODO Auto-generated catch block
		}
	}
	
	
}
