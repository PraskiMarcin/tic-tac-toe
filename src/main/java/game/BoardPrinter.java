package game;

public class BoardPrinter {
    public void print(Board board){

        char[][] playingFiled = board.getState();
        System.out.println("\t1\t2\t3");
        for (int row = 0;row < playingFiled.length; row++){
            System.out.print(row + 1);
            System.out.print(" | ");
            for (int col = 0; col < playingFiled[row].length;col++ ){
                System.out.print(playingFiled[row][col] + " | ");
            }
            System.out.println();
        }
    }
}
