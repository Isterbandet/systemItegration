
package Vehicle;

public class Tåg extends Fordon implements IPrintable{
    int antalVagnar;
    int kopplaVagn;
    
public Tåg(int hastighet, int vikt, int antalVagnar,int kopplaVagn){
    super(hastighet,vikt);
    this.antalVagnar = antalVagnar;
    this.kopplaVagn = kopplaVagn;
}
            
public void kopplaVagnfan(int antalVagnar){
    
    this.antalVagnar=antalVagnar +1;
}
@Override
public void printMe(){
    System.out.println("Jag är TÅG");
    super.printMe();
    System.out.println("Antal vagnar är :"+ antalVagnar);
    System.out.println("Vafan Är kopplaVagn? :" + kopplaVagn);
}

    
}
