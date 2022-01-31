package com.Demo;
// import utility classes for the program
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.io.*;

/**
 * Author Name: Ernst Juste Aine
 * Date: 1/30/2022
 * Program JusteAine_SpellChecking
 * Purpose: Spell check
 */
public class JusteAine_Spellchecking {
    public static void main(String[] args) throws FileNotFoundException {
        // the next 6 lines ask the user to enter a file to test against
        Scanner input = new Scanner(System.in);
        String fileName1, fileName2;
        System.out.println("Enter a test file with absolute path");
        fileName1 = input.nextLine().trim();
        File  testFile = new File(fileName1);
        Scanner scan = new Scanner(testFile);

//the next 4 lines ask the user to enter a dictionary file to test against the test file
        System.out.println("Enter a dictionary File with absolute path");
        fileName2 = input.nextLine().trim();
        File dictionaryFile = new File(fileName2);
        Scanner scan2 = new Scanner(dictionaryFile);
/**
 *  read the files line by line
 *  store the file contents in a string, then convert the stringto an arraylist
 *  compare them then return the unknown words
 */
        while(scan.hasNext() && scan2.hasNext()){
            String line = scan.nextLine();
            String line2 = scan2.nextLine();

            List<String> list1 = new ArrayList<>();
            List<String> list2 = new ArrayList<>();

            String test[] = line.split("     ");
            list1  = Arrays.asList(test);
            String dict[] = line2.split("     ");
            list2 = Arrays.asList(dict);

            for(String s1 : list1){
                for(String s2 : list2){
                    if(!s1.equals(s2)){
                        System.out.println(s1.toString() +":  unknown");
                }
            }



            }
        }
    }

}

























