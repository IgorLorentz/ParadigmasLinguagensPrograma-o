package HerancaMultipla;

public class Aluno extends Pessoa implements iAutenticacao
{
    Aluno(String nome, int id, String endereco, String cpf, String curso)
    {
        this.nome = nome;
        this.id = id;
        this.endereco = endereco;
        this.cpf = cpf;
        this.curso = curso;
    }

    @Override
    public boolean autenticar(String id) 
    {
        boolean isAuth = (id.equals("Aluno")) ? true : false;
        return isAuth;
    }
}
