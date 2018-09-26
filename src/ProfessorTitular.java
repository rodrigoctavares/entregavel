public class ProfessorTitular extends Professor {

    private String especialidade;

    public ProfessorTitular(String nome, String sobrenome, Integer codigoProfessor, String especialidade) {
        super.setNome(nome);
        super.setSobrenome(sobrenome);
        super.setCodigoProfessor(codigoProfessor);
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
