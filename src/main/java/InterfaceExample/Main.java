package InterfaceExample;

import InterfaceExample.Heros.Icon;
import InterfaceExample.Heros.IronMan;
import InterfaceExample.Heros.ProfessorX;
import InterfaceExample.Interfaces.Fly;
import InterfaceExample.Interfaces.SuperIntelligence;

public class Main {

    public void saveMeFromFalling(Fly fly){
        fly.fly();
    }

    public void solveProblem(SuperIntelligence superIntelligence){
        superIntelligence.think();
    }

    public void start(){
        IronMan ironMan = new IronMan("Iron Man", 40);
        Icon icon = new Icon("Icon", 300);
        ProfessorX professorX = new ProfessorX("Charles", 70);
        saveMeFromFalling(icon);
        saveMeFromFalling(ironMan);
        solveProblem(professorX);
        solveProblem(ironMan);

    }

    public static void main(String[] args) {
        Main main = new Main();
        main.start();
    }
}
