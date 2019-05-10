package no.soprasteria;

import java.util.logging.Logger;
import java.util.logging.LogRecord;
import java.time.LocalDateTime;
import static java.util.logging.Level.INFO;

public class One {
    public static void main(String... args) {
        Logger logger = Logger.getGlobal();
        LogRecord message = new LogRecord(INFO, "Today -> " + LocalDateTime.now().toString());
        logger.log(message);
    }
}