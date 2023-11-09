package com.logtest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class GoTheHell {
    private static final Logger logger = LogManager.getLogger(GoTheHell.class);

    public void runMessage(){
        logger.info("GoTheHell GoTheHell  V001");
        logger.fatal("GoTheHell: FATAL"); // 印出
        logger.error("GoTheHell: ERROR"); // 印出
        logger.warn("GoTheHell: WARN");
        logger.info("GoTheHell: INFO");
        logger.debug("GoTheHell: DEBUG");
        logger.trace("GoTheHell: TRACE");
    }
}
