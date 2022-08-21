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
public class LoggingAndFeedbackHelper {

    public static void successfulInsert(String message, Component parent) {
        CustomLogging.loggingMethod(message, CustomLogging.INFO);
        JOptionPane.showMessageDialog(parent, "Data saved successfully", "INFO", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void successfulUpdate(String message, Component parent) {
        CustomLogging.loggingMethod(message, CustomLogging.INFO);
        JOptionPane.showMessageDialog(parent, "Data updated successfully", "INFO", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void successfulDelete(String message, Component parent) {
        CustomLogging.loggingMethod(message, CustomLogging.INFO);
        JOptionPane.showMessageDialog(parent, "Data deleted successfully", "INFO", JOptionPane.INFORMATION_MESSAGE);
    }

    public static void viewData(String message) {
        CustomLogging.loggingMethod(message, CustomLogging.INFO);
    }
}
