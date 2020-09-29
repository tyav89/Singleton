import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    protected int num = 1;
    private static Logger logger;

    private Logger() {
    }

    Date date = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("d.MM.yy hh:mm:ss");

    public void log(String message) {
        System.out.println("[" + sdf.format(date) + " " + num++ + "] " + message);
    }

    public static Logger getInstance() {
        if (logger == null) logger = new Logger();
        return logger;
    }
}
