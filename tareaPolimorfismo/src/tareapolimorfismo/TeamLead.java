/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareapolimorfismo;

/**
 *
 * @author admin
 */
public class TeamLead extends Management implements InterfaceFeedback{

    private int NumAgentes;

    public TeamLead(String nombre, String cedula, int badgeNum, int edad, String equipoAsignado, int NumAgentes) {
        super(nombre, cedula, badgeNum, edad, equipoAsignado);
        this.NumAgentes = NumAgentes;
    }

    public int getNumAgentes() {
        return NumAgentes;
    }

    public void setNumAgentes(int NumAgentes) {
        this.NumAgentes = NumAgentes;
    }

    @Override
    public String Feedback() {
        System.out.println("El feedback brindado por los Team Lead debe ser administrativo");
        return "Feedback";
    }

}
