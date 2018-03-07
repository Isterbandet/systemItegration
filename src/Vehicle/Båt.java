package Vehicle;


public class Båt extends Fordon implements IPrintable {
    int dödvikt;
    String sväng;
    
public Båt(int hastighet, int vikt, int dödvikt, String sväng){
        super(hastighet,vikt);
        this.dödvikt = dödvikt;
        this.sväng = sväng;
}

public void setSväng(String sväng){
    this.sväng= sväng;
}
@Override
public void printMe(){
    System.out.println("Jag är en BÅÅT");
    super.printMe();
    System.out.println("Antal dödvikt:"+ dödvikt);
    System.out.println("Just nu är min sväng :"+ sväng);
}
    
}
