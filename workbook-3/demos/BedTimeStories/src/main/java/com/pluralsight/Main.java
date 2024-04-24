package com.pluralsight;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String filePath = promptUserForStory();
        String story = readStory(filePath);
        // goal is to display story from one of these files. prob should do this in its own method
       // readStory("files/goldilocks.txt");
    }

    public static String promptUserForStory (){
        Scanner userInput = new Scanner(System.in);
        System.out.println();
        System.out.println("Available Stories: ");
        System.out.println("1) Goldilocks");
        System.out.println("2) Hansel and Gretel");
        System.out.println("3) Mary had a Little Lamb ");
        System.out.println("4) Exit");

        switch{

        }



    }



    public static void readStory (String fileName){
        File file = new File(fileName);
        //checked to see if we have the file.
        //System.out.println(file.getAbsolutePath());
        //System.out.println(file.exists());

        //Use stringbuilder here
        StringBuilder builder = new StringBuilder();
        try
        {
            Scanner fileScanner = new Scanner (file);
            FileInputStream fileStream = new FileInputStream(file);
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
    }

}