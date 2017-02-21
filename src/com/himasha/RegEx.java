package com.himasha;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

public class RegEx {

    public static void main(String[] args) {

        try {
            BufferedReader br = new BufferedReader(new FileReader(args[0])); //take the file to buffered reader

            char[] letters = args[1].toCharArray();  //put the 2nd argument to char array
            search(letters,br);   //call search method passing buffered reader and char array

        } catch (java.io.FileNotFoundException e) {  //handle exception if there is not file exist in file reader
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
        while ((line = br.readLine()) != null) {  //read line by line
            array = line.toCharArray();  //put line to char array

            print = true;
            for (char x : array) {
                valid = false;
                for (char y : letters) {
                    if (x == y) { //if the char in line is available given char array , it is valid

                        valid = true;
                        break;
                    }
                }
                if(!valid){   //if there any not valid char , it cannot be printed
                    print = false;
                    break;
                }
            }
            if(print) //if it is good to print, (all chars are valid) prrint the line.
                System.out.println(line);

        }

    }
}