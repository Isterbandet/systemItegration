package Uppgift5_Calculator;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Uppgift5 {
    public Uppgift5 () {
    
        Calculator calc = new Calculator();
        double förstaNr;
        double andraNr;
        double resultat;
        String operator;
        String svar = "";
        
        
        while(true){
        
            System.out.println(svar + "\nSkriv in ett värde du vill multiplicera,addera,dividera eller subtrahera: ");
            Scanner sc = new Scanner(System.in);
            try {
            förstaNr = sc.nextDouble();
            System.out.println("Skriv om du vill / * + -");
            operator = sc.next();
            System.out.println("Skriv in det andra värdet!");
            andraNr = sc.nextDouble();
            resultat = calc.calculate(förstaNr, andraNr, operator);
            svar = "svaret  blev " + resultat+ ". ";
            }
            catch (InputMismatchException e){
                svar = "Gel format på indata" ;
            }
            catch (NoSuchElementException e) {
                svar = "Kunde inte läsa indata" ;
            }
            catch (OperatorNotSupoerted e){
                svar = e.getMessage();
            }

       }
    }
 
    public static void main(String[] args){
        Uppgift5 ö = new Uppgift5();
    }
    
}

