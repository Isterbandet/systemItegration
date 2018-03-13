package Uppgift4;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;




public class Uppgift4 {
    private static String s = new String();
    private static int[] växel = {1000,500,200,100,50,20,10,5,2,1};
    private final static String mynt = new String("kronor");
    private final static String sedlar = new String("lappar");
    
    
    public static void såDetSkrivUtRätt(int valör, int mängdenValörer){
        String pengatyp = new String();
        if(valör >=20){
            pengatyp = sedlar;
        }
        else{
            pengatyp = mynt;
        }
        if (mängdenValörer > 0){
        s += "Amtal " +valör+"-"+pengatyp+": "+mängdenValörer+"\n";
        }
    
    }

    public static void main(String[] args) {
    int prisetPåVaran;
    int summanManGer;
    int växeln;
    int beloppetAvValörer;
    Scanner sc = new Scanner(System.in);
    System.out.println("Hej och välkommen skriv vad din vara kostar");
    try {
       prisetPåVaran = sc.nextInt();
       System.out.println("Ange summan du betalar med");
       summanManGer = sc.nextInt();
       växeln = summanManGer - prisetPåVaran;
       
       if (växeln < 0){
       System.out.println("Du har för lite pengar för att betala för denna vasra!");
       System.exit(0);
       }
       System.out.println("Här är valörerna du ska få tillbaka!");
       int mängdenValörer;
       
            for(int i = 0; i < växel.length; i++){
                mängdenValörer = växeln/ växel[i];
                såDetSkrivUtRätt(växel[i], mängdenValörer);
                växeln -= (mängdenValörer * växel[i]);
            }
            
            System.out.println(s);
        }
        catch (InputMismatchException e) {
                System.out.println("Felaktigt tal!");
        }
        catch (NoSuchElementException e) {
            System.out.println("Indata saknas!");
        }
        catch(Exception e){
        System.out.println("Ett fel inträffade");
        }
    }   
}
