package Heranca;

public class PessoaFisica extends Pessoa {
    PessoaFisica() {

    }

    PessoaFisica(String nome, int rg) {
        this.nome = nome;
        this.rg = rg;
    }

    PessoaFisica(String nome, int rg, int cpf) {
        this.nome = nome;
        this.rg = rg;
        this.cpf = cpf;
    }

    int rg;
    int cpf;
}
