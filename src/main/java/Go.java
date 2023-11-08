import com.GoTheHell;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Go {
    private static final Logger logger = LogManager.getLogger(Go.class);

    public static void main(String[] args) {

        logger.debug("Hello from Log4j 2 - V111");

        // in old days, we need to check the log level to increase performance
        /*if (logger.isDebugEnabled()) {
            logger.debug("{}", getNumber());
        }*/

        // with Java 8, we can do this, no need to check the log level
        logger.debug("{}", () -> getNumber());

        GoTheHell goTheHell = new GoTheHell();
        goTheHell.runMessage();

    }

    static int getNumber() {
        return 5;
    }
}