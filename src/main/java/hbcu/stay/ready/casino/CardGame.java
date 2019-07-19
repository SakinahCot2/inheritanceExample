package hbcu.stay.ready.casino;

public abstract class CardGame {

    private String type = "I am a Card Game";

    public final String getType(){
        return type;
    }

    public abstract String getNameOfGame();

    public abstract void play();
}
