package collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ibm.First;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac= new ClassPathXmlApplicationContext("collections/beans.xml");
		State k= ac.getBean("karnataka", State.class);
		System.out.println(k.getStateName());
		for(String city: k.getCities())
			System.out.println(city);
		
		
	}

}
