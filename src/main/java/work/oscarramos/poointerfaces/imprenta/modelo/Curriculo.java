package work.oscarramos.poointerfaces.imprenta.modelo;

import java.util.ArrayList;
import java.util.List;

public class Curriculo extends Hoja implements Imprimible{
    private Persona perosna;
    private String carrera;
    private List<String> experiencia;
    public Curriculo(Persona perosna, String carrera ,String contenido) {
        super(contenido);
        this.perosna = perosna;
        this.carrera = carrera;
        this.experiencia = new ArrayList<>();
    }
    public Curriculo addExperiencia(String exp){
        experiencia.add(exp);
        return this;
    }
    @Override
    public String imprimir() {
        StringBuilder sb = new StringBuilder("Nombre:" );
        sb.append(perosna.toString()).append("\n")
                .append("Resumen: ").append(this.contenido)
                .append("\n").append("Profesion: ")
                .append(this.carrera).append("\n")
                .append("Experiencia: \n");

        this.experiencia.forEach(exp ->{
            sb.append("- ").append(exp).append("\n");
        });
        return sb.toString();
    }
}
