import java.util.logging.Level;
import java.util.logging.Logger;

public class JavaProvideLog {

    public static void main(String[] args) {
        //useGlobalLogger();
        useLoggerWithProperties();
    }

    private static void useLoggerWithProperties() {
        System.setProperty("java.util.logging.config.file","/rex/java-priactice/java-base-log/src/main/resources/logging.properties");
        //
        Logger myLogger = Logger.getLogger("myLogger");
        myLogger.setLevel(Level.FINE);

        myLogger.severe("myLogger.severe……");
        myLogger.warning("myLogger.warning……");
        myLogger.info("myLogger.info……");
        myLogger.config("myLogger.config……");
        myLogger.fine("myLogger.fine……");
        myLogger.finer("myLogger.finer……");
        myLogger.finest("myLogger.finest……");
    }

    private static void useGlobalLogger() {
        Logger logger = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
        logger.info("logger.info...");
        logger.warning("logger.warning...");
        logger.fine("logger.fine...");
        logger.severe("logger.severe...");
    }
}
