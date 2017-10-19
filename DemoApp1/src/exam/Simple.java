package exam;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class A implements Serializable {
	transient int a = 7;
	static int b = 9;
}
public class Simple implements Serializable {
	public static void main(String... args){
		A a = new A();
		try {
			ObjectOutputStream os = new ObjectOutputStream(
			new FileOutputStream("test.ser"));
			os.writeObject(a);
			os. close();
			System.out.print( + + a.b + " ");
			ObjectInputStream is = new ObjectInputStream(new FileInputStream("test.ser"));
			A s2 = (A)is.readObject();
			is.close();
			System.out.println(s2.a + " " + s2.b);
		} catch (Exception x){
			x.printStackTrace();
		}
	}
}