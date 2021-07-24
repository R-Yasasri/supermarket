/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import org.apache.log4j.PatternLayout;
import org.apache.log4j.RollingFileAppender;

/**
 *
 * @author Rajitha Yasasri
 */
public class CustomLogging {

    public static final String ERROR = "ERROR";
    public static final String INFO = "INFO";
    public static final String WARNING = "WARNING";

    private static final String LOG_PATH = "log.txt";

    public static String getLogPath() {
        return LOG_PATH;
    }

    private static void initLogger() {  // intialize the logger

        try {

            PatternLayout p = new PatternLayout("%p %d %m %l %n");

            // priority, date, message, line number, next line
            RollingFileAppender rfa = new RollingFileAppender(p, LOG_PATH);
            rfa.setName("ProjectLogger");
            rfa.setMaxFileSize("10MB");
            rfa.activateOptions();
            org.apache.log4j.Logger.getRootLogger().addAppender(rfa);

        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    public static void loggingMethod(String text, String type) {

        initLogger();
        org.apache.log4j.Logger log = org.apache.log4j.Logger.getLogger("ProjectLogger");

        if (type.equals(ERROR)) {
            log.error(text);

        }
        if (type.equals(INFO)) {
            log.info(text);
        }
        if (type.equals(WARNING)) {
            log.warn(text);
        }
    }

}
