package threads;

public class ThreadSyncDemo {
	public static void main(String[] args) {
		Callme target= new Callme();
		Caller ob1= new Caller("hello", target);
		Caller ob2= new Caller("sync", target);
		Caller ob3= new Caller("world", target);
		
		try{
			ob1.t.join();
			ob2.t.join();
			ob3.t.join();
		}
		catch(InterruptedException e){
			System.out.println(e);
		}
	}
}
