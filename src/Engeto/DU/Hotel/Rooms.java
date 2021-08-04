package Engeto.DU.Hotel;

import java.math.BigDecimal;

public class Rooms {
    int roomNumber;
    String bedsNumber;
    String balcony;
    String seaView;
    BigDecimal price;
    public Rooms (int roomNumber, String bedsNumber, BigDecimal price, String balcony, String seaView){
        this.roomNumber = roomNumber;
        this.bedsNumber = bedsNumber;
        this.price = price;
        this.balcony = balcony;
        this.seaView = seaView;
    }
    public String toString() {
        return String.format("Room number: %d \n room type: %s \n price: %s Kč/night \n %s \n %s \n",roomNumber, bedsNumber,price, balcony,seaView);
    }
}
