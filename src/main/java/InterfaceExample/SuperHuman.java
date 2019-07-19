package InterfaceExample;

public class SuperHuman extends Human {

    public SuperHuman(String name, Integer age) {
        super(name, age);
    }

    public void greet(){
        System.out.println("My name is "+this.getName() + " and I'm super");
    }
}
