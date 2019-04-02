package psychotest;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class WriteFile {

    public static String str = "";
    
    public static void write(ArrayList<Integer> x, ArrayList<Integer> y) {
        try {
            str = "";
            System.out.println("deneme");
            for(int i=0;i<x.size();i++){
                str += x.get(i) + "," + y.get(i) + "\r\n";
            }
            
            str += "\r\n";
            
            File mousePos = new File("deneme.txt");

            if (!mousePos.exists()) {
                mousePos.createNewFile();
            }
            
            FileWriter fileWriter = new FileWriter(mousePos, true);
            BufferedWriter bWriter = new BufferedWriter(fileWriter);
            bWriter.write(str);
            bWriter.close();

        } catch (IOException ex) {
            Logger.getLogger(WriteFile.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
