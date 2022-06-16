/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareapolimorfismo;

/**
 *
 * @author admin
 */
public class Agente extends Empleado {

    @Override
    public void TareaAsignada() {
        System.out.println("Tomar casos generales de nivel medio");
    }

    @Override
    public void Horario() {
        System.out.println("Se mantienen para los agentes horario de 8hrs por dia y 2 dias libres");
    }
    
    private String casoAsignado;

    public Agente(String nombre, String cedula, int badgeNum, int edad, String casoAsignado) {
        super(nombre, cedula, badgeNum, edad);
        this.casoAsignado = casoAsignado;

    }

    public String getCasoAsignado() {
        return casoAsignado;
    }

    public void setCasoAsignado(String casoAsignado) {
        this.casoAsignado = casoAsignado;
    }
}
