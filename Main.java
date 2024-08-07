public class Main {
    
    public static void main(String[] args) {
       
        Academia academia1 = new Academia("Rogers", "Rua Jocas", "(12)1234-1234");
        Academia academia2 = new Academia("uauauau", "Rua Camelos", "(12)1234-1235");

        System.out.println(academia1.getNome() + " " + academia1.getEndereco() + " " + academia1.getTelefone());
        System.out.println(academia2.getNome() + " " + academia2.getEndereco() + " " + academia2.getTelefone());

        academia1.setNome("Rogeritos");
        academia1.setEndereco("Rua São Tomas");
        academia1.setTelefone("(11)2222-2222");

        academia2.setNome("Weighting");
        academia2.setEndereco("Rua Carlinhos");
        academia2.setTelefone("(21)5436-8675");

        System.out.println(academia1.getNome() + " " + academia1.getEndereco() + " " + academia1.getTelefone());
        System.out.println(academia2.getNome() + " " + academia2.getEndereco() + " " + academia2.getTelefone());

    }
 
}
