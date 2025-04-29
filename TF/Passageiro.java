
/**
 * Escreva uma descrição da classe Passageiro aqui.
 * 
 * @author (seu nome) 
 * @version (um número da versão ou uma data)
 */
public class Passageiro
{
    private String nome;
    private int idade;
    private String profissao;
    
    // métodos Construtores
    public Passageiro(){
        this.nome = null;
        this.idade = 0;
        this.profissao = null;
    }    

    public Passageiro (String nome, int idade, String profissao) {
        this.nome = nome;
        this.idade = idade;
        this.profissao = profissao;
    }
    // métodos setters
    public void setNome (String nome){
        this.nome = nome;
    }

    public void setIdade (int idade){
        this.idade = idade;
    }

    public void setProfissao (String profissao){
        this.profissao = profissao;
    }
    // métodos getters
    public String getNome (){
        return this.nome;
    }

    public int getIdade (){
        return this.idade;
    }

    public String getProfissao (){
        return this.profissao;
    }

    public String toString(){
       return ("Nome do Passageiro: " + this.nome + " Idade do passageiro: "+ this.idade +  
                " Profissao do passageiro: " + this.profissao);
    }
}
