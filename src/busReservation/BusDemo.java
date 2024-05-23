package busReservation;

import java.util.ArrayList;
import java.util.Scanner;

public class BusDemo 
{
	public static void main(String[] args) 
	{
		ArrayList<Bus> buses = new ArrayList<Bus>();
		ArrayList<Booking> bookings = new ArrayList<>();
		
		buses.add(new Bus(1, true, 3));
		buses.add(new Bus(2, false, 20));
		buses.add(new Bus(3, true, 15));
		for(Bus b:buses) {// for each loop to display the Busdata
			b.displayBusInfo();
		}
		
		Scanner scanner = new Scanner(System.in);
		int useropt=1;
		
		
		while(useropt == 1) 
		{
		System.out.println("Enter 1 to Book and 2 to exit");
		useropt = scanner.nextInt();
		if(useropt==1) {
			Booking booking = new Booking(); 
			if(booking.isavailable(bookings,buses)) {
				bookings.add(booking);
				System.out.println("Your Booking is confromed");
			}
			else {
				System.out.println("sorry ! Unable to confrom your booking plese try with another bus or date");
			}
		}
		}
		scanner.close();
	}

}
