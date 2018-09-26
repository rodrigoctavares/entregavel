import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;

public class Matricula {

    private Aluno aluno;
    private Curso curso;
    private LocalDateTime dataDeMatricula;


    public Matricula(Aluno aluno, Curso curso, LocalDateTime dataDeMatricula) {
        this.aluno = aluno;
        this.curso = curso;
        this.dataDeMatricula = dataDeMatricula;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Matricula matricula = (Matricula) o;
        return Objects.equals(aluno,o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aluno);
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public LocalDateTime getDataDeMatricula() {
        return dataDeMatricula;
    }

    public void setDataDeMatricula(LocalDateTime dataDeMatricula) {
        this.dataDeMatricula = dataDeMatricula;
    }
}
