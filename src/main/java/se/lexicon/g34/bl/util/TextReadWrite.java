package se.lexicon.g34.bl.util;

import java.io.FileReader;
import java.io.FileWriter;

public class TextReadWrite {

    public static String readFileToString(String file) {
        try {
            String result="";
            FileReader in = new FileReader(file);
            while (in.ready()) {
                result=result+(char) in.read();
            }
            return result;
        } catch (Exception e) {
            e.getStackTrace();
        }
   return null;
    }

    public static boolean writeStringToFile(String toWrite, String file) {
        try {
            FileWriter out = new FileWriter(file);
            out.write(toWrite);
            out.close();
            return true;
        } catch (Exception e) {
            e.getStackTrace();
            return false;
        }
    }
}
