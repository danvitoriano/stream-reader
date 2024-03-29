package br.com.fiap;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class TestReadFile {

    public static void main(String[] args) {
        String filename = "/home/dvitoriano/workspace/fiap/stream-reader/lines.txt";


        //read file into stream, try-with resources
        try(Stream<String> stream = Files.lines(Paths.get(filename))){

            stream.forEach(System.out::println);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

