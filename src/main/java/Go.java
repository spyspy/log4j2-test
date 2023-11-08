import com.GoTheHell;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Random;

public class Go {
    private static final Logger logger = LogManager.getLogger(Go.class);

    public static void main(String[] args) {

        logger.debug("Hello from Log4j 2 - V111 ============================(Start)");
        String newWord = getRandomWord(1000);
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

    static String getRandomWord(int limit){
        String alphabet = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        StringBuilder randomString = new StringBuilder();

        Random random = new Random();
        for (int i = 0; i < limit; i++) {
            int index = random.nextInt(alphabet.length());
            char randomCharacter = alphabet.charAt(index);
            randomString.append(randomCharacter);
        }

        String rtn = randomString.toString();

        System.out.println("Random::  "+rtn);
        logger.debug("Random::  {}", rtn);
        return rtn;
    }
}