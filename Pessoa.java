import java.text.ParseException;
import java.util.Date;

public class Pessoa {
    
    private String nome;
    private Date nascimento;
    private String genero;
    private double altura;
    private double peso;

    public Pessoa(String nome, Date nascimento, String genero, double altura, double peso) {
        this.nome = nome;
        this.nascimento = nascimento;
        this.genero = genero;
        this.altura = altura;
        this.peso = peso;
    }

    public Pessoa(String nome, Date nascimento) {
        this(nome, nascimento, "Não informado", 0, 0);
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
            return nome + ", Data de Nascimento: " + Main.convertDateToString(nascimento) + ", Gênero: " + genero
                    + "\nAltura: " + altura + ", Peso: " + peso;
        } catch (ParseException e) {
            e.printStackTrace();
            return "Error";
        }
    }

}
