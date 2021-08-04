package Engeto.DU.Hotel;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Guests {
    String name;
    LocalDate dateOfBorn;
    Rooms room;
    LocalDate bookRoomFrom;
    LocalDate bookRoomTo;
    public Guests(String name, LocalDate dateOfBorn) {
        this.name = name;
        this.dateOfBorn = dateOfBorn;
    }
    public void setRoomBook(Rooms room, LocalDate bookRoomFrom, LocalDate bookRoomTo) {
        this.room = room;
        this.bookRoomFrom = bookRoomFrom;
        this.bookRoomTo = bookRoomTo;
    }
    public String getRoomBook() {
        return name + "'s reservation - " + "room number:" + room.roomNumber + " form " + bookRoomFrom + " to " + bookRoomTo;
    }
    public String toString() {
        return String.format("Guest ID:\n name: %s \n date of born: %s \n",name, dateOfBorn );
    }
}
