
/**
 * Escreva uma descrição da classe CadastroBarcos aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class CadastroBarcos
{
    private Barco vetorBarcos[];
    private int index;

    public CadastroBarcos(){
        //criação de vetor de objetos
        this.vetorBarcos = new Barco[10];
        this.index = 0;
    }
    //Verifica se há espaço disponível no vetor. 
    //Se houver, o objeto Pessoa é adicionado ao vetor na posição index e esta 
    //é incrementada. Se o vetor estiver cheio retorna false.
    public boolean adicionaBarco(Barco b1){
        if(this.index >= this.vetorBarcos.length){
            return false;
        } else {
            this.vetorBarcos[this.index] = b1;
            this.index++;
            return true;
        }
    }
    //Percorre o vetor e verifica se o objeto p1 está nele. Se o objeto for 
    //encontrado, o método retorna a posição em que foi encontrado. 
    //Senão retorna -1 para indicar que o objeto não foi encontrado.
     public Barco buscaBarcoNome(String nome) 
     { 
         for(int i=0; i<this.index; i++)
         {
            if(this.vetorBarcos[i].getNome().equals (nome))
            {
               return this.vetorBarcos[i];
            }                 
        }
        return null;
    }
    
    public boolean removeBarco(String nome)
    {
        for (int i = 0; i< this.index; i++) {
        if (this.vetorBarcos[i].getNome().equals(nome)){
             for(int j = i; j < this.index-1; j++)
        {
            this.vetorBarcos [j] = this.vetorBarcos [j + 1];
        }
           this.vetorBarcos[this.index-1] = null;      
           this.index--; 
           return true;      
       }
       }
       return false;
    }
    //mostra o vetor    
    public void mostraBarcos(){
        for(int i = 0; i < this.index; i++)
        {
            System.out.println("\nCadastro de Barcos na posicao " + (i+1)+ 
                               "\n******** ** ******* ** *******");            
            System.out.println(this.vetorBarcos[i].toString());
        }        
    }
}
