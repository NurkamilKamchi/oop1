public class Car {
    private String brand;
    private String model;
    private int voluem;

    public Car() {
        brand = getBrand();
    }

    public Car(String brand, String model, int voluem) {
        this.brand = brand;
        this.model = model;
        this.voluem = voluem;
    }


    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getVoluem() {
        return voluem;
    }

    public void setVoluem(int voluem) {
        this.voluem = voluem;
    }
}
