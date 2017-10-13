package Composition;

public class Case {

    private String model;
    private String manufacturer;
    private String powerSupply;
    private Dimensions dimensions;



    // constructor

    public Case(String model, String manufacturer, String powerSupply, Dimensions dimensions) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.powerSupply = powerSupply;
        this.dimensions = dimensions;
    }

    // methods
    public void pressPowerButton() {
        System.out.println("Power Button pressed");
    }

    // getters

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public Dimensions getDimensions() {
        return dimensions;
    }
}
