import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner entrada = new Scanner(System.in);

        int valor = 1;
        int leituras = 0;
        int maiorValor = 0;
        int soma = 0;

        while(valor != 0){
            //entrada
            System.out.print("\nInforme o valor de pressão: ");
            valor = entrada.nextInt();
            //maior valor
            if(maiorValor < valor) maiorValor = valor;
            //soma para a media
            soma += valor;
            //num de leituras
            if(valor != 0) leituras++;
        }
        System.out.println("Total de leituras: " + leituras);
        System.out.println("Maior valor: " + maiorValor);
        double media = (double) soma/leituras;
        System.out.println("Média: " + media);
    }
}
