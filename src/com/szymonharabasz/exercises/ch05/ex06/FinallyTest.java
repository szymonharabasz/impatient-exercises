package com.szymonharabasz.exercises.ch05.ex06;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by harabasz on 08.05.16.
 */
public class FinallyTest {
    public static void solutionA() {
        BufferedReader in = null;
        try {
            in = Files.newBufferedReader(Paths.get("/home/harabasz/loremipsum.txt"), StandardCharsets.UTF_8);
        } catch (IOException e) {
            System.err.println("Caught exception " + e.getMessage());
        } finally {
            if (in != null) {
                try {
                    in.close();
                    throw new IOException("thrown manually");
                } catch (IOException e) {
                    System.err.println("Caught exception " + e.getMessage() + " inside finally");
                }
            }
        }
    }

    public static void solutionB() {
        BufferedReader in = null;
        try {
            try {
                in = Files.newBufferedReader(Paths.get("/home/harabasz/loremipsum.txt"), StandardCharsets.UTF_8);
            } catch (IOException e) {
                System.err.println("Caught exception " + e.getMessage());
            } finally {
                if (in != null) {
                    in.close();
                    throw new IOException("thrown manually");
                }
            }
        } catch (IOException e) {
            System.err.println("Caught exception " + e.getMessage() + " in external catch");
        }
    }

    public static void solutionC() {
        try (BufferedReader in = Files.newBufferedReader(Paths.get("/home/harabasz/loremipsum.txt"), StandardCharsets.UTF_8)){
        } catch (IOException e) {
            System.err.println("Caught exception " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        solutionA();
        solutionB();
        solutionC();
    }
}
