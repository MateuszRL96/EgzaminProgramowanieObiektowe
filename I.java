// 12. Dany jest kod programu:
abstract interface I {
    public int f(); // metoda f nie robi nic w tym przypadku

    // dodałem klasę main w celu przeprowadzania testów
    public static void main(String[] args) {
        B b = new C((int) 3.14); // obiekt typu C jest tworzony z argumentem 3,
                                 // następnie jest przypisywany do obiektu typu B
        
        System.out.println(b.f()); // wyświetla wartość zwracaną przez metodę f() -> 103
    }
 }
 
 abstract class A implements I {
     public abstract int f(); // metoda f() nie robi nic w tym przypadku
 }
 
 class B extends A {
     public int x;
     public B(int x) { this.x = x; } // przypisuje argument x do obiektu np. b.x = 103
     public int f() { return x; }  // metoda f() zwraca wartość parametru x dla obiektów typu B
 }
 
 class C extends B {
     static int s = 100;
     public C(int z) { super(z + s); } // konstruktor dodaje do argumentu 'z' argument 's' np. 3 + 100, następnie przesyła
                                       // wynik do konstruktora nadklasy czyli B (public B(int x) { this. x = x;})
                                       // dzięki temu parametr jest inicjalizowany w nowotworzonym obiekcie
 }
 
/*Odpowiedz PRAWDA lub FALSZ na ponizsze pytania:
 1. Instrukcja B b = New C((int) 3.14); jest poprawna      FALSZ
New powinno być z małej litery (new) aby instrukcja była poprawna, w innym przypadku wyskakuje błąd
 2. Plik z powyższym kodem musi się nazywać I.java     PRAWDA
Interfejs ten jest typu public, a elementy publiczne muszą się znajdować w odrębnych plikach
 3. B jest pochodna klasy C    FALSZ
C jest pochodną (podrzędną) klasy B, B jest pochodną klasy A, tak więc C jest również pochodną klasy A
 4. Konstruktor klasy C możemy zapisać inaczej jako: public C(int z) {x = (z+s)}; (nie pewne czy to tam pisze)   FALSZ
W tym przypadku wartość x nie jest inicjalizowana do obiektu oraz x nie istnieje jako parametr w klasie C
 5. Linia: A a = New A() jest poprawna      FALSZ
Nie można tworzyć obiektu bezpośrednio z klasy A gdyż jest abstrakcyjna, poza tym New znów powinno być z małej litery,
a na końcu powinien być średnik
*/




//Notatki odnośnie dziedziczenia:

/*
W instrukcji B b = new C((int) 3.14); "B b" oznacza deklarację zmiennej "b" typu "B".
W tej instrukcji tworzymy nowy obiekt klasy "C" i przypisujemy go do zmiennej "b", która jest typu "B". 
W ten sposób możemy uzyskać dostęp do właściwości i metod dziedziczonych z klasy "B" i użyć ich w naszym programie.
Uwaga: Przypisanie nowego obiektu klasy "C" do zmiennej "b" typu "B" jest dozwolone ze względu na dziedziczenie 
(klasa "C" jest podklasą klasy "B").
*/

/*
Różnica między instrukcją C b = new C((int 3.14); a instrukcją B b = new C((int) 3.14); polega na typie obiektu, 
który jest tworzony i przypisywaney do zmiennej. Jeśli użyjesz instrukcji C b = new C((int) 3.14); to tworzysz obiekt 
klasy C i przypisujesz go do zmiennej o typie C. To jest poprawne, ponieważ klasa C dziedziczy po klasie B i jest 
jej poprawną implementacją.

Natomiast jeśli użyjesz instrukcji "B b = new C((int) 3.14);", to również tworzysz obiekt klasy C, 
ale przypisujesz go do zmiennej o typie B. To jest również poprawne, ponieważ klasa C jest poprawną implementacją klasy B.
W tej sytuacji możesz używać tylko tych funkcji, które są dostępne w klasie B, ponieważ zmienna jest typu B.
Tak więc, w tym przypadku nie masz dostępu do funkcji w klasie C.
*/

/*
Słowo kluczowe "super" służy do wywoływania konstruktora klasy nadrzędnej, jeżeli konstruktor klasy nadrzędnej oczekuje
parametrów np. public B(int x) to wymagane jest podanie wymaganych parametrów przy wywoływaniu instruckji w klasie 
pochodnej np. public C(int z) {super(parametr);}
 */