package com.ajp1;

public class Box {

	public int length; 
	private int breadth;
	protected int height;
	int weight;
    public int getLength() {
		return length;
	}
	public void setLength(int length) {
		this.length = length;
	}
	
	public int getBreadth() {
		return breadth;
	}
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	public  int volume() {
		return length*breadth*height;
	}
	
	public static void main(String args[]) {
		Box box=new Box();
		box.length=100;
		box.breadth=30;
		box.height=25;
		System.out.println("volume="+box.volume());
		

	}

}
