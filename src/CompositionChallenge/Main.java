package CompositionChallenge;

public class Main {

    public static void main(String[] args) {

        Television theTelevision = new Television("24 Zoll ADB","Acer", 5, 4);
        Couch theCouch = new Couch("Ikea 523B", "Gucci", 24, 3);
        Chair theChair = new Chair("HolzChair 24s", "Bosch", 3, 2);

        Furniture theFurniture = new Furniture(theTelevision, theCouch, theChair);

        Room theRoom = new Room(theFurniture);

        theRoom.getTheFurniture().powerUp();


    }
}
