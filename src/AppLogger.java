import java.util.logging.Logger;

public class AppLogger {
    private static Logger logger = Logger.getLogger(AppLogger.class.getName());

    public static void logInfo(String message) {
        logger.info(message);
    }
}
