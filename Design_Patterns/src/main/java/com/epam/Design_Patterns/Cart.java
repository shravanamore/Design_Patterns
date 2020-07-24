package com.epam.Design_Patterns;

import java.util.*;
public class Cart
{
	private ArrayList<Products> cartList;
	public Cart()
	{
		this.cartList = new ArrayList<Products>();
	}
	public void addItemToCart(Products productBought)
	{
		this.cartList.add(productBought);
	}
	public void showItemInCart()
	{
		System.out.println("Items in the cart are:");
		for(Products itemsInCart:this.cartList )
		{
			System.out.println(itemsInCart.getProductName() + ":" + itemsInCart.getCost());
		}
		System.out.println("The Cost of Items in the cart is:" + itemsInCartCost());
	}
	public float itemsInCartCost()
	{
		float totalItemCost = 0;
		for(Products itemsInCart : this.cartList )
		{
			totalItemCost += itemsInCart.getCost();
		}
		return totalItemCost;
	}
}
