package taxi_booking;

public class Taxi {
	private int id;
	private char currLocation;
	private int fare;
	private int pickUpTime;
	private int dropTime;
	
	Taxi(int id, char currLocation, int fare,int pickUpTime, int dropTime){
		this.id=id;
		this.currLocation=currLocation;
		this.fare=fare;
		this.pickUpTime=pickUpTime;
		this.dropTime=dropTime;
	}	
	public int getPickUpTime() {
		return pickUpTime;
	}

	public void setPickUpTime(int pickUpTime) {
		this.pickUpTime = pickUpTime;
	}

	public int getDropTime() {
		return dropTime;
	}

	public void setDropTime(int dropTime) {
		this.dropTime = dropTime;
	}

	public char getCurrLocation() {
		return currLocation;
	}



	public void setCurrLocation(char currLocation) {
		this.currLocation = currLocation;
	}



	public int getFare() {
		return fare;
	}

	public void setFare(int fare) {
		this.fare = fare;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
}
