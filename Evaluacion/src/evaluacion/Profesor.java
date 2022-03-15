/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package evaluacion;

enum Tipo{
    horacatedra, Mediotiempo, Tiempocompleto
}

/**
 *
 * @author Estudiante
 */
public class Profesor {
    private int cedula;
    private String nombre;
    private int horas;
    private Tipo tipo;

    public Profesor(int cedula, String nombre, int horas, Tipo tipo) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.horas = horas;
        this.tipo = tipo;
    }

    public int getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public int getHoras() {
        return horas;
    }

    public Tipo getTipo() {
        return tipo;
    }
    
    String getTipoFormat() {
        switch (tipo) {
            case horacatedra:
                return "Hora catedra";
            case Mediotiempo:
                return "medio tiempo";
            default:
                return "Tiempo completo";
            
        }
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }


    
    
}
