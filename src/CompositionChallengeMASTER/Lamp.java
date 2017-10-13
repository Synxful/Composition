package CompositionChallengeMASTER;

public class Lamp {

    private String style;
    private boolean battery;
    private int globrating;

    public Lamp(String style, boolean battery, int globrating) {
        this.style = style;
        this.battery = battery;
        this.globrating = globrating;
    }

    // methods

    public void turnOn() {
        System.out.println("Lamp -> Turning on!");
    }


    // getters
    public String getStyle() {
        return style;
    }

    public boolean isBattery() {
        return battery;
    }

    public int getGlobrating() {
        return globrating;
    }
}
