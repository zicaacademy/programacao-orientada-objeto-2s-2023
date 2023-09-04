package lista1.atividade1;

/**
 * verificaNumeroPrimo
 */
public class verificaNumeroPrimo {
    public static void main(String args[]) {
        System.out.println("Ola, mundo!");
        verificarNumeroPrimo(1232132131);
    }

    public static void verificarNumeroPrimo(Integer n){
        if (n <= 1) {
            return 0; 
        }
        
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return 0; 
            }
        }
        
        return 1; 
    }
    
}