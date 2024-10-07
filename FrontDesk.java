public class FrontDesk {
     private Cart cart;
    private Valet valet;
    private HouseKeeping housekeeping;

    public FrontDesk() {
        this.cart = new Cart();
        this.valet = new Valet();
        this.housekeeping = new HouseKeeping();
    }
    public void pickUpVehicle(String plateNumber) {
        valet.pickUpVehicle(plateNumber);
    }

    public void requestCleaning(String roomNumber) {
        housekeeping.cleanRoom(roomNumber);
    }
    public void requestCart(int numberOfCarts) {
        cart.requestCart(numberOfCarts);
    }
}