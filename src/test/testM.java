package test;


import static org.junit.Assert.*;
import main.HotOrCold;
import main.main;

import org.junit.Test;
import org.mockito.Mockito;

public class testM {
	@Test public void testCompare() throws Exception{
		HotOrCold HoC = Mockito.mock(HotOrCold.class);
		Mockito.when(HoC.RestChance()).thenReturn(9);
		main run = new main();
		run.test(HoC);
		assertEquals(run.test(HoC),9);
	}
}
