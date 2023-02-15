// 14. Czy w poniższym klasie ChildofTest przesłania testMethod() z klasy TestParent? Odpowiedź uzasadnij.

public class TestParent {
    private void testMethod(){ // metoda nie jest dziedziczona przez klasę ChildOfTest, ponieważ jest prywatna
        System.out.println("Test Method");
    }
    public static void main(String[] args) {
        System.out.println("hi");
    }
}

class ChildOfTest extends TestParent {
    public void testMethod() {
        System.out.println("ChildOfTest Method");
    }
}

// Rozwiązanie: klasa ChildOfTest nie przesłania metody testMethod() z klasy TestParent, gdyż nie jest ona dziedziczona
// przez klasę ChildOfTest, metoda testMethod() w klasie TestParent jest prywatna, co uniemożliwia jej dziedziczenie 
// przez resztę klas

// oczy mnie już bolą od czytania rozmytych dokumentów, oby pomogło, obyśmy zdali