package Composition;

public class Vehicle {

    private String name;
    private String model;
    private String manufacturer;
    private String modelId;
    private String cases;

    private int id;
    private int dNumber;
    private double caseN;
    private int mId;

    public Vehicle(String name, String model, String manufacturer, String modelId, String cases, int id, int dNumber, double caseN, int mId) {
        this.name = name;
        this.model = model;
        this.manufacturer = manufacturer;
        this.modelId = modelId;
        this.cases = cases;
        this.id = id;
        this.dNumber = dNumber;
        this.caseN = caseN;
        this.mId = mId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModelId() {
        return modelId;
    }

    public void setModelId(String modelId) {
        this.modelId = modelId;
    }

    public String getCases() {
        return cases;
    }

    public void setCases(String cases) {
        this.cases = cases;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getdNumber() {
        return dNumber;
    }

    public void setdNumber(int dNumber) {
        this.dNumber = dNumber;
    }

    public double getCaseN() {
        return caseN;
    }

    public void setCaseN(double caseN) {
        this.caseN = caseN;
    }

    public int getmId() {
        return mId;
    }

    public void setmId(int mId) {
        this.mId = mId;
    }
}
