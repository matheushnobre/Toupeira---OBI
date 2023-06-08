import java.util.ArrayList;
import java.util.Scanner;

public class toupeira {

    public static void main(String[] args) {
        Scanner leitorDados = new Scanner(System.in); //cria um leitor de dados
        ArrayList tuneis = new ArrayList(); //cria um array pros tuneis cadastrados
        int totalPasseiosValidos=0; //inicializa a variavel que ira contar o numero de passeios validos

        //numero de saloes e tuneis
        System.out.println("Digite o número de salões e o número de túneis: ");
        String[] vetor1 = leitorDados.nextLine().split(" "); //leitor que irá receber a primeira linha de dados: numero de saloes e tuneis
        int numeroSaloes = Integer.parseInt(vetor1[0]); //declara numero de saloes
        int numeroTuneis = Integer.parseInt(vetor1[1]); //declara numero de tuneis
        
        //cadastro de tuneis
        for(int i=0; i<numeroTuneis; i++){ //laço de repetição para receber tuneis novos
            System.out.println("Crie um túnel digitando o número de 2 salões: ");
            String[] vetor2 = leitorDados.nextLine().split(" "); //leitor que irá cadastrar tuneis
            int X = Integer.parseInt(vetor2[0]); //cadastra o primeiro salao do tunel
            int Y = Integer.parseInt(vetor2[1]); //cadastra o segundo salao do tunel
            String tunelCriado = ""+X+" "+Y; //tunel criado é armazenado como string
            tuneis.add(tunelCriado); //adiciona o tunel ao arraylist de tuneis
            System.out.println("Túnel criado: "+tunelCriado+"\n");
        } //fecha o laço de repetição e passa para a proxima parte do codigo
       
        //qtd sugestoes de passeio
        System.out.println("Digite quantos passeios serão sugeridos: ");
        int sugestoesPasseio = Integer.parseInt(leitorDados.nextLine()); //linha que ira receber o numero de passeios que serao sugeridos
       
        //sugestoes de passeio
        int totalPasseios=0; //inicializa a variavel que ira contar o total de passeios
        for(int i=0; i<sugestoesPasseio; i++){//esse for irá trabalhar enquanto os passeios estao sendo sugeridos. se ainda tiver passeio para ser sugerido, o laço segue rodando
            System.out.println("Digite a sugestão do passeio: ");
            String[] sugestao = leitorDados.nextLine().split(" ");//pega uma nova linha de entrada, no caso de sugestao de passeio
            int saloesPasseio = Integer.parseInt(sugestao[0]); //recebe o numero de saloes em um passeio
           
            int totalTuneisValidos=0; //quantos tuneis realmente existem num passeio sugerido
            
            int contador=1; //contador pro ciclo de repetição while
            int posiçãoA=1; //será utilizado para verificar a validade dos tuneis
            int posiçãoB=2;
            
            while(contador<saloesPasseio){ //esse while vai verificar os saloes de um passeio e funcionará enquanto o contador for menor que o numero de saloes declarados para esse passeio
                String tunelTestado = sugestao[posiçãoA]+" "+sugestao[posiçãoB]; //será o tunel verificado
                String tunelTestado2 = sugestao[posiçãoB]+" "+sugestao[posiçãoA];//sera o tunel verificado
                posiçãoA++; //aumenta para poder mudar o tunel testado no proximo ciclo
                posiçãoB++;
                
                int contadorCiclo=0; //contador que será utilizado para analisar a validade do tunel testado no momento
                while(contadorCiclo<tuneis.size()){ //enquanto esse contador for menor do que o arraylist de tuneis, o ciclo será executado
                    String tunelAnalisado = (String) tuneis.get(contadorCiclo); //pega um túnel no array para comparar com o tunel que está sendo testado no momento
                    if(tunelTestado.equalsIgnoreCase(tunelAnalisado) || tunelTestado2.equalsIgnoreCase(tunelAnalisado)){ //se o tunel analisado for igual ao tunel da lista que está sendo verificado
                       totalTuneisValidos++; //aumenta em um o total de tuneis validos
                       break;//se o tunel for valido, o ciclo para
                    }else{//se nao, o tunel segue como invalido
                    }
                    contadorCiclo++;//aumenta o contador para seguir testando
                }//fecha o while que verifica se o tunel é valido

                if(totalTuneisValidos == saloesPasseio-1){//verifica se o total de tuneis validos é igual ao numero de saloes-1(numero de tuneis necessarios no passeio)
                    totalPasseiosValidos++; //se for é porque o passeio é válido
                }
                
            contador++;//aumenta o contador para o ciclo se repetir
            }//fecha o while que verifica se o passeio é valido
        }//fecha o ciclo de repetição que recebe novos passeios
        
        System.out.println("Total de passeios válidos: "+totalPasseiosValidos);//exibe o resultado na tela
    }
}