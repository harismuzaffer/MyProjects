package com.day4;

public class OverridingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FourWheeler c= new Car();
		c.start();
		FourWheeler b= new Bus();
		b.start();
		if(c instanceof Car){
			Car cc= (Car)c;
			cc.accomodation();
		}
		if(b instanceof Bus){
			Bus bb= (Bus)b;
			bb.accomodation();
		}
	}

}

class FourWheeler {
	public void start(){
		System.out.println("started");
	}
}

class Car extends FourWheeler {
	public void start(){
		System.out.println("car started");
	}
	public void accomodation(){
		System.out.println("accomodation: 5");
	}
}

class Bus extends FourWheeler {
	public void start(){
		System.out.println("bus started");
	}
	public void accomodation(){
		System.out.println("accomodation: 30");
	}
}
