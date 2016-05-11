package com.szymonharabasz.exercises.ch05.ex14;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Date;
import java.util.logging.Formatter;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;

import static java.util.logging.Level.*;

/**
 * Created by harabasz on 10.05.16.
 */
public class HtmlFormatter extends Formatter {
    @Override
    public String format(LogRecord record) {
        StringBuilder styleBuilder = new StringBuilder();
        styleBuilder.append("padding-top: 10pt; ");
        if (record.getLevel() == FINE || record.getLevel() == FINER || record.getLevel() == FINEST) {
            styleBuilder.append("color: green;");
        } else if (record.getLevel() == SEVERE) {
            styleBuilder.append("color: red;");
        }

        StringBuilder builder = new StringBuilder();
        builder.append("<div style=\"");
        builder.append(styleBuilder);
        builder.append("\">\n");

        builder.append("\t<div>\n");

        builder.append("\t\t<span>");
        Date date = new Date(record.getMillis());
        DateFormat df = new SimpleDateFormat("dd MMMM yyyy, HH:mm:ss");
        builder.append(df.format(date));
        builder.append("</span>\n");

        builder.append("\t\t<span>");
        builder.append("Level: " + record.getLevel().toString());
        builder.append("</span>\n");

        builder.append("\t</div>\n");
        builder.append("\t<div>\n");
        builder.append("\t\t"+record.getMessage());
        builder.append("\n\t</div>\n");
        builder.append("\n</div>\n");

        return builder.toString();
    }

    @Override
    public String getHead(Handler h) {
        StringBuilder builder = new StringBuilder();
        builder.append("<!DOCTYPE html>\n");
        builder.append("<html>\n<head>\n");
        builder.append("<meta charset=\"UTF-8\">\n");
        builder.append("<title>");
        builder.append("Log of the Java application");
        builder.append("</title>\n</head>\n<body>");
        return builder.toString();
    }

    @Override
    public String getTail(Handler h) {
        return "</body>\n</html>\n";
    }
}
