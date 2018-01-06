package main.java.pt.pokemon;

public class Main {

    public static void main(String[] args){

        String input = "";

        //ler movimentos do stdin
        if (args.length != 0) {
            input = args[0];
        }

        Game game = new Game();
        game.play(input);

    }
}