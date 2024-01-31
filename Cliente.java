/*
Trabalho 3º Bimestre
Alunos: Estevão, Rafael Vieira, João Fernando
Data: Setembro/2023
Função global: Controle de cadastro de clientes e Funciónarios
*/
package meutrabalho03;

public class Cliente extends Pessoa {
    
    //Atributos;
    String profissao, cidade;
    
    
    //Get's and Set's
    public String getPorofissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }   
    
    //To String "Filha"
    @Override
    public String toString() {
        return super.toString() +
            "\nProfissao: " + profissao +
            "\nCidade: " + cidade;
    }
}//Fim da classe cliente;
