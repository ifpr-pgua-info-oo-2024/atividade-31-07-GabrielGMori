import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Aluno {

    private String nome;
    private String nivel;
    private Date nascimento;
    private String genero;
    private double altura;
    private double peso;

    public Aluno(String nome, String nivel, Date nascimento, String genero, double altura, double peso) {
        this.nome = nome;
        this.nivel = nivel;
        this.nascimento = nascimento;
        this.genero = genero;
        this.altura = altura;
        this.peso = peso;
    }

    public Aluno(String nome, String nivel, Date nascimento) {
        this(nome, nivel, nascimento, "Não informado", 0, 0);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNivel() {
        return this.nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public Date getNascimento() {
        return this.nascimento;
    }

    public void setNascimento(Date nascimento) {
        this.nascimento = nascimento;
    }

    public String getGenero() {
        return this.genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return this.peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        try {
            return nome + "\nNível: " + nivel + ", Data de Nascimento: " + Main.convertDateToString(nascimento) + ", Gênero: " + genero
                    + "\nAltura: " + altura + ", Peso: " + peso;
        } catch (ParseException e) {
            e.printStackTrace();
            return "Error";
        }
    }

}