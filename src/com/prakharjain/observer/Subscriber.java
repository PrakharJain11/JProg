package com.prakharjain.observer;

public class Subscriber {
	
	private String name;
	private Channel channel;
	
	
	public void update()
	{
		System.out.println("Video Uploaded");
	}
	
	public void subscribeChannel(Channel ch)
	{
		channel = ch;
	}

	public Subscriber(String name) {
		super();
		this.name = name;
	}
	
	

}
