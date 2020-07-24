package com.epam.Design_Patterns;

import java.util.*;
public class Main 
{
    public static void main( String[] args ) throws Exception
    {
    	Scanner input = new Scanner(System.in);
        DataRecorded dataObject = new DataRecorded();
        Cart itemsCart = new Cart();
        ArrayList<ArrayList<ArrayList<Products>>> ecommerceData = dataObject.getData();
        System.out.println("Welcome to the website");
        int shopAgain = 0;
        do
        {
        	int type;
        	int typeOptions = 1;
        	for(ArrayList<ArrayList<Products>> TypeArrayList : ecommerceData)
        	{
        		System.out.println(typeOptions + " " + TypeArrayList.get(typeOptions - 1).get(0).getProductType());
        		typeOptions = typeOptions + 1;
        	}
        	System.out.println("Press -1 to exit");
        	type = input.nextInt();
        	if(type == -1) break;

        	if(type <= 0 || type > ecommerceData.size())
        	{
        		System.out.println("Invalid!");
        		continue;
        	}
        	else
        	{
        		int categoryOptions = 1,category;
        		for(ArrayList<Products> categoryArrayList : ecommerceData.get(type-1))
        		{
        			System.out.println(+categoryOptions + " " + categoryArrayList.get(categoryOptions- 1).getProductCategory());
        			categoryOptions = categoryOptions+1;
        		}
        		System.out.println("Press -1 to exit");
        		category = input.nextInt();
        		if(category == -1) break;
            	if(category <= 0 || category > ecommerceData.get(type-1).size())
            	{
            		System.out.println("Invalid Option Selected");
            		continue;
            	}
            	else
            	{
            		int itemOptions = 1, item;
            		for(Products ProductArrayList : ecommerceData.get(type-1).get(category-1))
            		{
            			System.out.println(itemOptions + " " + ProductArrayList.getProductName());
            			itemOptions = itemOptions + 1;
            		}
            		System.out.println("Press -1 to exit");
            		item = input.nextInt();
            		if(item == -1) break;
            		else if(item <= 0 || item > ecommerceData.get(type-1).get(category-1).size())
            		{
            			System.out.println("Invalid option");
            		}
            		else
            		{
            			System.out.println("The cost of "+ecommerceData.get(type-1).get(category-1).get(item-1).getProductName()+" is "+ecommerceData.get(type-1).get(category-1).get(item-1).getCost());
            			itemsCart.addItemToCart(ecommerceData.get(type-1).get(category-1).get(item-1));
            		}
            	}
        	}
        	itemsCart.showItemInCart();
        	System.out.println("Do you want to shop again ? Press 1 if YES and 0 if NO");
        	shopAgain = input.nextInt();
        	while(shopAgain != 0 && shopAgain != 1)
        	{
        		System.out.println("Invalid! please select again ");
        		System.out.println("Do you want to shop again ? Press 1 if YES and 0 if NO");
        		shopAgain = input.nextInt();
        	}
        } while(shopAgain != 0);
        
        System.out.println("Thanks for shopping!");
        input.close();
    }
}
