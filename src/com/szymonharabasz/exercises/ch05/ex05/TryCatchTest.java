package com.szymonharabasz.exercises.ch05.ex05;

import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * Created by harabasz on 08.05.16.
 */
public class TryCatchTest {
    public static void main(String[] args) {
        Scanner in = null;
        PrintWriter out = null;
        try {
            try {
                try {
                    in = new Scanner(Paths.get("/home/harabasz/loremipsum.txt"));
                    out = new PrintWriter("/home/harabasz/output.txt");
                    while (in.hasNext()) {
                        out.println(in.next().toLowerCase());
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    if (out != null) {
                        out.close();
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                if (in != null) {
                    in.close();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
