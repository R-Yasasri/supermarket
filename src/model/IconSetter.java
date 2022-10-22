/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author User
 */
public class IconSetter {

    private static final IconSetter is = new IconSetter();

    public static synchronized void setFrameIcon(JFrame frame) {
        is.setIcon(frame);
    }

    private void setIcon(JFrame frame) {

        frame.setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("logo.png")));
    }
}
