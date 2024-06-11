package Heranca;

public class PessoaJuridica extends Pessoa {
    PessoaJuridica(){

    }

    PessoaJuridica(String razaoSocial, int inscEstd){
        this.inscEstd = inscEstd;
        this.nome = razaoSocial;
    }

    PessoaJuridica(String razaoSocial, int inscEstd, int cnpj){
        this.inscEstd = inscEstd;
        this.nome = razaoSocial;
        this.cnpj = cnpj;
    }

    int inscEstd;
    int cnpj;
}
