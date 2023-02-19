// 15. Co się stanie, jeżeli spróbujesz skompilować i wykonać następujący kod?
class Base {
    protected static int iAge = 3;
}

public class Berniebron extends Base 
{
    public int iAge = 10; // przypisuje wartość 10 do parametru iAge w obiekcie typu Berniebron
                          // metoda go() nie korzysta z tego parametru, 
                          // gdyż w metodzie podane jest aby korzystała z parametru klasy Base (Base.iAge)
    public static void main(String[] args) 
    {
        Berniebron bb = new Berniebron();
        bb.go();
    }
    public void go()
    {
        int iOutput = calc(2);
        System.out.println(iOutput * Base.iAge); // Rozwiązanie: błąd kompilacji
        // błąd kompilacji występuje ponieważ parametr iAge jest prywatny w klasie Base,
        // jeżeli parametr byłby publiczny lub chroniony(protected) to byłby dostępny dla innych klas,
        // ponieważ jest prywatny, nie jest dziedziczony przez klasę Berniebron
    }
    public int calc(int iAge)
    {
        return (this.iAge * iAge); // calc korzysta z parametrów 10 i 2 -> 10 * 2
                                   // gdyż liczba 10 jest przypisana do obiektów typu Berniebron
    }
}
//MateuszKuklec
