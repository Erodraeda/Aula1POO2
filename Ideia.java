import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Ideia {

    private String titulo;
    private String descricao;
    private int urgencia;

    public Ideia(String titulo, String descricao, int urgencia) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.urgencia = urgencia;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public int getUrgencia() {
        return this.urgencia;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String setUrgencia(int urgencia) {
        if (urgencia > 0 && urgencia < 6) {
            this.urgencia = urgencia;
            return "valor válido, urgencia settada para: " + urgencia;
        } else
            return "valor inválido";
    }

}