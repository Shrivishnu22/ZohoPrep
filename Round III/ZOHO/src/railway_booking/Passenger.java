package railway_booking;

public class Passenger {
	
	private int id=0;
	private int age;
	private int seatNo;
	
	Passenger(int id,int age, int seatNo){
		this.id=id;
		this.age=age;
		this.seatNo=seatNo;
	}
	
	public void setId(int id) {
		this.id=id;
	}

	public int getId() {
		return id;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getSeatNo() {
		return seatNo;
	}

	public void setSeatNo(int seatNo) {
		this.seatNo = seatNo;
	}
	

}
