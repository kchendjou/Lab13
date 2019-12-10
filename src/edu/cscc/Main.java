package edu.cscc;
//kyria mba chendjou 12/3/2019
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    private final static String CENSUSDATAFNAME = "Surnames_2010Census.csv";
    private final static Scanner Input = new Scanner (System.in);
//
    public static void main(String[] args) {

        HashMap<String, Surname> nameList = Census.loadCensusData(CENSUSDATAFNAME);
       // Surname[] namelist = Census.loadCensusData(CENSUSDATAFNAME);
        String name;
        System.out.println(("Surname"));

        while (true) {
            System.out.print("Enter a surname (or 'Quit' to end):  ");
            name = Input.nextLine().trim();
            if ("quit".equalsIgnoreCase(name)) break;

            Surname s = nameList.get(name.toUpperCase());
            if (s !=null) {
                System.out.println(" SurName:  " + s.getName() + "Rank:  " + s.getRank() + "Count:  " + s.getCount() + "Proportion:  " + s.getProportion());

            } else {
                System.out.println(" Name:  "+ name + "NOT FOUND");
            }
        }
    }
}