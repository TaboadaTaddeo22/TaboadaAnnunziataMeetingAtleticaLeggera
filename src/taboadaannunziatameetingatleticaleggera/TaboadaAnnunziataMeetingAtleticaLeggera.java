/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taboadaannunziatameetingatleticaleggera;

import javax.swing.JFrame;

/**
 *
 * @author taboada.taddeo
 */
public class TaboadaAnnunziataMeetingAtleticaLeggera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Meeting m = new Meeting();
        FrameMeeting fM = new FrameMeeting(m);
        fM.setVisible(true);
        fM.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }
    
}