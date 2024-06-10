package HerancaMultipla;

public class Administrativo extends Pessoa implements iAutenticacao
{
    Administrativo(String nome, int id, String endereco, String cpf, String funcao)
    {
        this.nome = nome;
        this.id = id;
        this.endereco = endereco;
        this.cpf = cpf;
        this.funcao = funcao;
    }

    @Override
    public boolean autenticar(String id) 
    {
        boolean isAuth = (id.equals("FunAdm")) ? true : false;
        return isAuth;
    }
}
