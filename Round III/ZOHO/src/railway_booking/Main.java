package railway_booking;
import java.util.*;
public class Main {
	static ArrayList<Integer> availableTickets = new ArrayList<>(Arrays.asList(1,2));
	static ArrayList<Integer> RACTickets = new ArrayList<>(Arrays.asList(1));
	static ArrayList<Integer> WLTickets = new ArrayList<>(Arrays.asList(1));
	static ArrayList<Passenger> pList = new ArrayList<>();
		
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int id=1;
		while(true){
			System.out.println("Enter your choice (1) - Book (2) - Cancel (3) - Print Booked Tickets (4) - Print Available Tickets (5) - Exit");
			int choice = sc.nextInt();
			if(choice==1) {
				System.out.println("Kindly enter your age");
				int age = sc.nextInt();
				if(availableTickets.size()>0) {
					int seatNo = availableTickets.get(0);
					availableTickets.remove(0);
					Passenger passenger = new Passenger(id,age,seatNo);
					id++;
					pList.add(passenger);
					System.out.println("Ticket Booked Successfully");
					continue;
				}else if(RACTickets.size()>0) {
					int seatNo = RACTickets.get(0);
					RACTickets.remove(0);
					Passenger passenger = new Passenger(id,age,seatNo);
					id++;
					pList.add(passenger);
					System.out.println("RAC Ticket Booked Successfully");
					continue;
				}else if(WLTickets.size()>0) {
					int seatNo = WLTickets.get(0);
					WLTickets.remove(0);
					Passenger passenger = new Passenger(id,age,seatNo);
					id++;
					pList.add(passenger);
					System.out.println("WL Ticket Booked Successfully");
					continue;
				}
				System.out.println("Sorry, No Tickets Available");
			}
			if(choice==2) {
				System.out.println("Kindly enter the Passenger ID No: ");
				int Findid = sc.nextInt();
				boolean check=true;
				for(int i=0;i<pList.size();i++) {
					if(Findid==pList.get(i).getId()) {
						availableTickets.add(RACTickets.get(0));
						RACTickets.remove(0);
						RACTickets.add(WLTickets.get(0));
						WLTickets.remove(0);
						pList.remove(i);
						check=false;
						break;
					}
				}
				if(check)	System.out.println("Invalid ID entered");
				continue;
			}
			if(choice==3) {
				System.out.println("ID   Age   SeatNo");
				for(Passenger p : pList) {
					System.out.println(p.getId()+"  "+p.getAge()+"  "+p.getSeatNo());
				}
				continue;
			}
			if(choice==4) {
				System.out.println("Available Tickets : "+availableTickets.size());
				System.out.println("RAC Available Tickets : "+RACTickets.size());
				System.out.println("WL Available Tickets : "+WLTickets.size());
				continue;
			}
			else	break;
		}
		System.out.println("Thank you");
		sc.close();
	}

}
