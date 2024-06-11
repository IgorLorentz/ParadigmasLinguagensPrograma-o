package HerancaMultipla;

import java.util.List;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        List<Aluno> aluno = new ArrayList<Aluno>();
        List<Professor> prof = new ArrayList<Professor>();
        List<Administrativo> funAdm = new ArrayList<Administrativo>();

        int[] aluno_ids = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String[] aluno_nomes = {"Ana", "Bruno", "Carla", "Daniel", "Eduarda", "Felipe", "Gabriela", "Henrique", "Isabela", "João"};
        String[] aluno_enderecos = {"Rua A, 123", "Rua B, 234", "Rua C, 345", "Rua D, 456", "Rua E, 567", "Rua F, 678", "Rua G, 789", "Rua H, 890", "Rua I, 901", "Rua J, 012"};
        String[] aluno_cpfs = {"111.222.333-44", "222.333.444-55", "333.444.555-66", "444.555.666-77", "555.666.777-88", "666.777.888-99", "777.888.999-00", "888.999.000-11", "999.000.111-22", "000.111.222=33"};
        String[] aluno_cursos = {"Engenharia", "Medicina", "Direito", "Computação", "Matemática", "Física", "Química", "Biologia", "História", "Geografia"};

        String [] professor_nomes = {"Marcos", "Cláudia", "Renato", "Tatiana", "Fernando"};
        int [] professor_ids = {1, 2, 3, 4, 5};
        String [] professor_enderecos = {"Av. A, 123", "Av. B, 234", "Av. C, 345", "Av. D, 456", "Av. E, 567"};
        String [] professor_cpfs = {"111.222.333-44", "222.333.444-55", "333.444.555-66", "444.555.666-77", "555.666.777-88"};
        String [] professor_titulacoes = {"Doutorado", "Mestrado", "Doutorado", "Especialização", "Mestrado"};

        String [] funcionario_nomes = {"Sônia", "Paulo", "Roberta", "Carlos", "Luiza"};
        int [] funcionario_ids = {1, 2, 3, 4, 5};
        String [] funcionario_enderecos = {"Rua X, 123", "Rua Y, 234", "Rua Z, 345", "Rua W, 456", "Rua V, 567"};
        String [] funcionario_cpfs = {"111.222.333-44", "222.333.444-55", "333.444.555-66", "444.555.666-77", "555.666.777-88"};
        String [] funcionario_funcoes = {"Secretária", "Bibliotecário", "Auxiliar Administrativo", "Técnico de Informática", "Recepcionista"};

        for (int i = 0; i <= 9; i++) {
            Aluno a = new Aluno(aluno_nomes[i], aluno_ids[i], aluno_enderecos[i], aluno_cpfs[i], aluno_cursos[i]);
            aluno.add(a);
        }

        for (int i = 0; i <= 4; i++) {
            Professor p = new Professor(professor_nomes[i], professor_ids[i], professor_enderecos[i], professor_cpfs[i], professor_titulacoes[i]);
            prof.add(p);
        }

        for (int i = 0; i <= 4; i++) {
            Administrativo ad = new Administrativo(funcionario_nomes[i], funcionario_ids[i], funcionario_enderecos[i], funcionario_cpfs[i], funcionario_funcoes[i]);
            funAdm.add(ad);
        }

        System.out.println(aluno.size());
        System.out.println(prof.size());
        System.out.println(funAdm.size());

    }
}