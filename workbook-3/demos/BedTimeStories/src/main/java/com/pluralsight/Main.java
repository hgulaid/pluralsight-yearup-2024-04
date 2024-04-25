package com.pluralsight;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Main {

    public static void main(String[] args)
    {
        while(true){
        String filePath = promptUserForStory();
        //String promptUserForStory = readStory(filePath);
        // goal is to display story from one of these files. prob should do this in its own method
       // readStory("files/goldilocks.txt");
        if (filePath.equalsIgnoreCase("exit"))
        {
            return;
        }
        String story = readStory(filePath);
        System.out.println(story);
        }
    }

    public static String promptUserForStory ()
    {
        Scanner userInput = new Scanner(System.in);
        System.out.println();
        System.out.println("Available Stories: ");
        System.out.println("1) Goldilocks");
        System.out.println("2) Hansel and Gretel");
        System.out.println("3) Mary had a Little Lamb ");
        System.out.println("4) Exit");
        int choice = userInput.nextInt();

        switch (choice) {

            case 1:
                return "files/goldilocks.txt";

            case 2:
                return "files/hansel_and_gretel.txt";
            case 3:
                return "files/mary_had_a_little_lamb.txt";
            default:
                return "Exit";
        }

    }



    public static String readStory (String fileName){
        File file = new File(fileName);
        //checked to see if we have the file.
        //System.out.println(file.getAbsolutePath());
        //System.out.println(file.exists());

        //Use stringbuilder here
        StringBuilder builder = new StringBuilder();
        try
        {

            FileInputStream fileStream = new FileInputStream(file);
            Scanner fileScanner = new Scanner (file);
            while(fileScanner.hasNext()){
                String line = fileScanner.nextLine();
                // we can print each line below but we won't have it saved after the loop
                //System.out.println(line);


                //we can use this builder.append(line) to save each line
                builder.append(line + "\n");
            }
        }
        catch(FileNotFoundException ex){

        }
        System.out.println(builder.toString());
        return fileName;
    }

}