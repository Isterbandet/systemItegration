
package Uppgift6;
import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;

public class Övnuppgift6 {

    public static void main(String[] args) {
       String tempLine;
       ArrayList<Double> perkeLe = new ArrayList<>(); 
       double temperature;
       double maxVal=0;
       double minVal=100;
       double totalVal=0;
       double medelVarde=0;
       try (BufferedReader bufin = new BufferedReader(new FileReader("C:\\Users\\Torsten\\Documents\\NetBeansProjects\\Övnuppgift6\\build\\classes\\övnuppgift6\\temp.txt"));){
           while((tempLine = bufin.readLine()) !=null){
               temperature = Double.parseDouble(tempLine);
               
               perkeLe.add(temperature);
              // System.out.println(tempLine);
               
           }
       }
            catch (Exception e){
                    System.out.println("Något gick fel");
            }
            
      System.out.println(perkeLe);
      int count=0;
          for (double temps:perkeLe) {
              if(temps<minVal){
                  minVal=temps;
              }
              if(temps>maxVal){
                  maxVal=temps;
              }
              totalVal=totalVal+temps;
              count++;

      }
          medelVarde=totalVal/count;
          System.out.println(medelVarde);
          System.out.println("Highest val :" + maxVal);
          System.out.println("Lowest val :"+ minVal);
          

            }
     }
    

