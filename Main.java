import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

    public static void main(String[] args) throws ParseException {

        Academia academia1 = new Academia("Rogers", "Rua Jocas", "(12)1234-1234");
        Academia academia2 = new Academia("uauauau", "Rua Camelos", "(12)1234-1235");

        // System.out.println(academia1.getNome() + " " + academia1.getEndereco() + " " + academia1.getTelefone());
        // System.out.println(academia2.getNome() + " " + academia2.getEndereco() + " " + academia2.getTelefone());

        academia1.setNome("Rogeritos");
        academia1.setEndereco("Rua São Tomas");
        academia1.setTelefone("(11)2222-2222");

        academia2.setNome("Weighting");
        academia2.setEndereco("Rua Carlinhos");
        academia2.setTelefone("(21)5436-8675");

        // System.out.println(academia1.getNome() + " " + academia1.getEndereco() + " " + academia1.getTelefone());
        // System.out.println(academia2.getNome() + " " + academia2.getEndereco() + " " + academia2.getTelefone());

        System.out.println("");

        Aluno aluno1 = new Aluno("Joãozinho", "iniciante", convertStringToDate("12/08/2099"));
        academia1.alunos.add(aluno1);

        Aluno aluno2 = new Aluno("Joãozinho (Clone)", "iniciante", convertStringToDate("15/09/2099"));
        academia1.alunos.add(aluno2);

        Aluno aluno3 = new Aluno("Matheus", "avançado", convertStringToDate("14/03/2100"), "masculino", 1.7, 78.2);
        academia1.alunos.add(aluno3);

        Aluno aluno4 = new Aluno("Sérgio", "iniciante", convertStringToDate("12/12/2097"), "masculino", 1.72, 76.5);
        academia2.alunos.add(aluno4);

        Aluno aluno5 = new Aluno("Roger", "intermediário", convertStringToDate("13/05/2096"), "masculino", 1.81, 62.5);
        academia2.alunos.add(aluno5);

        Aluno aluno6 = new Aluno("Pedro", "intermediário", convertStringToDate("14/05/2100"), "masculino", 1.75, 70.8);
        academia2.alunos.add(aluno6);

        System.out.println("Academia 1:" + "\n");
        for (int i = 0; i < academia1.alunos.size(); i++) {
            System.out.println(academia1.alunos.get(i).toString() + "\n");
        }

        System.out.println("");

        System.out.println("Academia 2:" + "\n");
        for (int i = 0; i < academia2.alunos.size(); i++) {
            System.out.println(academia2.alunos.get(i).toString() + "\n");
        }

    }

    public static Date convertStringToDate(String date) throws ParseException {
        SimpleDateFormat formato = new SimpleDateFormat("dd/mm/yyyy");
        return formato.parse(date);
    }

    public static String convertDateToString(Date date) throws ParseException {
        SimpleDateFormat formato = new SimpleDateFormat("dd/mm/yyyy");
        return formato.format(date);
    }

}