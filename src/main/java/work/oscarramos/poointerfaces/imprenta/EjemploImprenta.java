package work.oscarramos.poointerfaces.imprenta;

import work.oscarramos.poointerfaces.imprenta.modelo.Curriculo;
import work.oscarramos.poointerfaces.imprenta.modelo.Genero;
import work.oscarramos.poointerfaces.imprenta.modelo.Imprimible;
import work.oscarramos.poointerfaces.imprenta.modelo.Informe;
import work.oscarramos.poointerfaces.imprenta.modelo.Libro;
import work.oscarramos.poointerfaces.imprenta.modelo.Pagina;
import work.oscarramos.poointerfaces.imprenta.modelo.Persona;

public class EjemploImprenta {
    public static void main(String[] args) {
        Curriculo cv = new Curriculo(new Persona("Oscar","Ramos"),"Desarrollador Back-End","Resumen laboral... la la la la");
        cv.addExperiencia("Java")
                .addExperiencia("Maven")
                .addExperiencia("Sonarqube")
                .addExperiencia("Spring Framework")
                .addExperiencia("Scrum")
                .addExperiencia("Docker");

        Libro libro = new Libro(new Persona("Erick","Gamma"),"Patrones de diseños: Elem. Reusables POO", Genero.PROGRAMADOR);

        libro.addPaginas(new Pagina("Patron singlenton"))
                .addPaginas(new Pagina("Patron Observador"))
                .addPaginas(new Pagina("Patron Factory"))
                .addPaginas(new Pagina("Patron composite"))
                .addPaginas(new Pagina("Patron Facade"));

        Informe informe = new Informe(new Persona("Martin","Fowler"),new Persona("James","Gosling"), "Estudio de los microservicios");

        imprimir(cv);
        imprimir(informe);
        imprimir(libro);
    }

    public static void imprimir(Imprimible imprimible) {
        System.out.println(imprimible.imprimir());

    }

}
