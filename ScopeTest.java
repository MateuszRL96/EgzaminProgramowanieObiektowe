// 8. Podaj wynik generowany przez poniższy kod:
public class ScopeTest {
    int z;
    public static void main(String[] args) {
        ScopeTest myScope = new ScopeTest(); // tworzony obiekt ma przypisany parametr 'z', początkowo ma wartość 0
        int z = 6;
        System.out.println(z); // wypisuje wartość lokalną funkcji -> 6
        myScope.doStuff(); // wypisuje 5 i przypisuje parametrowi 'z' obiektu myScope cyfrę 4
        System.out.println(z); // wypisuje wartość lokalną funkcji -> 6
        System.out.println(myScope.z); // wypisuje wartość parametru obiektu myScope -> 4
    }

    void doStuff(){
        int z = 5; // tworzy lokalny parametr 'z' o wartości 5
        doStuff2(); // przypisuje parametrowi 'z' obiektu myScope cyfrę 4
        System.out.println(z); // wypisuje wartość lokalną 'z' -> 5
    }

    void doStuff2() {
        z = 4; // przypisuje parametrowi 'z' obiektu cyfrę 4, 0 -> 4
    }
}
// Rozwiązanie: wypisuje cyfry, kolejno: 6,5,6,4
