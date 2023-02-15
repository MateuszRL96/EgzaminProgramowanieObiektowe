// 7. Jaki będzie wynik działania poniższego kodu?
public class Main1 {
    public static void main(String[] args) {
        String S = ""; String T = "";
        int i = 4;
        for (i = 1; i <= 3; i++); // zastosowanie średnika na końcu pętli powoduje jej niewykorzystanie ~
        S = S + "!"; // ~ dla tej instrukcji
        for (i = 1; i < 4; i++)
            T = T + "*";
        System.out.print(S);
        System.out.println(T);
    }
}
// Rozwiązanie: !***
