package CompositionChallenge;

public class Room {

    private Furniture theFurniture;

    public Room(Furniture theFurniture) {
        this.theFurniture = theFurniture;
    }

    public Furniture getTheFurniture() {
        return theFurniture;
    }
}
