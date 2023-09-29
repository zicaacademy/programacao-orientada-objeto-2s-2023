
public class Terreno extends Imovel {
    private double area;

    public Terreno(String endereco, double preco, double area) {
        super(endereco, preco);
        this.area = area;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return super.toString() + "\nÁrea do Terreno: " + area + " m²";
    }
}