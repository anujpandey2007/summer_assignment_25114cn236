package week_5.day_4;

// 1. Event Class (Encapsulates data about the show)
class Event {
    private String eventName;
    private int totalSeats;
    private int availableSeats;
    private double basePrice;

    public Event(String eventName, int totalSeats, double basePrice) {
        this.eventName = eventName;
        this.totalSeats = totalSeats;
        this.availableSeats = totalSeats;
        this.basePrice = basePrice;
    }

    // Getters
    public String getEventName() { return eventName; }
    public int getAvailableSeats() { return availableSeats; }
    public double getBasePrice() { return basePrice; }

    // Method to securely book a seat
    public boolean reserveSeat() {
        if (availableSeats > 0) {
            availableSeats--;
            return true;
        }
        return false;
    }
}

// 2. Base Ticket Class
class Ticket {
    private String ticketId;
    private Event event;
    private String customerName;

    //constructor
    public Ticket(String ticketId, Event event, String customerName) {
        this.ticketId = ticketId;
        this.event = event;
        this.customerName = customerName;
    }

    //getters
    public String getTicketId() {
        return ticketId;
    }
    public Event getEvent() {
        return event;
    }
    public String getCustomerName() {
        return customerName;
    }

    // Calculates price
    public double calculateFinalPrice() {
        return event.getBasePrice(); // Standard ticket is just the base price
    }

    // Displays booking details
    public void printTicketDetails() {
        System.out.println("\n--- TICKET CONFIRMATION ---");
        System.out.println("Ticket ID: " + ticketId);
        System.out.println("Customer: " + customerName);
        System.out.println("Event: " + event.getEventName());
        System.out.printf("Total Paid: $%.2f\n", calculateFinalPrice());
    }
}

//  VIP Tickets inherit ticket properties (Inheritance )
class VIPWithMealTicket extends Ticket {
    private double mealSurcharge;

    //constructor with parent class
    public VIPWithMealTicket(String ticketId, Event event, String customerName, double mealSurcharge) {
        super(ticketId, event, customerName); // Call parent constructor
        this.mealSurcharge = mealSurcharge;
    }

    // Overriding price calculation
    @Override
    public double calculateFinalPrice() {
        double vipBase = getEvent().getBasePrice() * 1.20;
        return vipBase + mealSurcharge;
    }

    // Overriding details to highlight VIP perks
    @Override
    public void printTicketDetails() {
        super.printTicketDetails();
        System.out.println(">> Ticket Type: VIP (Includes Backstage Lounge Access & Hot Meal)");
    }
}

//  Main Class
public class code_111 {

    // Static helper method to handle the booking logic safely
    public static void bookTicket(Event event, Ticket ticket) {
        if (event.reserveSeat()) {
            ticket.printTicketDetails();
            System.out.println("Status: Booking Successful! Remaining seats: " + event.getAvailableSeats());
        } else {
            System.out.println("\nBooking FAILED for " + ticket.getCustomerName() + ". '" + event.getEventName() + "' is Sold Out!");
        }
    }

    public static void main(String[] args) {
        // event with only two seat
        Event concert = new Event("Rock Pantheon 2026", 2, 100.00);

        System.out.println("Initializing system for: " + concert.getEventName());
        System.out.println("Total Starting Seats: " + concert.getAvailableSeats());

        // 1. Booking a standard ticket
        Ticket regularTicket = new Ticket("TKT-001", concert, "anuj");
        bookTicket(concert, regularTicket);

        // 2. Book a premium VIP + Meal ticket for Sarah
        Ticket vipTicket = new VIPWithMealTicket("VIP-999", concert, "Sarah ", 25.00);
        bookTicket(concert, vipTicket);

        // 3. Try to book a third ticket (Should fail as capacity is 2)
        Ticket failedTicket = new Ticket("TKT-002", concert, "Bruce Wayne");
        bookTicket(concert, failedTicket);
    }
}
