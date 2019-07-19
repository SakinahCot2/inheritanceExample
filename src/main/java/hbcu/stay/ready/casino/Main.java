package hbcu.stay.ready.casino;

public class Main {
    public static void playMyGame(CardGame cardGame){
        System.out.println(cardGame.getType());
        System.out.println(cardGame.getNameOfGame());
        cardGame.play();
    }

    public static void main(String[] args) {
        CardGame game = new TexasHoldem();
        playMyGame(game);
    }
}
