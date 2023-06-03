import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class contas {
    public static void main(String[] args) {
        Scanner leitorDados = new Scanner(System.in);
        ArrayList dividas = new ArrayList();
        
        int dinheiroJoao = leitorDados.nextInt();
        int dividaAcougue = leitorDados.nextInt();
        int dividaFarmacia = leitorDados.nextInt();
        int dividaPadaria = leitorDados.nextInt();
        
        dividas.add(dividaAcougue);
        dividas.add(dividaFarmacia);
        dividas.add(dividaPadaria);
        
        int totalPago = 0;
        int dividasPagas = 0;
        
        Collections.sort(dividas);
        for(int i=0; i<dividas.size();i++){
            int dividaAnalisada = (int) dividas.get(i);
            if(dividaAnalisada + totalPago <= dinheiroJoao){
                totalPago+=dividaAnalisada;
                dividasPagas+=1;
            }
        }
        
        
        System.out.println(dividasPagas);
        
    }
}
