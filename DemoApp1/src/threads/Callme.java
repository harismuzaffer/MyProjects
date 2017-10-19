package threads;

public class Callme {
	
	synchronized void  call(String s){
		System.out.print("["+s);
		try{
			Thread.sleep(500);
		}
		catch(InterruptedException e){
			System.out.println(e);
		}
		System.out.println("]");
	}
}
