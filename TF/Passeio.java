
/**
 * Escreva uma descrição da classe Passeio aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Passeio
{
   private Barco barco;
   private double valorBilhete;
   private Passageiro vetorPassageiros [];
   private int index;
   
   public Passeio (Barco barco, double valorBilhete)
   {
       this.barco = barco;
       this.valorBilhete = valorBilhete;
       this.vetorPassageiros = new Passageiro [barco.getLotacao()];
       this.index = 0;
   }
   
   public void setBarco (Barco barco){
        this.barco = barco;
    }

    public void setValorBilhete (double valorBilhete){
        this.valorBilhete = valorBilhete;
    }
    // métodos getters
    public Barco getBarco (){
        return this.barco;
    }

    public double getValorBilhete (){
        return this.valorBilhete;
    }
    
    public boolean adicionaPassageiro(Passageiro p1){
        if(this.index >= this.vetorPassageiros.length){
            return false;
        } else {
            this.vetorPassageiros[this.index] = p1;
            this.index++;
            return true;
        }
    }
    
    public boolean removePassageiro(String nome)
    {
        for (int i = 0; i< this.index; i++) {
        if (this.vetorPassageiros[i].getNome().equals(nome)){
             for(int j = i; j < this.index-1; j++)
        {
            this.vetorPassageiros [j] = this.vetorPassageiros [j + 1];
        }
           this.vetorPassageiros[this.index-1] = null;      
           this.index--; 
           return true;      
       }
       }
       return false;
    }
    
    public void mostraPasseio() {
    System.out.println("Barco: " + barco);
    System.out.println("Valor do Bilhete: R$" + valorBilhete);
    System.out.println("Passageiros:");
        for (int i = 0; i < this.vetorPassageiros.length; i++) {
            if (this.vetorPassageiros[i] != null) {
                System.out.println(vetorPassageiros[i]);
         }
    }     
    }
    
    public void buscaPasProfissao (String profissao) {
        int cont = 0;
        for (int i = 0; i< this.vetorPassageiros.length; i++) {
            if (this.vetorPassageiros[i] != null && this.vetorPassageiros[i].getProfissao().equalsIgnoreCase(profissao)) {
                cont++;
            }
        }
        if (cont > 0) {
        System.out.println ("O numero que possuem a profissao de  " + profissao + " eh de: " + cont);
       } else {
        System.out.println ("Nao existe ninguem que trabalha com isso");
        }
    }   
    
    public double buscaValorPasseio () {
        int qtdepassageiros = 0;
        double valortotal;
        for (int i= 0; i< this.index; i++) {
            qtdepassageiros++;
        }
        valortotal = (double)valorBilhete * qtdepassageiros;
        return valortotal;
    }
}
