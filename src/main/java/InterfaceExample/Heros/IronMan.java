package InterfaceExample.Heros;

import InterfaceExample.Human;
import InterfaceExample.Interfaces.Fly;
import InterfaceExample.Interfaces.Strength;
import InterfaceExample.Interfaces.SuperIntelligence;

public class IronMan extends Human implements Fly, SuperIntelligence, Strength {
    public IronMan(String name, Integer age) {
        super(name, age);
    }

    public void fly() {
        System.out.println("I got a super suit");
    }

    public void throwObject() {

    }

    public void think() {

    }
}
