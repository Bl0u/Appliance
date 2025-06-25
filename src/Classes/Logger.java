package Classes ;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Logger {

    private static final DateTimeFormatter FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public static void logOperation(String logs) {
        String timestamp = LocalDateTime.now().format(FORMATTER);
        System.out.println("[" + timestamp + "] " + logs);
    }
}
