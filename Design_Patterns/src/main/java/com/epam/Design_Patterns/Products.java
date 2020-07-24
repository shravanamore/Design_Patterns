package com.epam.Design_Patterns;

public class Products
{
	private String productCategory;
	private String productName;
	private float cost;
	private String productType;
	
	public Products(float cost, String productType, String productCategory, String productName)
	{
		this.cost = cost;
		this.productType = productType;
		this.productCategory = productCategory;
		this.productName = productName;
	}
	public void setCost(float cost)
	{
		this.cost = cost;
	}
	public void setProductType(String productType)
	{
		this.productType = productType;
	}
	public float getCost()
	{
		return this.cost;
	}
	public String getProductType()
	{
		return this.productType;
	}
	public void setProductCategory(String productCategory)
	{
		this.productCategory = productCategory;
	}
	public String getProductCategory()
	{
		return this.productCategory;
	}
	public void setProductName(String productName)
	{
		this.productName = productName;
	}
	public String getProductName()
	{
		return this.productName;
	}
}
