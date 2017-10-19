package threads;

public class HelloRunner implements Runnable {
	int i;
	@Override
	public void run() {
		// TODO Auto-generated method stub
		i= 0;
		while(true){
			System.out.println("hello world "+i++);
			if(i==10)
				break;
		}
	}
}
