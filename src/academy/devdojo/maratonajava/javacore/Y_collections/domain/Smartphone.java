package academy.devdojo.maratonajava.javacore.Y_collections.domain;

public class Smartphone {
    private String seriaNumber;
    private String brand;

    public Smartphone(String seriaNumber, String brand) {
        this.seriaNumber = seriaNumber;
        this.brand = brand;
    }

    public String getSeriaNumber() {
        return seriaNumber;
    }

    public void setSeriaNumber(String seriaNumber) {
        this.seriaNumber = seriaNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
