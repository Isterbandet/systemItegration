
package Vehicle;

public class Cykel extends Fordon implements IPrintable, IHjulburen {
    int antalVäxlar;
    int växelJustNu;
    
public Cykel(int hastighet, int vikt, int antalVäxlar, int växelJustNu){
    super(hastighet,vikt);
    this.antalVäxlar = antalVäxlar;
    this.växelJustNu = växelJustNu;
}

public void setVäxel(int växelJustNu){
    this.växelJustNu = växelJustNu;
}
@Override
public void printMe(){
    System.out.println("Jag är en liten CYkel!");
    super.printMe();
    System.out.println("Antal växlar är:"+ antalVäxlar);
    System.out.println("Växel just nu är :"+ växelJustNu);
}
public int igetantalhjul(){
    return 2;
}
}
