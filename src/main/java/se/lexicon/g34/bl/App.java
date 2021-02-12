package se.lexicon.g34.bl;

import se.lexicon.g34.bl.util.TextReadWrite;

/**
 * Java I/O and Serialization practices
 * 1. Create a textfile (.txt) and fill it with some text content. Tip: you can find random text here.
 * a. In Java create a method that read in a String from file and return the String using FileReader.
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        String textToWrite="Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.";
        if(!TextReadWrite.writeStringToFile(textToWrite,"myfile.txt"))
            System.out.println("Something went wrong while Writing. Back to the drawingboard.....");

        String textToRead=TextReadWrite.readFileToString("myfile.txt");
        System.out.println(textToRead!=null?textToRead:"Something went wrong while reading. Back to drawingboard");
    }
}
