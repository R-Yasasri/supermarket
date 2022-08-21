/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import database.db;

/**
 *
 * @author User
 */
public class StockChecker {

    public static void stockCorrector() {
        try {

            String expirequery = "UPDATE stock SET status = 0 WHERE expiredate < curdate() AND status > 0";
            db.iud(expirequery);

            String qtyquery = "UPDATE stock SET status = 0 WHERE qty = 0 AND status > 0";
            db.iud(qtyquery);

        } catch (Exception e) {
            ErrorReporter.reportError(e);
        }
    }
}
