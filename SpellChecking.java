package com.SpellChecking;
import java.io.*;
import java.util.Scanner;
/**
 * Author Name: Ernst Juste Aine
 * Date: 1/30/2022
 * Program JusteAine_SpellChecking
 * Purpose: Spell check
 */
public class SpellChecking {

    public static void main(String[] args) throws FileNotFoundException {
        // the next 6 lines ask the user to enter a file to test against
        Scanner input = new Scanner(System.in);
        String fileName1, fileName2;
        System.out.println("Enter a test file with absolute path ");
        fileName1 = input.nextLine().trim();
        File testFile = new File(fileName1);
        Scanner scan1 = new Scanner(testFile);

        //the next 4 lines ask the user to enter a dictionary file to test against the test file
        System.out.println("Enter a dictionary file with absolute path ");
        fileName2 = input.nextLine().trim();
        File dictionaryFile = new File(fileName2);
        Scanner scan2 = new Scanner(dictionaryFile);

        // read the files line by line and compare them, then return the missing word
        while(scan1.hasNext() && scan2.hasNext()){
            String line1 = scan1.nextLine();
            String line2 = scan2.nextLine();
            if(!line1.equals(line2)){
                System.out.println(line1 +" is unknown");
            }
        }
    }

}
