import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner entrada = new Scanner(System.in);

        System.out.println("CALCULADORA DE INVESTIMENTOS\n");

        System.out.println("Informe quantos reais você ja possui guardados: ");
        double guardado = entrada.nextDouble();

        System.out.println("Informe quantos reais pretende depositar todo mês: ");
        double depositoMensal = entrada.nextDouble();

        System.out.println("Informe sua meta final em reais: ");
        double meta = entrada.nextDouble();
        
        double valorFinal = guardado;

        int mes = 0;
        while(valorFinal < meta){
            valorFinal += depositoMensal;
            mes++;
            System.out.println("\nTotal acumulado: " + valorFinal + "R$");
            System.out.println("mês: " + mes + "\n");
        }

        System.out.println("Leva cerca de " + mes + " meses para bater a meta de " + meta + "R$");
        System.out.println("Valor final acumulado: " + valorFinal + "R$");
    }
}
