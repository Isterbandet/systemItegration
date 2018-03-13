package Uppgift7;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class uppgift7 {
    
    public uppgift7 () {
    
  String firstLine;
        String secondLine;
        Path inFilePath= Paths.get("src\\Uppgift7\\Personuppgifter.txt");
        Path outFilePath = Paths.get("src\\Uppgift7\\TallPeopleInformation.txt");
        
        String[] personDataParts;
        
               
        //Try with resources, nya sättet med Paths och Files
        try(PrintWriter w = new PrintWriter(Files.newBufferedWriter(outFilePath)))
            {

            Scanner fileScanner = new Scanner(inFilePath);
            
            while(fileScanner.hasNext()){
                firstLine = fileScanner.nextLine();
                if (fileScanner.hasNext()){
                    secondLine = fileScanner.nextLine();
                    personDataParts = secondLine.split(",");

                    if (Integer.parseInt(personDataParts[2].trim()) > 199){
                        w.print(firstLine + "\n" + secondLine+ "\n");
                    }
                }
            }
        }
        catch (FileNotFoundException e){
            System.out.println("Filen kunde inte hittas");
            e.printStackTrace();
            System.exit(0);
       }
        catch (IOException e){
            System.out.println("Det gick inte att skriva till fil");
            e.printStackTrace();
            System.exit(0);
        }
        catch (Exception e){
            System.out.println("Något gick fel");
            e.printStackTrace();
            System.exit(0);
        }
    }
    
    public static void main(String[] args){
        uppgift7 ö = new uppgift7();
    }

}
