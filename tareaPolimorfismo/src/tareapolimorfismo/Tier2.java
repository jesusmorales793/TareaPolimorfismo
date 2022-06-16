 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareapolimorfismo;

/**
 *
 * @author admin
 */
public class Tier2 extends Soporte {

    private String idEscalacion;

    public Tier2(String nombre, String cedula, int badgeNum, int edad, String agenteAsignado, String idEscalacion) {
        super(nombre, cedula, badgeNum, edad, agenteAsignado);
        this.idEscalacion = idEscalacion;

    }

    public String getIdEscalacion() {
        return idEscalacion;
    }

    public void setIdEscalacion(String idEscalacion) {
        this.idEscalacion = idEscalacion;
    }
}
