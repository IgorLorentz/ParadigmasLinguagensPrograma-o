package HerancaMultipla;

public class Professor extends Pessoa implements iAutenticacao
{
    Professor(String nome, int id, String endereco, String cpf, String titulacao)
    {
        this.nome = nome;
        this.id = id;
        this.endereco = endereco;
        this.cpf = cpf;
        this.titulacao = titulacao;
    }

    @Override
    public boolean autenticar(String id) 
    {
        boolean isAuth = (id.equals("Professor")) ? true : false;
        return isAuth;
    }
}
