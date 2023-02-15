// 13. Umieść prawidłowe instrukcje w linii 9(10), aby program kompilował się poprawnie
//package mu_gui;   nie mam tego package'a, nie chce mi sie instalować
abstract class A
{
    int a = 100;
    public abstract void showA();
}

// Rozwiązanie: (Chyba to jest rozwiązanie, nie do końca wiem co tam pisało)
class B extends A {
    public void showA() {
        System.out.println(a);
    }
}

// Funkcja main do testów, teoretycznie ją też można umieścić w rozwiązaniu
public class Main2{
    public static void main(String[] args) {
        B a = new B();
        a.showA(); // klasa B1 dziedziczy parametr a o wartości 100 po klasie A1
    }
}