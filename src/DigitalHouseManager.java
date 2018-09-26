import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class DigitalHouseManager {

    private List<Aluno> listaDeAluno = new ArrayList<>();
    private List<Professor> listaDeProfessor = new ArrayList<>();
    private List<Curso> listaDeCurso = new ArrayList<>();
    private List<Matricula> listaDeMatricula = new ArrayList<>();

    public Curso buscarCursoPorCodigo(Integer codigoCurso) {
        for (Curso curso : listaDeCurso) {
            if (curso.getCodigoCurso().equals(codigoCurso)) {
                return curso;
            }
        }
        return null;
    }

    public Aluno buscarAlunoPorCodigo(Integer codigoAluno) {
        for (Aluno aluno : listaDeAluno) {
            if (aluno.getCodigoAluno().equals(codigoAluno)) {

                return aluno;
            }

        }
        return null;

    }


    public void registrarCurso(String nome, Integer codigoCurso, Integer quantidadeMaximaDeAlunos) {

        Curso curso = new Curso(nome, codigoCurso, quantidadeMaximaDeAlunos);
        listaDeCurso.add(curso);

    }

    public void excluirCurso(Integer codigoCurso) {

        for (Curso curso : listaDeCurso) {
            if (curso.equals(codigoCurso)) {
                listaDeCurso.remove(codigoCurso);
                System.out.println("O curso foi excluido");
            }

        }


    }

    public void registrarProfessorAdjunto(String nome, Integer codigoProfessor, Integer quantidadeDeHoras) {

        ProfessorAdjunto professorAdjunto = new ProfessorAdjunto(nome, codigoProfessor, quantidadeDeHoras);
        listaDeProfessor.add(professorAdjunto);

    }

    public void registrarProfessorTitular(String nome, String sobrenome, Integer codigoProfessor, String especialidade) {

        ProfessorTitular professorTitular = new ProfessorTitular(nome, sobrenome, codigoProfessor, especialidade);
        listaDeProfessor.add(professorTitular);

    }

    public void excluirProfessor(Integer codigoProfessor) {

        listaDeProfessor.remove(codigoProfessor);
        System.out.println("O professor foi excluido!");

    }

    public void matricularAluno(String nome, String sobrenome, Integer codigoAluno) {

        Aluno aluno = new Aluno(nome, sobrenome, codigoAluno);
        listaDeAluno.add(aluno);
        System.out.println("Bem vindo " + nome + "!");
        System.out.println("Voce faz parte da Digital House!");
        System.out.println("-----------------------------------");

    }

    public void matricularAlunoAoCurso(Integer codigoAluno, Integer codigoCurso) {


//        if (buscarCursoPorCodigo(codigoCurso).adicionarUmAluno(buscarAlunoPorCodigo(codigoAluno))) {
//            System.out.println("O aluno " + buscarAlunoPorCodigo(codigoAluno).getNome() + " foi adicionado com sucesso ao curso "+buscarCursoPorCodigo(codigoCurso).getNome());
//        } else {
//            System.out.println("Nao foi possivel matricular o aluno!");
//        }
//    }

        Curso curso = buscarCursoPorCodigo(codigoCurso);
        Aluno aluno = buscarAlunoPorCodigo(codigoAluno);

        if (curso.adicionarUmAluno(aluno)) {
            Matricula matricula = new Matricula(aluno, curso, LocalDateTime.now());
            System.out.println("A matricula foi realizada com sucesso!");
            listaDeMatricula.add(matricula);

        } else {
            System.out.println("Nao foi possivel realizar a matricula do aluno!");
        }
    }


    public void alocarProfessores(Integer codigoCurso, Integer codigoProfessorTitular, Integer codigoProfessorAdjunto) {
        ProfessorTitular professorTitular = null;
        ProfessorAdjunto professorAdjunto = null;

        for (Professor professor : listaDeProfessor) {
            if (professor.getCodigoProfessor() == codigoProfessorTitular) {
                professorTitular = (ProfessorTitular) professor;
                System.out.println("O professor titular " + professorTitular.getNome() + " foi alocado com sucesso!");
            }
            if (professor.getCodigoProfessor() == codigoProfessorAdjunto) {
                professorAdjunto = (ProfessorAdjunto) professor;
                System.out.println("O professor adjunto " + professorAdjunto.getNome() + " foi alocado com sucesso!");
            }
        }
        for (Curso curso : listaDeCurso) {
            if (curso.getCodigoCurso() == codigoCurso) {
                try {
                    curso.setProfessorAdjunto(professorAdjunto);
                } catch (NullPointerException e) {
                    System.out.println("Professor Adjunto nao encontrado");
                }
                try {
                    curso.setProfessorTitular(professorTitular);
                } catch (NullPointerException e) {
                    System.out.println("Professor Titular nao encontrado");
                }
            }
        }

    }

    public void mostrarCursoDoAlunoMatriculado(Integer codigoAluno) {

        Aluno aluno = buscarAlunoPorCodigo(codigoAluno);

        int matricula = 0;

        for (Matricula umaMatricula : listaDeMatricula) {
            if (umaMatricula.getAluno().equals(aluno)) {
                System.out.println("----------------------------");
                System.out.println("O aluno " + aluno.getNome() + " esta matriculado no curso " + umaMatricula.getCurso().getNome());
                matricula++;
            }

        }
        if (matricula == 0){
            System.out.println("Aluno nào encontrado!");
        }


    }

}





