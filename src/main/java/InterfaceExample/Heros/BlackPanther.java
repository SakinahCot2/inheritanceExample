package InterfaceExample.Heros;

import InterfaceExample.Interfaces.Agility;
import InterfaceExample.Interfaces.Strength;
import InterfaceExample.SuperHuman;
import InterfaceExample.Interfaces.SuperIntelligence;

public class BlackPanther extends SuperHuman implements Agility, SuperIntelligence, Strength {

    public BlackPanther(String name, Integer age) {
        super(name, age);
    }

    public void flip() {
        System.out.println("Did a flip");
    }

    public void parkour() {
        System.out.println("PARKOUR");
    }

    public void climbWall() {
        System.out.println("GOING UP ON A TUESDAY");
    }

    public void think() {
        System.out.println("ME SO SMART");
    }

    public void throwObject(){

    }
}
