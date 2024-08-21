import java.util.Date;

public class Aluno extends Pessoa {

    private String nivel;

    public Aluno(String nome, Date nascimento, String genero, double altura, double peso, String nivel) {
        super(nome, nascimento, genero, altura, peso);
        this.nivel = nivel;
    }

    public Aluno(String nome, Date nascimento, String nivel) {
        this(nome, nascimento, "Não informado", 0, 0, nivel);
    }

    public String getNivel() {
        return this.nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return super.toString() + ", Nível: " + nivel;
    }

}