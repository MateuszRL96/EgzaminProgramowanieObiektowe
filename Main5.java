// Word 1. Jaki będzie wynik poniższego kodu: 
//package mu_gui;
public class Main5{
    public static void main(String[] args) {
        try{
            badMethod();
            System.out.print("A");
        }
        catch(Exception ex1){
            System.out.print("C");
        }
        finally{
            System.out.print("B");
        }
        System.out.print("E");
    }
    public static void badMethod(){
        throw new Error();
    }
}
// Rozwiązanie: Wyświetla się B i wyskakuje błąd