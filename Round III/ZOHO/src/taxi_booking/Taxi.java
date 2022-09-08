package taxi_booking;

public class Taxi {
	private int id;
	private char currLocation;
	private int fare;
	private boolean free;
	
	Taxi(int id, char currLocation, int fare, boolean free){
		this.id=id;
		this.currLocation=currLocation;
		this.fare=fare;
		this.free=free;
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


	
	public boolean isFree() {
		return free;
	}

	public void setFree(boolean free) {
		this.free = free;
	}
	
}
