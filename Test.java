// 11. Jaki będzie wynik poniższego kodu:
import java.util.*;
import java.lang.*;
import java.io.*;

class A{
    final public int method1(int a, int b){return 0;}
}

class B extends A{
    final public int method1(int a, int b){return 1;} // błąd kompilacji, nie można przesłaniać metod final
}

class Test {
    public static void main(String[] args) {
        B b;
        System.out.println( " x = " + b.method1(0,1)); // błąd kompilacji, parametr b nie został zainicjalizowany
                                                            // jako nowy obiekt, jedynie nadano mu typ (B)
    }
}
// Rozwiązanie: błąd kompilacji