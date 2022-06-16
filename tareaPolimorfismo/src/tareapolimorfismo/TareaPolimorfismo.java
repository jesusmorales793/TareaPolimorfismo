/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tareapolimorfismo;

/**
 *
 * @author admin
 */
public class TareaPolimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AgenteChat AC = new AgenteChat("Juan", "HYICS2", 55668, 22, "AC-558", 32);
        Soporte Soporte1 = new Soporte("Andrew", "1117", 48235, 26, "Adrian");
        TeamLead TL = new TeamLead("Adam", "Ac1558", 22680, 32, "Equipo AC1", 15);

        AC.Horario();
        Soporte1.Horario();
        Soporte1.Feedback();
        TL.Feedback();
    }

}
