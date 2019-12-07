package com.prakharjain.prototype;

public class Demo {
	public static void main(String[] args) throws CloneNotSupportedException
	{
		BookShop bs = new BookShop();
		
		bs.setShopName("Novalty");
		bs.loadData();
		System.out.println(bs.getShopName() +" : Book Name:"+bs.getBooks());
		
		BookShop bs1 = (BookShop) bs.clone();
		bs1.setShopName("Rakesh Pustak Sadan");

		System.err.println(bs1);
		
	}
}
