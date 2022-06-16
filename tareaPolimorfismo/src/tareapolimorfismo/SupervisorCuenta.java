/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareapolimorfismo;

/**
 *
 * @author admin
 */
public class SupervisorCuenta extends Management {

    private String regionAsignada;

    public SupervisorCuenta(String nombre, String cedula, int badgeNum, int edad, String equipoAsignado, String regionAsignada) {
        super(nombre, cedula, badgeNum, edad, equipoAsignado);
        this.regionAsignada = regionAsignada;
    }

    public String getRegionAsignada() {
        return regionAsignada;
    }

    public void setRegionAsignada(String regionAsignada) {
        this.regionAsignada = regionAsignada;
    }
}
