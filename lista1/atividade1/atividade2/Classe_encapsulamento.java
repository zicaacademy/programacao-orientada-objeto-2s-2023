public class Imovel {
    private String endereco;
    private double preco;

    public Imovel(String endereco, double preco) {
        this.endereco = endereco;
        this.preco = preco;
    }

    public String getEndereco() {
        return endereco;
    }

    public double getPreco() {
        return preco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Endereço: " + endereco + "\nPreço: R$" + preco;
    }
}

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

public class Apartamento extends Imovel {
    private int numeroComodos;
    private boolean possuiVaranda;

    public Apartamento(String endereco, double preco, int numeroComodos, boolean possuiVaranda) {
        super(endereco, preco);
        this.numeroComodos = numeroComodos;
        this.possuiVaranda = possuiVaranda;
    }

    public int getNumeroComodos() {
        return numeroComodos;
    }

    public boolean isPossuiVaranda() {
        return possuiVaranda;
    }

    public void setNumeroComodos(int numeroComodos) {
        this.numeroComodos = numeroComodos;
    }

    public void setPossuiVaranda(boolean possuiVaranda) {
        this.possuiVaranda = possuiVaranda;
    }

    @Override
    public String toString() {
        return super.toString() + "\nNúmero de Cômodos: " + numeroComodos + "\nPossui Varanda: " + (possuiVaranda ? "Sim" : "Não");
    }
}

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

public class Main {
    public static void main(String[] args) {
        Imovel imovel1 = new Imovel("Rua A, 123", 150000.0);
        Casa casa1 = new Casa("Rua B, 456", 250000.0, 3, 200.0);
        Apartamento apartamento1 = new Apartamento("Av. C, 789", 180000.0, 2, true);
        Terreno terreno1 = new Terreno("Estrada D, 101", 100000.0, 500.0);

        System.out.println("Informações do Imóvel:");
        System.out.println(imovel1);

        System.out.println("\nInformações da Casa:");
        System.out.println(casa1);

        System.out.println("\nInformações do Apartamento:");
        System.out.println(apartamento1);

        System.out.println("\nInformações do Terreno:");
        System.out.println(terreno1);
    }
}
