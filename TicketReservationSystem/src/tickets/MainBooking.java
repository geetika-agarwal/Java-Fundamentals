package tickets;

public class MainBooking {
	public static void main(String[] args) throws InterruptedException {

		BookTicket tick1 = new BookTicket(20);
		BookTicket tick2 = new BookTicket(60);
		BookTicket tick3 = new BookTicket(30);

		tick1.start();
		tick2.start();
		tick3.start();
	}
}
