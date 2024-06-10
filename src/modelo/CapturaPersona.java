/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author 59397
 */
public class CapturaPersona {
    private String nombre;
    private String apellido;
    private String genero;
    private int edad;

    public CapturaPersona() {
    }

    public CapturaPersona(String nombre, String apellido, String genero, int edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
      public void imprimir(){
        System.out.println("Datos del Coche"+"\n"+
                "Nombre:"+getNombre()+"\n"+
                "Apellido:"+getApellido()+"\n"+
                "Genero"+getGenero()+"\n"+
                "Edad"+getEdad()+"\n");
        
    }
    
}
