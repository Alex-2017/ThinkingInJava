package nine;

/**
 * Created by 10170 on 2017/10/19.
 */
public class GameFactory {

    public static void playGame(GameCreateFactory gameCreateFactory) {
        Game game = gameCreateFactory.getGame();
        while (game.move());
    }

    public static void main(String[] args){
        GameCreateFactory checkerFactory = new CheckerFactory();
        GameCreateFactory chessFactory = new ChessFactory();
        playGame(checkerFactory);
        playGame(chessFactory);
    }
}

interface Game {
    boolean move();
}

interface GameCreateFactory {
    Game getGame();
}

class Checker implements Game {
    private static final int MOVES = 3;
    private int step = 0;
    @Override
    public boolean move() {
        System.out.println("Checker moves "+step);
        return ++step != MOVES;
    }
}

class CheckerFactory implements GameCreateFactory {

    @Override
    public Game getGame() {
        return new Checker();
    }
}

class Chess implements Game {
    private static final int MOVES = 4;
    private int step = 0;
    @Override
    public boolean move() {
        System.out.println("Chess moves "+step);
        return ++step != MOVES;
    }
}

class ChessFactory implements GameCreateFactory {

    @Override
    public Game getGame() {
        return new Chess();
    }
}

