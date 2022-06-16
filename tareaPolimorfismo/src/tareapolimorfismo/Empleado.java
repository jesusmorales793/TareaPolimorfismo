/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareapolimorfismo;

/**
 *
 * @author admin
 */
public abstract class Empleado {

    private String nombre;
    private String cedula;
    private int badgeNum;
    private int edad;

    public Empleado(String nombre, String cedula, int badgeNum, int edad) {

        this.nombre = nombre;
        this.cedula = cedula;
        this.badgeNum = badgeNum;
        this.edad = edad;

    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public int getBadgeNum() {
        return badgeNum;
    }

    public int getEdad() {
        return edad;
    }

    public abstract void TareaAsignada();
    
    public abstract void Horario();
    
    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", cedula=" + cedula + ", badgeNum=" + badgeNum + ", edad=" + edad + '}';
    }
    
   
}
