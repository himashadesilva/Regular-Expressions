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
        boolean valid,print;
        int count =0;
        while ((line = br.readLine()) != null) {
            array = line.toCharArray();

            print = true;
            for (char x : array) {
                valid = false;
                for (char y : letters) {
                    if (x == y) {
                        //System.out.println(line);
                        valid = true;
                        break;
                    }
                }
                if(!valid){
                    print = false;
                    break;
                }
            }
            if(print)
                System.out.println(line);

        }

    }
}