package main.java.pt.pokemon;

import java.util.ArrayList;
import java.util.List;

public class Game {

    //contar numero total de pokemons - comeca a 1 porque a casa inical conta como o primeiro
    private int numPokemons = 1;

    //posicao inicial do Ash
    private int positionX = 0;
    private int positionY = 0;

    //representacao da grelha do mundo
    private List<String> world = new ArrayList<String>();

    //verifica se a casa tem um pokemon e se tiver apanha-o
    private void checkHouse(int posX, int posY){

        //se a casa nao existir adiciona, se ja exitir sabemos que o pokemon foi apanhado
        if(!world.contains(posX + "," + posY)) {
            world.add(posX + "," + posY);
            numPokemons += 1;
        }

    }

    //executa o jogo processando todos os movimentos dados no input
    public int play(String movements){

        //medir tempo de execução de um jogo
        long startTime = System.nanoTime();

        //criar casa inicial
        world.add("0,0");

        //processa o input, fazendo a conversao a maiusculas caso seja necessario
        String moveSequence = movements.toUpperCase();
        String[] parsedMoveSequence = moveSequence.split("");

        //para cada movimento, move-se para a nova posicao e verifica se a casa tem pokemon ou ja foi visitada
        for(String c : parsedMoveSequence){
            switch(c) {
                case "N" :
                    positionY += 1;
                    checkHouse(positionX, positionY);
                    break;

                case "S" :
                    positionY -= 1;
                    checkHouse(positionX, positionY);
                    break;

                case "E" :
                    positionX += 1;
                    checkHouse(positionX, positionY);
                    break;

                case "O" :
                    positionX -= 1;
                    checkHouse(positionX, positionY);
                    break;

                default :
                    System.out.println("Invalid movement! Please try again. Movement must be one of: N,S,E,O");
                    return -1;
            }
        }

        //converter nanosegundos em millisegundos
        double delta = (System.nanoTime() - startTime) / 1000000.0;

        //optei por incluir a informacao extra relativamente aos tempos para mostrar de forma mais clara
        //como e a performance do programa com cada um dos inputs
        System.out.println(numPokemons + " - the program executed in " + delta + " milliseconds");

        //resultado utilizado nos testes JUnit para validar a resposta
        return numPokemons;

    }



}
