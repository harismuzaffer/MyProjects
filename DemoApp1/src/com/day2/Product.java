package com.day2;

public class Product {
	static int counter= 100;
	String productId;
	String productName;
	float productPrice;
	String productCategory;
	
	Product(String productName, float productPrice, String productCategory){
		this.productName= productName;
		this.productPrice= productPrice;
		this.productCategory= productCategory;
		this.productId= generateProductId();
	}
	
	public String generateProductId(){
		return productCategory.charAt(0)+productName.substring(0,3)+counter++;
	}
	public float calculateDiscount() {
		float discountedProductPrice= productPrice;
		if(productPrice< 500)
			discountedProductPrice= productPrice;
		else if(productPrice>500 && productPrice<=1000)
			discountedProductPrice= (productPrice*10)/100;
		return productPrice-discountedProductPrice;
	}
	public String ShowDetails() {
		return productId+" "+productName+" "+productPrice+" "+productCategory;
	}
	
}
