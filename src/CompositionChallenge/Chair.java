package CompositionChallenge;

public class Chair {

    private String model;
    private String manufacturer;
    private int lenght;
    private int height;

    public Chair(String model, String manufacturer, int lenght, int height) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.lenght = lenght;
        this.height = height;
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getLenght() {
        return lenght;
    }

    public int getHeight() {
        return height;
    }
}
