/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library;

import javax.swing.JFrame;

/**
 *
 * @author Akhtar
 */
public class LMS {

    public LMS() {
    }

    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException {
        // TODO code application logic here
        ManageBooks v = new ManageBooks();
       // v.setExtendedState(JFrame.MAXIMIZED_BOTH);
        v.setVisible(true);
    }
    
}
