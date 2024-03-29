package br.com.fiap;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestReadFile3 {

    public static void main(String[] args) {
        String filename = "/home/dvitoriano/workspace/fiap/stream-reader/lines.txt";

        List<String> list = new ArrayList<>();

        try(BufferedReader br = Files.newBufferedReader(Paths.get(filename))){

            list = br.lines().collect(Collectors.toList());

        } catch(IOException e){
            e.printStackTrace();
        }

        list.forEach(System.out::println);
    }



}
