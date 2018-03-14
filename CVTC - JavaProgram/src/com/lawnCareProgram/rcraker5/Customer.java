package com.lawnCareProgram.rcraker5;


public class Customer {
	
	private String	name;
	private String	address;
	
	private boolean	hedgeCutting, mowing, planting, weedKilling;
	
	
	public Customer(String name, String address, boolean hedgeCutting, boolean mowing, boolean planting, boolean weedKilling) {
		this.name = name;
		this.address = address;
		this.hedgeCutting = hedgeCutting;
		this.mowing = mowing;
		this.planting = planting;
		this.weedKilling = weedKilling;
	}
	
	
	public String getName() {
		return name;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getAddress() {
		return address;
	}
	
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	public boolean isHedgeCutting() {
		return hedgeCutting;
	}
	
	
	public void setHedgeCutting(boolean hedgeCutting) {
		this.hedgeCutting = hedgeCutting;
	}
	
	
	public boolean isMowing() {
		return mowing;
	}
	
	
	public void setMowing(boolean mowing) {
		this.mowing = mowing;
	}
	
	
	public boolean isPlanting() {
		return planting;
	}
	
	
	public void setPlanting(boolean planting) {
		this.planting = planting;
	}
	
	
	public boolean isWeedKilling() {
		return weedKilling;
	}
	
	
	public void setWeedKilling(boolean weedKilling) {
		this.weedKilling = weedKilling;
	}
	
	
	public int compareTo(String s) {
		return name.compareTo(s);
	}
	
	
	public String toString() {
		int cnt = 0;
		int prevCnt = 0;
		String s = "[" + name + " - Signed Up For: ";
		if (hedgeCutting) {
			cnt++;
			s += "Hedge Cutting";
		}
		if (mowing) {
			if (cnt > prevCnt) {
				s += ", ";
				prevCnt++;
			}
			cnt++;
			s += "Mowing";
		}
		if (planting) {
			if (cnt > prevCnt) {
				s += ", ";
				prevCnt++;
			}
			cnt++;
			s += "Planting";
		}
		if (weedKilling) {
			if (cnt > prevCnt) {
				s += ", ";
				prevCnt++;
			}
			cnt++;
			s += "Weed Killing";
		}
		s += "]";
		return s;
	}
	
}
