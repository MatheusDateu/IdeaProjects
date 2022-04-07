package BudgetCalculator;

public class BudgetCalculatorModel {
    private String name;
    private Double v1;
    private Double parcel;
    private Double currentP;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getV1() {
        return this.v1;
    }

    public void setV1(Double v1) {
        this.v1 = v1;
    }

    public Double getParcel() {
        return this.parcel;
    }

    public void setParcel(Double parcel) {
        this.parcel = parcel;
    }

    public Double getCurrentP() {
        return this.currentP;
    }

    public void setCurrentP(Double currentP) {
        this.currentP = currentP;
    }

}
