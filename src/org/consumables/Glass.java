package org.consumables;

public class Glass<T extends Coloured & Liquid>{

    private T liquidHolder;

    public String getLiquidTaste(){
        /* this is because whatever is going to be inside the private Data member liquidHolder is going to
          implement liquid which has the method taste();
         */
        return liquidHolder.taste();
    }

    public void returnBack(Juice liquidHolder){
      Juice thatStuff    = liquidHolder;
    }

    public static void main(String[] args){
        Juice ju = new Juice();
        ju.testing();
        Cake ca = new Cake();

      Glass<Juice> glass = new Glass<Juice>();
     // Glass<Water> water = new Glass<Water>();
      Glass<Minerals> mineralsGlass = new Glass<Minerals>();

//      water.getLiquidTaste();





































      /*  Glass<Juice> juiceGlass = new Glass<Juice>();
        Juice fanta = new Juice();
        juiceGlass.liquidHolder = fanta;
        Water water = new Water();

        Glass<Water> waterGlass = new Glass<Water>();
        waterGlass.liquidHolder = new Water();
        Bartender bartender = new Bartender();

      // Glass<Cake> cakeHold  =    bartender.<Juice,Water>mix(fanta,water); // It has to be Glass object here;
       /*
       From what I know now, its like an extended class but its not. is not now interms of that Glass Object
       stuff I wrote up there.

       Bartender bartender = new Bartender();
       bartender.

       // Retrieve
       juiceGlass.returnBack(juiceGlass.liquidHolder);
       Juice tath = juiceGlass.liquidHolder;
       new Water() = waterGlass.liquidHolder;
*/
    }
}
