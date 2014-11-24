package main;

public class main {
	static HotOrCold hoc;
	public static void run(String[]args) throws Exception{
		hoc = new HotOrCold();
		hoc.RestChance();
	}
	public int test(HotOrCold hoc) throws Exception{
		return hoc.RestChance();
	}
}
