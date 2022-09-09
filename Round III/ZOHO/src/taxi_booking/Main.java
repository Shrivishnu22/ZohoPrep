package taxi_booking;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	public static ArrayList<Taxi> createTaxis(int n) {
		ArrayList<Taxi>taxis=new ArrayList<>();
		for(int i=1;i<=n;i++) {
			Taxi taxi = new Taxi(i,'A',0,6,0);
			taxis.add(taxi);
		}
		return taxis;
	}
	
	public static int calculateFare(int distance,int fare) {
		int res=0;
		if(fare==0) {
			res+=100;
			distance-=5;
		}
		res+=(distance*10);
		return res;
	}
	public static void main(String args[]) {
		System.out.println("Welcome to Taxi Booking Services");
		Scanner sc = new Scanner(System.in);
		ArrayList<Taxi>taxis=createTaxis(4);
		while(true) {
			boolean checkAvailability = true;
			System.out.println("Enter your choice: (0)-Book a Taxi (1)-Display the details (2)-Exit");
			int choice = sc.nextInt();
			if(choice==0) {
				System.out.println("Enter the PickUp Location");
				char pickUpLocation = sc.next().charAt(0);
				System.out.println("Enter the Drop Location");
				char dropLocation = sc.next().charAt(0);
				if(pickUpLocation<'A' || pickUpLocation>'F' || dropLocation<'A' || dropLocation>'F') {
					System.out.println("Please enter valid Pick Up/Drop Location");
					break;
				}
				System.out.println("Enter the pickUp time");
				int pickUpTime = sc.nextInt();
				if(pickUpTime<6 || pickUpTime>21) {
					System.out.println("Please enter valid Pick Up Time (6AM - 9PM)");
					break;
				}
				int dropTime = pickUpTime+(Math.abs(pickUpLocation-dropLocation));
				int distance = Math.abs(pickUpLocation-dropLocation)*15;
				for(Taxi t : taxis) {
					checkAvailability=false;
					if(pickUpTime>=t.getDropTime()) {
						int fare = calculateFare(distance,t.getFare());
						t.setFare(t.getFare()+fare);
						t.setCurrLocation(dropLocation);
						t.setPickUpTime(pickUpTime);
						t.setDropTime(dropTime);
						checkAvailability=true;
						System.out.println(t.getId()+" Taxi Booked");
						break;
					}
				}
				if(!checkAvailability) {
					System.out.println("Sorry, No Taxi is Available");
					break;
				}
			}
			else if(choice==1) {
				System.out.println("            Taxi Details          ");
				System.out.println("----------------------------------");
				System.out.println("ID  CurrentLocation  Fare  PickUpTime  DropTime");
				System.out.println("----------------------------------");
				for(Taxi t:taxis) {
						System.out.println(t.getId()+"   "+t.getCurrLocation()+"                "+t.getFare()+"     "+t.getPickUpTime()+"             "+t.getDropTime());
				}
			}
			else {
				System.out.println("Thank you");
				break;
			}
		}
	}	
}
