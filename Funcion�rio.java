/*
Trabalho 3º Bimestre
Alunos: Estevão, Rafael Vieira, João Fernando
Data: Setembro/2023
Função global: Controle de cadastro de clientes e Funciónarios
*/
package meutrabalho03;

public class Funcionário extends Pessoa {
    
    //Atributos;
    String cargo;
    float salario;
    
    //Set´s
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
    
    //To string "filha"
    @Override
    public String toString() {
        return super.toString() +
            "\nCargo: " + cargo +
            "\nSalario: " + salario;
    }
    
}//Fim da classe pessoa;
