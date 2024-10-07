public class HotelApp {
    public static void main(String[] args) {
    FrontDesk frontDesk = new FrontDesk();

    System.out.println("\nWelcome to The Stanley Hotel! \n");

    frontDesk.pickUpVehicle("MIG 123");
    System.out.println("");

    frontDesk.requestCleaning("6060");
    System.out.println("");

    frontDesk.requestCart(12);
    System.out.println("");
    }
 }