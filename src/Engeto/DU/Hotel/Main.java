package Engeto.DU.Hotel;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //přiřazení instancí hostů do seznamu a vypsání seznamu pomocí foreach
        ArrayList<Guests> guestsList = new ArrayList<Guests>();
        guestsList.add(new Guests("Adéla Malíková", LocalDate.of(1993,3,13)));
        guestsList.add(new Guests("Jan Dvořáček", LocalDate.of(1988,5,5)));
        for(Guests guest:guestsList){
            System.out.println(guest);
        }
        //Vytvoření instancí pokojů a jejich vypsaní (tady jsem už seznam nepoužil)
        Rooms room1 = new Rooms(1,"single bed", BigDecimal.valueOf(1000),"with balcony","with sea view");
        Rooms room2 = new Rooms(2,"single bed", BigDecimal.valueOf(1000),"with balcony","with sea view");
        Rooms room3 = new Rooms(3,"triple bed", BigDecimal.valueOf(2400),"without balcony","with sea view");
        System.out.println(room1 + "\n" + room2 + "\n" + room3);
        // Objednání pokoje a vypsání objednávky
        guestsList.get(0).setRoomBook(room1,LocalDate.of(2021,7,19), LocalDate.of(2021,7,26));
        System.out.println(guestsList.get(0).getRoomBook());
        guestsList.get(0).setRoomBook(room3,LocalDate.of(2021,9,1), LocalDate.of(2021,9,14));
        System.out.println(guestsList.get(0).getRoomBook());
        guestsList.get(1).setRoomBook(room3,LocalDate.of(2021,9,1), LocalDate.of(2021,9,14));
        System.out.println(guestsList.get(1).getRoomBook());
    }
}
