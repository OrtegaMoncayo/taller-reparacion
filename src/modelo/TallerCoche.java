/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author 59397
 */
public class TallerCoche {
    private String nombrePropietario;
    private String marca;
    private String placa;
    private boolean siRepara;

    public TallerCoche() {
    }

    public TallerCoche(String nombrePropietario, String marca, String placa, boolean siRepara) {
        this.nombrePropietario = nombrePropietario;
        this.marca = marca;
        this.placa = placa;
        this.siRepara = siRepara;
    }

    public String getNombrePropietario() {
        return nombrePropietario;
    }

    public void setNombrePropietario(String nombrePropietario) {
        this.nombrePropietario = nombrePropietario;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public boolean getSiRepara() {
        return siRepara;
    }

    public void setSiRepara(boolean siRepara) {
        this.siRepara = siRepara;
    }
    
     public void imprimir(){
        System.out.println("Datos del Coche"+"\n"+
                "Nombre del Propietario"+getNombrePropietario()+"\n"+
                "Marca"+getMarca()+"\n"+
                "Placa"+getPlaca()+"\n"+
                "Reparacion o cambio"+getSiRepara()+"\n");
        
    }
}
