/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view.factory;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author student1
 */
public abstract class PersonViewFactory {

    protected JFrame main;

    public abstract JPanel getPersonView();

    public void kreiraj() {
        main = new JFrame();
        main.add(getPersonView());
        main.pack();
        main.setVisible(true);
    }
}
