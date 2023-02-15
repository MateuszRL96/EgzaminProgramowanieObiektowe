// 15. Wyjaśnij, co się stanie, jeżeli spróbujesz skompilować i wykonać następujący kod:
interface Tess {
    public void isle(); //metoda nic nie robi
}

class Jack{
    short s = 10;
    long l = 10;
    double d = 10;
}

public class Tesco extends Jack implements Tess{
    public static void main(String[] args) {
        System.out.println(d);  // Rozwiązanie: błąd kompilacji
                                // parametr d nie istnieje w klasie Tesco oraz nie jest dziedziczony od klasy Jack,
                                // ponieważ nie został on upubliczniony (jest prywatny)
    }
    public void isle(){} // metoda nic nie robi
}
