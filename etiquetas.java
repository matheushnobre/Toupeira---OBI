import java.util.Scanner;

public class etiquetas {
    static int ladoRed, ladoGreen, ladoBlue;
    static int totalEtiquetasRed=1, totalEtiquetasGreen, totalEtiquetasBlue, totalEtiquetas;
    
    public static void main(String[] args) {
        Scanner leitorDados = new Scanner(System.in);
        System.out.println("Digite a medida do lado vermelho: ");
        ladoRed = leitorDados.nextInt();
        System.out.println("Digite a medida do lado verde: ");
        ladoGreen = leitorDados.nextInt();
        System.out.println("Digite a medida do lado azul: ");
        ladoBlue = leitorDados.nextInt();
        
        if(ladoGreen > ladoRed){
            totalEtiquetasGreen=0;
            totalEtiquetasBlue=0;
        }
        
        else if(ladoGreen <= ladoRed){
            int quantidadeVerdesHorizontal = Math.round(ladoRed / ladoGreen);
            totalEtiquetasGreen = quantidadeVerdesHorizontal * quantidadeVerdesHorizontal;
            
            if(ladoBlue > ladoGreen){
                totalEtiquetasBlue=0;
            }
            else if(ladoBlue <= ladoGreen){
                int quantidadeAzuisHorizontalEmUmaEtiquetaVerde = Math.round(ladoGreen / ladoBlue);
                int etiquetasAzuisEmUmaEtiquetaVerde = quantidadeAzuisHorizontalEmUmaEtiquetaVerde * quantidadeAzuisHorizontalEmUmaEtiquetaVerde;
                totalEtiquetasBlue = etiquetasAzuisEmUmaEtiquetaVerde * totalEtiquetasGreen;
            }
        }
        
        totalEtiquetas = totalEtiquetasRed + totalEtiquetasGreen + totalEtiquetasBlue;
        
        
        System.out.println("\nTotal de etiquetas vermelhas: "+totalEtiquetasRed);
        System.out.println("Total de etiquetas verdes: "+totalEtiquetasGreen);
        System.out.println("Total de etiquetas azuis: "+totalEtiquetasBlue);
        System.out.println("Total de etiquetas: "+totalEtiquetas);
    }
    
}
