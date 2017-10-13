package CompositionChallenge;

public class Television {

    private String model;
    private String manufacturer;
    private int lenght;
    private int height;

    public Television(String model, String manufacturer, int lenght, int height) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.lenght = lenght;
        this.height = height;
    }


    // methods

    public void powerButton() {
        System.out.println("The TV has been turned ON!");
    }



    // getters

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
