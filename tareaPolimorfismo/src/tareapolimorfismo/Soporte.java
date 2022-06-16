/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareapolimorfismo;

/**
 *
 * @author admin
 */
public class Soporte extends Empleado implements InterfaceFeedback {

    private String agenteAsignado;

    public Soporte(String nombre, String cedula, int badgeNum, int edad, String agenteAsignado) {
        super(nombre, cedula, badgeNum, edad);

        this.agenteAsignado = agenteAsignado;
    }

    public String getCasoAsignado() {
        return agenteAsignado;
    }

    public void setCasoAsignado(String casoAsignado) {
        this.agenteAsignado = agenteAsignado;
    }

    @Override
    public void TareaAsignada() {
        System.out.println("Ayudar a resolver dudas y escalaciones de los agentes");
    }

    @Override
    public void Horario() {
        System.out.println("El horario para los soportes sera 9hrs por dias y 2 dias libres");
    }

    @Override
    public String Feedback (){
        System.out.println("El feedback brindado por los soporte debe ser tecnico");
        return "Feedback"; 
    }

}
