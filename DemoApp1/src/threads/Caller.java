package threads;

public class Caller implements Runnable{

	String s;
	Callme target;
	Thread t;
	
	
	public Caller(String s, Callme target) {
		this.s = s;
		this.target = target;
		t= new Thread(this);
		t.start();
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		target.call(s);
	}
	
}

