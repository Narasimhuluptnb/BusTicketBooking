package busReservation;

public class Bus {
	private int busno;
	private boolean ac;
	private int capacity;
	
	Bus(int no,boolean ac,int cap){
		this.busno=no;
		this.ac = ac;
		this.capacity= cap;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}
	
	public boolean isAc() {
		return ac;
	}
	public void setAc(boolean ac) {
		this.ac = ac;
	}
	
	public int getBusno() {
		return busno;
	}
	public void displayBusInfo() {
		System.out.println("Bus No: "+busno+ " Ac: "+ac+" Capacity: "+capacity);
	}
	

}
