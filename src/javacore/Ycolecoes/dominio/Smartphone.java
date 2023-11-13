package src.javacore.Ycolecoes.dominio;

public class Smartphone {
    private String serialNumber;
    private String marca;
    // se x.equals(y) == true, y.hashcode() == x.hashcode()
    // y.hashcode() == x.hashcode() não necessariamente o equals de y.equals(x) tem que ser true
    // x.equals(y) == false
    // y.hashcode() != x.hashcode() x.equals(y) deverá ser false.

    @Override
    public int hashCode() {
        return serialNumber == null ? 0 : this.serialNumber.hashCode();
    }

    public Smartphone(String serialNumber, String marca) {
        this.serialNumber = serialNumber;
        this.marca = marca;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
}
