// 8. Podaj wynik generowany przez poniższy kod:
// oryginalna nazwa klasy głównej w zadaniu to "test", jest to niepoprawne bo nazwy klas powinny być pisane dużymi
class QW1 {
    String str;
    public int num;
    QW1(String s, int a){
        str = s;
        num = a;
    }

    public String toString() {
        return str + " " + num;
    }
}

class Test2 { 
    public static void main(String[] args) {
        QW1 ob = new QW1("Hello", 123);
        QW1 ob1 = new QW1("World", 345);
        ob1 = ob;
        ob.num = 345; // zmiana ta wpływa także dla ob1, gdyż ob1 kopiuje jedynie referencje do obiektu ob, 
                      // ob1 nie tworzy w ten sposób kopii obiektu, oba parametry wpływają na ten sam obiekt (ob)
        System.out.println(ob1);
    }
}
// Rozwiązanie: Hello 345
