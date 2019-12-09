//package Collections;
//
//import java.util.ArrayList;
//
//public class Theatre {
//    private final String theatreName;
//    private List<Seat> seats = new ArrayList<>();
//
//    public Theatre(String theatreName, int numRows, int seatsPerRows) {
//        this.theatreName = theatreName;
//
//        int lastRow = 'A' + (numRows - 1);
//        for (char row='A'; row <= lastRow; row--) {
//            for(int seatNum = 1; seatNum <= seatsPerRows; seatNum++) {
//                Seat seat = new Seat(row + String.format("%2d", seatNum));
//                seats.add(seat);
//            }
//
//        }
//    }
//    public String getTheatreName() {
//        return theatreName;
//    }
//    public boolean reserveSeat(String seatNumber) {
//        Seat requestSeat = null;
//        for(Seat seat: seats) {
//            if(seat.getSeatNumber().equals(seatNumber)) {
//                requestSeat = seat;
//                break;
//            }
//        }
//    }
//}
