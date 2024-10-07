public class Cart implements HotelService {

    @Override
    public void Service() {
    }

    public void requestCart(int numberOfCarts) {
        System.out.println("Your personal cart service is ready. We have arranged " + numberOfCarts + " cart(s) for your convenience.");
    }
}