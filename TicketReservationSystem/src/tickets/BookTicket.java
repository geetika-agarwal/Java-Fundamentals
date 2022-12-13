package tickets;

public class BookTicket extends Thread {
	static int availableTickets = 100;

	public synchronized void bookTicket(int noOfTickets) throws InterruptedException {
		if (availableTickets > 0 && availableTickets >= noOfTickets) {
			System.out.println("Tickets are available!!!");
			availableTickets -= noOfTickets;
			Thread.sleep(3000);
			System.out.println("Your tickets are booked!!!");
		} else {
			System.out.println("No tickets are available, try again some other time!!!");
		}
	}
}
