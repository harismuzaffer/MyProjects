package com.day5;

public class InvalidDataException extends Exception{
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Length should be > 5";
	}
}
