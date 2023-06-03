import java.util.Scanner;

public class leilao {

    public static void main(String[] args) {
        int numeroLances;
        String nomeGanhador="";
        int lanceVencedor=0;
        
        Scanner leitorDados = new Scanner(System.in);
        numeroLances = leitorDados.nextInt();
        
        for(int i=1; i<=numeroLances; i++){
            String nome=leitorDados.next();
            int lance=leitorDados.nextInt();
            
            if(lance>lanceVencedor){
                lanceVencedor=lance;
                nomeGanhador=nome;
            }
        }
        
        System.out.println(nomeGanhador);
        System.out.println(lanceVencedor);
    }
}
