public class Bus {
    private String busNumber;
    private Seat[][] seats;

    // Default bus: 2 rows. Chains to the parameterized constructor.
    public Bus() {
        this("DEFAULT-BUS", 2);
    }

    public Bus(String busNumber, int rows) {
        this.busNumber = busNumber;
        seats = new Seat[rows][4];
        int number = 1;
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < 4; c++) {
                seats[r][c] = new Seat(number++);   // composition
            }
        }
    }

    public void displaySeats() {
        for (int r = 0; r < seats.length; r++) {
            System.out.print("Row " + (r + 1) + ":");
            for (int c = 0; c < seats[r].length; c++) {
                if (c == 2) {
                    System.out.print(" ||");
                }
                Seat s = seats[r][c];
                System.out.printf(" %02d:%c", s.getSeatNumber(), s.isReserved() ? 'X' : 'O');
            }
            System.out.println();
        }
    }

    public void reserveSeat(int seatNumber) {
        for (int r = 0; r < seats.length; r++) {
            for (int c = 0; c < seats[r].length; c++) {
                if (seats[r][c].getSeatNumber() == seatNumber) {
                    if (seats[r][c].reserve()) {
                        System.out.println("Reserving Seat " + seatNumber + ": Successful");
                    } else {
                        System.out.println("Reserving Seat " + seatNumber + ": Already Reserved");
                    }
                    return;
                }
            }
        }
        System.out.println("Reserving Seat " + seatNumber + ": Invalid Seat Number");
    }

    public int countAvailableSeats() {
        int count = 0;
        for (int r = 0; r < seats.length; r++) {
            for (int c = 0; c < seats[r].length; c++) {
                if (!seats[r][c].isReserved()) {
                    count++;
                }
            }
        }
        return count;
    }
}
