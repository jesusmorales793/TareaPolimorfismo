/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareapolimorfismo;

/**
 *
 * @author admin
 */
public class AgenteChat extends Agente {

    int NumChats;

    public AgenteChat(String nombre, String cedula, int badgeNum, int edad, String casoAsignado, int NumChats) {
        super(nombre, cedula, badgeNum, edad, casoAsignado);

        this.NumChats = NumChats;

    }

    public int getNumChats() {
        return NumChats;
    }

    public void setNumChats(int NumChats) {
        this.NumChats = NumChats;
    }

}
