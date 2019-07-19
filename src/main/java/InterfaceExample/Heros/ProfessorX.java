package InterfaceExample.Heros;

import InterfaceExample.SuperHuman;
import InterfaceExample.Interfaces.SuperIntelligence;

public class ProfessorX extends SuperHuman implements SuperIntelligence {

    public ProfessorX(String name, Integer age){
        super(name,age);
    }

    public void think() {

    }
}
