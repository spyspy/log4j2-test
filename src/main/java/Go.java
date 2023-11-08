import com.GoTheHell;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Go {
    private static final Logger logger = LogManager.getLogger(Go.class);

    public static void main(String[] args) {

        logger.debug("Hello from Log4j 2 - V111 ============================(Start)");

        // in old days, we need to check the log level to increase performance
        /*if (logger.isDebugEnabled()) {
            logger.debug("{}", getNumber());
        }*/

        // with Java 8, we can do this, no need to check the log level
        logger.debug("{}", () -> getNumber());
        logger.fatal("GO: FATAL"); // 印出
        logger.error("GO: ERROR"); // 印出
        logger.warn("GO: WARN");
        logger.info("GO: INFO");
        logger.debug("GO: DEBUG");
        logger.trace("GO: TRACE");
        logger.debug("Hello from Log4j 2 - V111 ============================(MIDDLE)");
        GoTheHell goTheHell = new GoTheHell();
        goTheHell.runMessage();
        logger.debug("Hello from Log4j 2 - V111 ============================(END)");

    }

    static int getNumber() {
        return 5;
    }
}