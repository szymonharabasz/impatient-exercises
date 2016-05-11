package com.szymonharabasz.exercises.ch05.ex14;

import com.szymonharabasz.exercises.ch05.ex13.SwearingFilter;

import java.io.IOException;
import java.util.logging.*;

/**
 * Created by harabasz on 10.05.16.
 */
public class HtmlFormatterTest {
    public static void main(String[] args) throws IOException {
        Logger logger = Logger.getLogger(HtmlFormatterTest.class.getName());
        logger.setLevel(Level.FINE);
        logger.setUseParentHandlers(false);
        Handler handler = new FileHandler("/home/harabasz/test.html");
        handler.setLevel(Level.ALL);
        handler.setFormatter(new HtmlFormatter());
        logger.addHandler(handler);
        logger.log(Level.FINER,"First mesage.");
        logger.log(Level.CONFIG,"Other message");
        logger.log(Level.SEVERE,"She went to drugstore.");
        logger.log(Level.FINE,"I like programming C++, but I don't like Java.");
        logger.config("sex");
    }
}
