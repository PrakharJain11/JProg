package com.prakharjain.observer;

public class Youtube {
	
	public static void main(String[] args)
	{
	
	Channel telusko = new Channel();
	
	Subscriber s1 = new Subscriber("Ram");
	Subscriber s2 = new Subscriber("Shayam");
	Subscriber s3 = new Subscriber("Lavi");
	
	telusko.subscribe(s1);
	telusko.subscribe(s2);
	telusko.subscribe(s3);
	
	s1.subscribeChannel(telusko);
	s2.subscribeChannel(telusko);
	s3.subscribeChannel(telusko);
	
	telusko.upload("How to learn programming");
	
	}
}
