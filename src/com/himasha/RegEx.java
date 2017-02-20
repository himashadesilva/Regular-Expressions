package com.himasha;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class RegEx {

    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new FileReader(args[0]));

            char[] letters = args[1].toCharArray();
            search(letters,br);

        } catch (java.io.FileNotFoundException e) {
            System.out.println("The file not found");

        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void search(char[] letters, BufferedReader br) throws IOException {
        String line;
        char[] array;
        boolean printed=false;
        while ((line = br.readLine()) != null) {
            array = line.toCharArray();
            printed = false;
            for (char x : array) {
                for (char y : letters) {
                    if (x == y) {
                        System.out.println(line);
                        printed = true;
                        break;
                    }
                }
                if(printed)
                    break;
            }
        }

    }
}