package academy.devdojo.maratonajava.javacore.Y_collections.domain;

public class Smartphone {
    private String serialNumber;
    private String brand;

    public Smartphone(String seriaNumber, String brand) {
        this.serialNumber = seriaNumber;
        this.brand = brand;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if(this == obj) return true;
        if(this.getClass() != obj.getClass()) return false;
        Smartphone smartphone = (Smartphone) obj;

        return serialNumber != null && serialNumber.equals(smartphone.serialNumber);
    }

    // if x.equals(y) == true, y.hashCode() == x.hashCode()
    // if y.hashCode() == x.hashCode() == true, doesn't mean that x.equals(y) == true as well
    // x.equals(y) == false
    // y.hashCode() != x.hashCode(), x.equals(y) must be false
    @Override
    public int hashCode() {
        return serialNumber == null ? 0 : this.serialNumber.hashCode();
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
