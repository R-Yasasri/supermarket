/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.awt.Component;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class ErrorReporter {

    private static String ERROR_TITLE = "ERROR";
    public static String GENERIC_ERROR_MESSAGE = "ERROR";

    public static void reportError(Exception e) {
        e.printStackTrace();
        CustomLogging.loggingMethod(e.getMessage(), CustomLogging.ERROR);
    }

    public static void reportError(Exception e, Component parent) {
        e.printStackTrace();
        CustomLogging.loggingMethod(e.getMessage(), CustomLogging.ERROR);

        JOptionPane.showMessageDialog(parent, e, ERROR_TITLE, JOptionPane.ERROR_MESSAGE);

    }

    public static void reportError(Exception e, Component parent, String messageToDisplayToUserOnly) {
        e.printStackTrace();
        CustomLogging.loggingMethod(e.getMessage(), CustomLogging.ERROR);

        JOptionPane.showMessageDialog(parent, messageToDisplayToUserOnly, ERROR_TITLE, JOptionPane.ERROR_MESSAGE);

    }
}
