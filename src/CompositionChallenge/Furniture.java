package CompositionChallenge;

public class Furniture {

    private Television theTV;
    private Couch theCouch;
    private Chair theChair;


    public Furniture(Television theTV, Couch theCouch, Chair theChair) {
        this.theTV = theTV;
        this.theCouch = theCouch;
        this.theChair = theChair;
    }


    // methods

    public void powerUp() {
        System.out.println("Turning on the TV..");
        theTV.powerButton();
    }

    // getters

    public Television getTheTV() {
        return theTV;
    }

    public Couch getTheCouch() {
        return theCouch;
    }

    public Chair getTheChair() {
        return theChair;
    }
}
