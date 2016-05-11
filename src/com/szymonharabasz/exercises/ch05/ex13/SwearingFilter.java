package com.szymonharabasz.exercises.ch05.ex13;

import java.util.ArrayList;
import java.util.logging.Filter;
import java.util.logging.LogRecord;
import java.util.regex.Pattern;

/**
 * Created by harabasz on 10.05.16.
 */
public class SwearingFilter implements Filter {
    private ArrayList<String> swearings = new ArrayList<>();
    public SwearingFilter() {
        swearings.add("sex");
        swearings.add("drugs");
        swearings.add("c++");
    }
    @Override
    public boolean isLoggable(LogRecord record) {
        String message = record.getMessage().toLowerCase();
        for (String word : swearings) {
            String regex = ".*\\b"+word+"\\b.*";
            if (Pattern.matches(regex, message)) {
                return false;
            }
        }
        return true;
    }
}
