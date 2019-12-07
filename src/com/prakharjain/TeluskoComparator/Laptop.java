package com.prakharjain.TeluskoComparator;

public class Laptop implements Comparable<Laptop> {
	public String brandName;
	public int ram;
	public int harddisk;
	
	
	public Laptop(String brandName, int ram, int harddisk) {
		super();
		this.brandName = brandName;
		this.ram = ram;
		this.harddisk = harddisk;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public int getRam() {
		return ram;
	}
	public void setRam(int ram) {
		this.ram = ram;
	}
	public int getHarddisk() {
		return harddisk;
	}
	public void setHarddisk(int harddisk) {
		this.harddisk = harddisk;
	}
	@Override
	public int compareTo(Laptop o) {
		// TODO Auto-generated method stub
		if(this.ram>o.ram)
			return 1;
		else
			return -1;
	}
	
}
