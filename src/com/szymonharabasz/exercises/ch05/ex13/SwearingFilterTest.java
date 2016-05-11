package com.szymonharabasz.exercises.ch05.ex13;

import java.util.logging.ConsoleHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by harabasz on 10.05.16.
 */
public class SwearingFilterTest {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(SwearingFilterTest.class.getName());
        logger.setLevel(Level.FINE);
        logger.setFilter(new SwearingFilter());
        logger.setUseParentHandlers(false);
        Handler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.ALL);
        logger.addHandler(consoleHandler);
        logger.log(Level.FINER,"First mesage.");
        logger.log(Level.CONFIG,"Other message");
        logger.log(Level.CONFIG,"She went to drugstore.");
        logger.log(Level.CONFIG,"I like programming C++, but I don't like Java.");
        logger.config("sex");
    }
}
