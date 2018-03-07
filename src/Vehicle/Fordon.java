
 
package Vehicle;


public abstract class Fordon implements IPrintable {
    int hastighet ;
    int vikt;
    
    public Fordon (int hastighet,int vikt){
        this.hastighet = hastighet;
        this.vikt = vikt;
    }
   public void setHastighet(int hastighet){
       this.hastighet = hastighet;
   } 
   @Override
   public void printMe(){
       System.out.println("Hastigheten är :"+ this.hastighet);
       System.out.println("Vikten är :"+ this.vikt);
   }
}
