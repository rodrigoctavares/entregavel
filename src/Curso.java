import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Curso {

    private String nome;
    private Integer codigoCurso;
    private ProfessorTitular professorTitular;
    private ProfessorAdjunto professorAdjunto;
    private Integer quantMaximaAlunos;
    private List<Aluno> listaAlunoMatriculado = new ArrayList<>();


    public Curso(String nome, Integer codigoCurso, Integer quantMaximaAlunos) {
        this.nome = nome;
        this.codigoCurso = codigoCurso;
        this.quantMaximaAlunos = quantMaximaAlunos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Curso curso = (Curso) o;
        return Objects.equals(codigoCurso, curso.codigoCurso);
    }

    @Override
    public int hashCode() {

        return Objects.hash(codigoCurso);
    }

//    public Boolean verificarListaAluno(Aluno umAluno){
//        for (Aluno aluno : listaAlunoMatriculado) {
//
//        }
//
//    }


    public Boolean adicionarUmAluno(Aluno umAluno) {
// fazer metodo para verificar se o aluno ja foi adicionado que retorna um boolean e se for true ele adiciona.


            if (quantMaximaAlunos > listaAlunoMatriculado.size()) {
                listaAlunoMatriculado.add(umAluno);
                return true;
            } else {
                System.out.println("O curso esta lotado, voce foi adicionado na proxima turma!");
                return false;
            }

    }

    public void excluirAluno(Aluno umAluno){
        listaAlunoMatriculado.remove(umAluno);
    }



    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCodigoCurso() {
        return codigoCurso;
    }

    public void setCodigoCurso(Integer codigoCurso) {
        this.codigoCurso = codigoCurso;
    }

    public ProfessorTitular getProfessorTitular() {
        return professorTitular;
    }

    public void setProfessorTitular(ProfessorTitular professorTitular) {
        this.professorTitular = professorTitular;
    }

    public ProfessorAdjunto getProfessorAdjunto() {
        return professorAdjunto;
    }

    public void setProfessorAdjunto(ProfessorAdjunto professorAdjunto) {
        this.professorAdjunto = professorAdjunto;
    }

    public Integer getQuantMaximaAlunos() {
        return quantMaximaAlunos;
    }

    public void setQuantMaximaAlunos(Integer quantMaximaAlunos) {
        this.quantMaximaAlunos = quantMaximaAlunos;
    }

    public List<Aluno> getListaAlunoMatriculado() {
        return listaAlunoMatriculado;
    }

    public void setListaAlunoMatriculado(List<Aluno> listaAlunoMatriculado) {
        this.listaAlunoMatriculado = listaAlunoMatriculado;
    }
}
