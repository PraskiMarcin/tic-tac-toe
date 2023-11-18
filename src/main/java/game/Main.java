package game;


public class Main {
    //1 klasa obsługę klawiatury oraz wyświetlanie obecnego stanu gry
    //obsługę logiki i mechaniki gry.
    public static void main(String[] args) {
        Board board = new Board();
        BoardPrinter boardPrinter = new BoardPrinter();
        KeyboardReader keyboardReader = new KeyboardReader();
        char player = 'X';

       // boardPrinter.print(board);
        while (true){
            System.out.println("teraz ruch gracza " + player);
            int col = keyboardReader.read("Podaj kolumne");
            int row = keyboardReader.read("Podaj wiersz");
            if (board.valueIsSet(row,col)){
                System.out.println("wstaw znak w puste pole");
                continue;
            }
            board.setState(row,col,player);
            boardPrinter.print(board);
            if (board.isVictory(player)){
                System.out.println("wygrał gracz " + player);
                break;
            }
            if (board.isFull()){
                System.out.println("brak zwyciezcy");
                break;
            }

            if (player == 'X'){
                player = 'O';
            }else {
                player = 'X';
            }
        }
    }
}