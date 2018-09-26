public class ProfessorAdjunto extends Professor {

    private Integer quantHorasMentoria;

    public ProfessorAdjunto(String nome, Integer codigoProfessor, Integer quantHorasMentoria) {
        super.setNome(nome);
        super.setCodigoProfessor(codigoProfessor);
        this.quantHorasMentoria = quantHorasMentoria;
    }

    public Integer getQuantHorasMentoria() {
        return quantHorasMentoria;
    }

    public void setQuantHorasMentoria(Integer quantHorasMentoria) {
        this.quantHorasMentoria = quantHorasMentoria;
    }
}
