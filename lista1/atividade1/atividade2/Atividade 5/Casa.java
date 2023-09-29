public class Casa extends Imovel {
    private int numeroQuartos;
    private double areaTerreno;

    public Casa(String endereco, double preco, int numeroQuartos, double areaTerreno) {
        super(endereco, preco);
        this.numeroQuartos = numeroQuartos;
        this.areaTerreno = areaTerreno;
    }

    public int getNumeroQuartos() {
        return numeroQuartos;
    }

    public double getAreaTerreno() {
        return areaTerreno;
    }

    public void setNumeroQuartos(int numeroQuartos) {
        this.numeroQuartos = numeroQuartos;
    }

    public void setAreaTerreno(double areaTerreno) {
        this.areaTerreno = areaTerreno;
    }

    @Override
    public String toString() {
        return super.toString() + "\nNúmero de Quartos: " + numeroQuartos + "\nÁrea do Terreno: " + areaTerreno + " m²";
    }
}