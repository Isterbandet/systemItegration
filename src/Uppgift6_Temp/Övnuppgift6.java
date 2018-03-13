
package Uppgift6_Temp;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;

public class Övnuppgift6 {
    public Övnuppgift6 () {
        File file = new File("src\\Uppgift6_Temp\\temp.txt");
        double temp;
        double tempSum = 0;
        int antalDagar = 0;
        double minTemp = Double.MAX_VALUE ;
        double maxTemp = -Double.MAX_VALUE;
        String tempLine;
        
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            
            while((tempLine = reader.readLine()) != null){
                
                //Tar bort end of line tecken och blanktecken 
                //Gör om strign till double.
                temp = Double.parseDouble(tempLine.trim());
                
                if (temp > maxTemp) {
                    maxTemp = temp;
                }
                if (temp < minTemp) {
                    minTemp = temp;
                }
                antalDagar++;
                tempSum += temp;
            }
                
        }
        
        catch (Exception e){
            System.out.println("Något gick fel");
            e.printStackTrace();
            System.out.flush();
            System.exit(0);
        }
        System.out.println("Maxtemp är "+maxTemp+"\nMintemp är "+minTemp+"\nMedelvärdet är "+tempSum/antalDagar+" (beräknat över "+antalDagar+" dagar)");
        
        
    }
    public static void main(String[] args){
        Övnuppgift6 ö = new Övnuppgift6();
    


    }
}
