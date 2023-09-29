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