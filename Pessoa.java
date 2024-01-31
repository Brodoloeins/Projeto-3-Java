/*
Trabalho 3º Bimestre
Alunos: Estevão, Rafael Vieira, João Fernando
Data: Setembro/2023
Função global: Controle de cadastro de clientes e Funciónarios
*/
package meutrabalho03;

public abstract class Pessoa {
    
    //Atributos
    String nome, cpf, telefone;
    
    //Get's and Set's
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    //To string "pai"
    @Override
    public String toString(){
        return "Nome: " + nome + "\nCPF: " + cpf + "\nTelefone: " + telefone;
    }
    
}//Fim classe Pessoa;
