import java.util.logging.Logger;
import java.util.logging.LogRecord;
import static java.util.logging.Level.INFO;

public class Main {

    public static void main(String... args) {
        Logger logger = Logger.getGlobal();
        LogRecord message = new LogRecord(INFO, "Running non-modular code on Java 12");
        logger.log(message);
    }
}