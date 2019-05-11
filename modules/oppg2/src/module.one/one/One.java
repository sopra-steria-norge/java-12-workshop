package one;

import java.util.logging.Logger;
import java.util.logging.LogRecord;
import java.time.LocalDateTime;
import static java.util.logging.Level.INFO;

public class One {
    public static void main(String... args) {
        Logger logger = Logger.getGlobal();
        LogRecord message = new LogRecord(INFO, "Today -> " + LocalDateTime.now().toString());
        logger.log(message);

        Module module = new One().getModule();
        System.out.println("Module: "+module);
        System.out.println("Name: " + module.getName());
        System.out.println("isNamed: " + module.isNamed());
        System.out.println("Descriptor: " + module.getDescriptor());
    }
}