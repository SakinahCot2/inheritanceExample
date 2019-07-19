package InterfaceExample.Heros;

import InterfaceExample.Interfaces.Fly;
import InterfaceExample.Interfaces.Strength;
import InterfaceExample.SuperHuman;

public class Icon extends SuperHuman implements Fly, Strength {
    public Icon(String name, Integer age) {
        super(name, age);
    }
    public void fly(){
        System.out.println("Weeeeee Im flying because i can manipulate Gravity");
    }


    public void throwObject(){

    }
}
