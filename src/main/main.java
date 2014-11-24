package main;

public class main {
	static HotOrCold hoc;
	public static void run(String[]args){
		hoc = new HotOrCold();
	}
	public int test(HotOrCold hoc) throws Exception{
		return hoc.RandomNum();
	}
}
