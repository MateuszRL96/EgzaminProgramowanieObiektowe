// 17. Wymień i omów błędy w poniższym kodzie.
// oryginalna nazwa klasy głównej w zadaniu to "test", jest to niepoprawne bo nazwy klas powinny być pisane dużymi
class A {
    int p = 120;
    public void print() { System.out.println("p:" + p); }
}

abstract class B extends A {
    int d = 525;
    public void print() { System.out.println("d:" + d); }
    public void print(int k) { System.out.println("In B"); }
    abstract int add();
}

class C extends B { // klasa C musi zaimplementować metodę add() z klasy B lub być abstrakcyjna
    int m = 424;
    public void print() { System.out.println("m:" + m); }
}

public class Test3 {
    public static void main(String[] args) {
        A a = new A();
        B b = new B(); // nie można tworzyć nowego obiektu z klasy abstrakcyjnej
        C c = new C();

        c = a; // nie można przypisać referencji obiektu a do c, ponieważ A nie jest typem potomnym klasy B,
               // a C wymaga obiektu, który jest typu B lub jego pochodnym
        c.print();
        a = b; // a kopiuje referencje do obiektu b, aczkolwiek utworzenie obiektu b jest niepoprawne, 
               // tak więc przypisanie referencji do niego również, gdyż nie może on istnieć
               // instrukcja sama w sobie nie jest błędna
        
        a.d = 230; // klasa nadrzędna nie dziedziczy parametrów klasy pochodnej, tak więc nie ma do nich dostępu
        a.print();
        a.print(120); // metoda print() w klasie A nie przyjmuje żadnych parametrów
                      // klasa A nie dziedziczy metod klas pochodnych
        
        //to nie są błędy \/
        b = c; //// note: b kopiuje referencje do obiektu c, tak więc teraz wpływa na ten sam obiekt co parametr c
        b.add(); //// note: wykorzystanie metody klasy B na obiekcie o parametrze b jest poprawne,
                 //// gdyż wskazuje ono teraz na obiekt typu C

    }
}
