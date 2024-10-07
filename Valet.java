
public class Valet implements HotelService {
    @Override
    public void Service() {
    }

    public void pickUpVehicle (String plateNumber){
        System.out.println("Vehicle with plate number "+plateNumber+" has been picked up by valet.");

    }
}
