package jdbc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ac= new ClassPathXmlApplicationContext("jdbc/demo.xml");
		
		CountryDao c= ac.getBean("countryDao", CountryDao.class);
		//System.out.println(c.countCountry());
		
		//Country cc= new Country("Zz", "Zambia" , 3);
		//c.insertCountry(cc);
		//c.deleteCountry("Zz");
		System.out.println(c.getCountry("HK"));
		System.out.println(c.getCountries());
		
	}

}
