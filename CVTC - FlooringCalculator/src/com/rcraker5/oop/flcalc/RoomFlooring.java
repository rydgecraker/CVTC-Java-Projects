package com.rcraker5.oop.flcalc;


public class RoomFlooring {
	
	private float			costPerSqFoot;
	private RoomDimension	roomDimension;
	
	
	public RoomFlooring(float costPerSqFoot, RoomDimension roomDimension) {
		this.costPerSqFoot = costPerSqFoot;
		this.roomDimension = roomDimension;
	}
	
	
	public float getTotalCost() {
		return roomDimension.getArea() * costPerSqFoot;
	}
	
	
	public float getCostPerSqFoot() {
		return costPerSqFoot;
	}
	
	
	public void setCostPerSqFoot(float costPerSqFoot) {
		this.costPerSqFoot = costPerSqFoot;
	}
	
	
	public RoomDimension getRoomDimension() {
		return roomDimension;
	}
	
	
	public void setRoomDimension(RoomDimension roomDimension) {
		this.roomDimension = roomDimension;
	}
	
	
	
	
}
