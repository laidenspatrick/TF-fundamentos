
/**
 * Escreva uma descrição da classe Barco aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Barco
{
    private String nome;
    private int codigo;
    private int lotacao;
    
    // métodos Construtores
    public Barco(){
        this.nome = null;
        this.codigo = 0;
        this.lotacao = 0;
    }    

    public Barco (String nome, int codigo, int lotacao) {
        this.nome = nome;
        this.codigo = codigo;
        this.lotacao = lotacao;
    }
    // métodos setters
    public void setNome (String nome){
        this.nome = nome;
    }

    public void setCodigo (int codigo){
        this.codigo = codigo;
    }

    public void setLotacao (int lotacao){
        this.lotacao = lotacao;
    }
    // métodos getters
    public String getNome (){
        return this.nome;
    }

    public int getCodigo (){
        return this.codigo;
    }

    public int getLotacao (){
        return this.lotacao;
    }

    public String toString(){
       return ("Nome do barco: " + this.nome + " Codigo do barco: "+ this.codigo +  
                "Lotacao do barco: " + this.lotacao);
    }

}
