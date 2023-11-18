package game;

public class Board {
    private char [][] state = {
            {' ',' ',' '},
            {' ',' ',' '},
            {' ',' ',' '}
    };

    public char[][] getState() {
        return state;
    }

    public void setState(int row,int col, char value){
        state[row - 1][col - 1] = value;
    }

    public boolean valueIsSet(int row, int col) {
        return state[row - 1][col - 1] != ' ';
    }

    public boolean isVictory(char value) {
        // row
        for (int row = 0; row < state.length; row++) {
            int sum = 0;
            for (int col = 0; col < state.length; col++) {
                if (state[row][col] == value) {
                    sum++;
                }
            }
            if (sum == state.length){
                return true;
            }
        }

        // col
        for (int col = 0; col < state.length; col++) {
            int sum = 0;
            for (int row = 0; row < state.length; row++) {
                if (state[row][col] == value) {
                    sum++;
                }
            }
            if (sum == state.length){
                return true;
            }
        }
        int sum = 0;
        for (int i = 0; i < state.length; i++){
            if (state[i][i] == value) {
                sum++;
            }
        }
        if (sum == state.length){
            return true;
        }

        sum = 0;
        for (int i = 0; i < state.length; i++){
            if (state[i][state.length-1-i] == value){
                sum++;
            }
        }

        if (sum == state.length){
            return true;
        }



        return false;
    }

    public boolean isFull(){
        for (int row = 0; row < state.length; row++){
            for (int col = 0; col < state.length; col++ ){
                if (state[row][col] == ' '){
                    return false;
                }
            }
        }
        return true;
    }
}
