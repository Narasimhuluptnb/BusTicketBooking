package busReservation;

import java.util.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class Booking {
	String passengerName;
	int busno;
	Date date;
	Scanner scanner = new Scanner(System.in);
	public Booking() {
		System.out.println("Enter the passenger name");
		passengerName = scanner.next();
		System.out.println("Enter the Bus number from 1 to 3");
		busno = scanner.nextInt();
		if(busno<=3) {
			busno=busno;
		}
		else {
			System.out.println("Enter an existing bus number");
			busno = scanner.nextInt();
		}
		
		// for taking the date from the user
		System.out.println("Enter date of journey");
		String dateinput = scanner.next();
		SimpleDateFormat dateFormat = new SimpleDateFormat("DD-MM-YYYY");
		
		try {
			date = dateFormat.parse(dateinput);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
	}
	public boolean isavailable(ArrayList<Booking> bookings, ArrayList<Bus> buses) {
		int capacity = 0;
		for(Bus bus:buses) {
			if(bus.getBusno()== busno) {
				capacity = bus.getCapacity();
			}
		}
		int booked =0;
		for(Booking b:bookings) {
			if(b.busno== busno && b.date.equals(date)){
				booked++;
			}
		}
		return booked<capacity?true:false;
	}

}
