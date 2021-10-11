
/*
 *  UCF COP3330 Fall 2021 Exercise 41 Solution
 *  Copyright 2021 Timothy Azinord
 */

package com.company;
import java.io.*;
import java.util.*;


public class Main {

    // defining the readNames function to take in data

    public static void readNames(Scanner input, ArrayList<String> names) {

        // reading the data till the file has nextLine

        while (input.hasNextLine()) {

            // adding the read line to the list of names

            names.add(input.nextLine());
        }
    }

    // function is used to display name in file

    public static void outputNames(ArrayList<String> names) throws IOException {

        // creating a FileWriter for the output file

        FileWriter output = new FileWriter("exercise41_output.txt");

        output.write("Total of " + names.size() + " names\n");

        output.write("--------------------\n");



        for (String i : names)
        {

            output.write(i + "\n");
        }


        output.close();

    }

    public static void main(String[] args) throws FileNotFoundException
    {

        // creating a scanner object to read from input file and array to hold names
        Scanner inputFile = new Scanner(new File("exercise41_input.txt"));
        ArrayList<String> names = new ArrayList<String>();

        // reading the names from the input file by calling the readNames() function

        readNames(inputFile, names);

        // sorting names using sort function

        Collections.sort(names, String.CASE_INSENSITIVE_ORDER);


        inputFile.close();

        // writing sorted names to the output file

        try {
            outputNames(names);
        }

        // used to write exception to console if one is raised

        catch (Exception e) {
            System.out.println(e);
        }
    }
}
