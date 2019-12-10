package edu.cscc;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Scanner;

//
public class Census {



        public static HashMap<String, Surname>  loadCensusData(String fname) {
       // int line = 0; // Keep track of lines of file we've read
       // Surname[] namelist = new Surname;
         HashMap<String, Surname> namelist = new HashMap<String, Surname>();
         String name;
         int rank;
         int count;
         double proportion;

        // Add code to read file and populate array of Surname objects


        File file = new File(fname);

        try {
            Scanner input = new Scanner(file);
            input.nextLine();
            while (input.hasNext()) {
                String s = input.nextLine();
                String[] one = s.split(",");
                       //System.out.println(s);
                name = one [0];
                rank = Integer.parseInt(one [1]);
                count = Integer.parseInt(one[2]);
                proportion = Double.parseDouble(one[3]);
                namelist.put(name, new Surname(name, rank, count, proportion));

            }
        } catch (FileNotFoundException ex) {
            System.out.println("Cannot access file " + fname);
        }


        return namelist;
    }
    }


