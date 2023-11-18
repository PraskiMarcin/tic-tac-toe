package game;

import java.util.InputMismatchException;
import java.util.Scanner;

public class KeyboardReader {
    private Scanner scanner = new Scanner(System.in);

    public int read(String message){
        while (true){
            System.out.println(message);
            try {
                while (!scanner.hasNextInt()) {
                    System.out.println("niepoprawna wartosc");
                    scanner.next();
                }
                int value = scanner.nextInt();
                if (value>=1 && value<=3){
                    return value;
                }
                System.out.println("liczba musi być z zakresu 1 do 3");
            }catch (InputMismatchException e){
                System.out.println("niepoprawna wartosc");
            }
        }
    }
}
