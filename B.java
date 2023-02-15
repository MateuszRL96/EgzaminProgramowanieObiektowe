// 13. Dany jest kod programu jak poniżej. Jaki jest wynik kompilacji tego programu.
class A{
    public byte getNumber(){
        return 1;
    }
}

class B extends A{
    public short getNumber(){ // Rozwiązanie: błąd kompilacji
                              // Klasa B przesłania metodę klasy A, aczkolwiek przesłaniana metoda musi mieć ten sam
                              // typ zwracany lub podtyp, klasa A zwraca typ byte natomiast klasa B zwraca typ short
        return 2;
    }

    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.getNumber());
    }
}
