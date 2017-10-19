package com.day2;

public class ExecutionSeq {

	public ExecutionSeq(){
		System.out.println("constr");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ExecutionSeq e1= new ExecutionSeq();
		Object o= new Long(6445L);
		System.out.println(o);
		Object[] oa= new Object[1];
		System.out.println(oa[0]);
		oa[0]= o;
		System.out.println(oa[0]);
		o= null;
		oa[0]= null;
	}

}
