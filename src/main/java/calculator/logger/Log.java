package calculator.logger;

import java.io.FileInputStream;
import java.time.LocalDateTime;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class Log {
    private static String message;

    static {
        try(FileInputStream in = new FileInputStream("log.config")){
            LogManager.getLogManager().readConfiguration(in);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    public static Logger log(String className) {
        return Logger.getLogger(className);
    }

//    public static void logInfo(String message) {
//        Log.message = message;
//        System.err.printf("%s : %s%n", LocalDateTime.now(), message);
//    }
}
