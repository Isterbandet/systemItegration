
package Vehicle;


public class Bil extends Fordon implements IPrintable , IHjulburen {
    int antalVäxlar;
    int växelJustNu;
    int antalhjul = 4;
    


public Bil(int hastighet, int vikt, int antalVäxlar,int växelJustNu){
super(hastighet,vikt);

this.antalVäxlar = antalVäxlar;
this.växelJustNu = växelJustNu;
}
public void setVäxel(int växelJustNu){
    this.växelJustNu = växelJustNu;
}
@Override
public void printMe(){
    System.out.println("Jag är en BIL");
    super.printMe();
    System.out.println("Antal växlar är:"+ antalVäxlar);
    System.out.println("Växel just nu är :"+ växelJustNu);
}

public int igetantalhjul(){
    return this.antalhjul;
}


}
