// Word 14. Zmienna v w poniższym programie jest:
import java.util.*;
import java.lang.*;
import java.io.*;

class Ideone1 {
    public static void main(String[] args) {
        double v = 10.5;
        przelicz(v);
        System.out.println("Predkość wynosi : " + v + "m/s");
    }
    public static void przelicz(double v){
        System.out.println("Predkosc w km : " + v*3.6 + "km/g");
    }
}
// Rozwiązanie: Zmienna v jest lokalna w metodzie main, nie jest widoczna w metodzie przelicz(), gdyż nie ma ona dostępu do oryginalnej zmiennej,
// jedynie ma dostęp do wartości tej zmiennej przekazanej jako argument do metody.