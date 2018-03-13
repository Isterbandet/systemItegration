package Uppgift3_Bensinförbrukning;
import java.util.Scanner;


public class Uppgift3 {
    Uppgift3(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Hej! Mata in antalet körda mil");
        double antalMil=0;
        double literBensin = 0;
        double förBrukning;
        try{
        antalMil = sc.nextDouble();
        }
        catch(Exception e){
            System.out.println("Mata in antal körda mil !");
        }
        
        System.out.println("Mata in anta liter du har tankat");
        literBensin = sc.nextDouble();
        
        förBrukning = literBensin / antalMil;
        
        System.out.println("Din bensinförbrukning är ; "+ förBrukning);
        
    }

    
     public static void main(String [ ] args){
        Uppgift3 upg3 = new Uppgift3();

}
    
}
