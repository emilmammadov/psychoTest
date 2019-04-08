package psychotest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ReadWriteFile {
    
    static String path = "deneme.txt";
    static ArrayList<String> txtArray = new ArrayList<>();
    static String arr[][] = new String[20][200];

    public static String str = "";
    static int countPage = 0;
    
    public static void write(ArrayList<Integer> x, ArrayList<Integer> y) {
        try {
            str = countPage + ".000\r\n";
            
            for(int i=0;i<x.size();i++){
                str += x.get(i) + "," + y.get(i) + "\r\n";
            }
            
            str += "\r\n";
            
            File mousePos = new File(path);

            if (!mousePos.exists()) {
                mousePos.createNewFile();
            }
            
            FileWriter fileWriter = new FileWriter(mousePos, true);
            BufferedWriter bWriter = new BufferedWriter(fileWriter);
            bWriter.write(str);
            bWriter.close();

        } catch (IOException ex) {
            Logger.getLogger(ReadWriteFile.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        countPage++;

    }
    
    public static void read(int page) throws FileNotFoundException, IOException{
        
        String line = "";
        int indexStart;
        File file = new File(path);
        FileReader fileReader = new FileReader(file);
        BufferedReader br = new BufferedReader(fileReader);
        while((line = br.readLine()) != null){
            txtArray.add(line);
        }
            
        while(txtArray != null){
            
            for(int i=0;;i++){
                indexStart = txtArray.indexOf(page + ".000");
                for(int j=0;;j++){
                    arr[i][j] = 
                }
                
            }
        }
        
    }
    
    public static void find(int page){
        
        return 
    }

}
