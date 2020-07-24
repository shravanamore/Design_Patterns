package com.epam.Design_Patterns;

import java.util.ArrayList;

public class DataRecorded
{
	public ArrayList<ArrayList<ArrayList <Products>>> ecommerceArray;
	public DataRecorded()
	{
		ArrayList<Products> shirtsArray=new ArrayList<Products>();
      
        shirtsArray.add(new Shirts(300,"Tom Hilfiger"));
        shirtsArray.add(new Shirts(500,"Zarman"));
 
        ArrayList< ArrayList<Products>> clothesArray=new ArrayList<ArrayList<Products>>();
        clothesArray.add(shirtsArray);
  
        ArrayList<Products> headphonesArr =new ArrayList<Products>();
        headphonesArr.add(new Headphones(10000,"BOAT"));
        headphonesArr .add(new Headphones(9000,"OnePlus"));
        
        ArrayList<Products> laptopsArray =new ArrayList<Products>();
        laptopsArray.add(new Laptops(20000,"Dell"));
        laptopsArray.add(new Laptops(30000,"HP"));

        ArrayList<ArrayList<Products>> electronicsArray=new ArrayList<ArrayList<Products>>();
        electronicsArray.add(headphonesArr);
        electronicsArray.add(laptopsArray);
        
        
        ArrayList<ArrayList<ArrayList<Products>>> ecommerceArray=new ArrayList<ArrayList<ArrayList<Products>>>();
        ecommerceArray.add(electronicsArray);
        ecommerceArray.add(clothesArray);
        
        this.ecommerceArray=ecommerceArray;
	}
	public ArrayList<ArrayList<ArrayList <Products>>> getData()
	{
		return this.ecommerceArray;
	}
}