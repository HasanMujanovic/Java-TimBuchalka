package dev.lpa;

public record Seat(char rowMaker, int seatNumber, boolean isReversed) {
    public Seat(char rowMaker, int seatNumber) {
//        this(rowMaker,seatNumber, new Random().nextBoolean());
        this(rowMaker,seatNumber, false);

    }
}
