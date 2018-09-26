public class Main {

    public static void main(String[] args) {

        ProfessorTitular professorTitular = new ProfessorTitular("Joao","Silva",1,"Java");
        ProfessorAdjunto professorAdjunto = new ProfessorAdjunto("Jose",2,10);


        DigitalHouseManager digitalHouseManager = new DigitalHouseManager();


        digitalHouseManager.registrarCurso("Full Stack",20001,3);
        digitalHouseManager.registrarCurso("Android",20002,2);

        digitalHouseManager.alocarProfessores(20001,1,2);

        digitalHouseManager.matricularAluno("Rodrigo","Tavares",1);
        digitalHouseManager.matricularAluno("Carlos","Miguel",2);
        digitalHouseManager.matricularAluno("Eduardo","Cardoso",3);
        digitalHouseManager.matricularAluno("Edson","Souza",4);
        digitalHouseManager.matricularAluno("Joaquim","Bolsonaro",5);
        digitalHouseManager.matricularAluno("Ana","Carol",6);

        System.out.println("-----------------------------------------------------");

        digitalHouseManager.matricularAlunoAoCurso(1,20001);

        System.out.println("-----------------------------------------------------");

        digitalHouseManager.matricularAlunoAoCurso(2,20001);

        System.out.println("-----------------------------------------------------");

        digitalHouseManager.matricularAlunoAoCurso(1,20002);

        System.out.println("-----------------------------------------------------");

        digitalHouseManager.matricularAlunoAoCurso(2,20002);

        System.out.println("-----------------------------------------------------");

        digitalHouseManager.matricularAlunoAoCurso(3,20002);

        System.out.println("-----------------------------------------------------");

        digitalHouseManager.matricularAlunoAoCurso(4,20002);

        System.out.println("-----------------------------------------------------");

        digitalHouseManager.matricularAlunoAoCurso(5,20002);

        System.out.println("-----------------------------------------------------");

        digitalHouseManager.matricularAlunoAoCurso(6,20002);

        System.out.println("-----------------------------------------------------");

        digitalHouseManager.mostrarCursoDoAlunoMatriculado(1);






    }

}
