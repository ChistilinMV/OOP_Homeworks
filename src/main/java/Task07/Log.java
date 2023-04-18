package Task07;

import java.io.FileInputStream;
import java.util.logging.LogManager;
import java.util.logging.Logger;
import java.util.logging.Level;

public class Log {
    static Logger LOGGER;

    static {
        try (FileInputStream ins = new FileInputStream("log.config")) {
            LogManager.getLogManager().readConfiguration(ins);
            LOGGER = Logger.getLogger(Main.class.getName());
        } catch (Exception ignore) {
            ignore.printStackTrace();
        }
    }

    public static void logWrite(String message) {
        try {
            LOGGER.log(Level.INFO, message);
        } catch (Exception e) {
            LOGGER.log(Level.WARNING, "Something went wrong", e);
        }
    }
}
