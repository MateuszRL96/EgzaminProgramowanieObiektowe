// 5. Jaki będzie wynik kompilacji poniższego kodu:
public class Main {

    private int anInt;

    public Main() {
        anInt = 4; // przypisuje wartość 4 do parametru nowego obiektu
    }

    public static void main(String[] args) {
        Main m = new Main();
        int anInt = 6; // nie ma wpływu -> w tym przypadku jest to wartość lokalna
        m.print(5); // wprowadza argument 5 do metody print(int anInt), nie zmienia parametru obiektu
    }

    public void print(int anInt) {
        System.out.println(anInt); // wyświetla argument podany w metodzie
    }
}

// Rozwiązanie: program wyświetla cyfrę 5
