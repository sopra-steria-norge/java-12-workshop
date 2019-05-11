import java.util.logging.Logger;
import java.util.logging.LogRecord;
import static java.util.logging.Level.INFO;

public class Main {

    public static void main(String... args) {
        Logger logger = Logger.getGlobal();
        LogRecord message = new LogRecord(INFO, "Running non-modular code on Java 12");
        logger.log(message);

        Module module = Main.class.getModule();
        System.out.println("Module: "+module);
        System.out.println("Name: " + module.getName());
        System.out.println("isNamed: " + module.isNamed());
        System.out.println("Descriptor: " + module.getDescriptor());
    }
}