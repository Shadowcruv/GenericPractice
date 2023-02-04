package org.consumables;

public class Bartender {


    //This method is just to make your two choice of parameters to be limitless
    public <T4,T5> Cake mix(T4 anon, T5 ano){
        return new Cake();
    }

    /*This method makes your one choice of parameter to be limitless. But note that the choice must implement the liquid
    interface

     */
    public <T6 extends Liquid> void setting(T6 now){

    }


}
