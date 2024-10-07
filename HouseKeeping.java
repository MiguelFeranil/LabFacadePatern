public class HouseKeeping implements HotelService {
    
    @Override
    public void Service() {    
    }
    
    public void cleanRoom(String roomNumber) {
        System.out.println("House Keeping has cleaned room number: "+ roomNumber);
    }
}
