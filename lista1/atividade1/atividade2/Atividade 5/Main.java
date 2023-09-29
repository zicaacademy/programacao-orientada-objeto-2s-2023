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