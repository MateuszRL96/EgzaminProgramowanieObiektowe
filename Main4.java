// 1. Jaki jest wynik poniższego kodu?
public class Main4{
    public static void main(String[] args) {
        int[] a = new int[10]; // a[0] = 0, a[1] = 0, ... , a[9] = 0 
        for(int i = 0; i<a.length-1; i++){  // i<9, i=0 ... i=8
            a[i] = a[i++]+i;
            // a[0] = a[0]+1; a[0] = 1, występuje inkrementacja w instrukcji i inkrementacji w pętli: i=2
            // a[2] = a[2]+3; a[2] = 3, i=4
            // a[4] = a[4]+5; a[4] = 5, i=6
            // a[6] = a[6]+7; a[6] = 7, i=8
            // a[8] = a[8]+9; a[8] = 9, i=9 warunek nie został spełniony
            // zakończenie pętli
        }
        for(int i=0; i<a.length; i++){ // i<10, i=0 ... i=9
            System.out.print(a[i]+"\t");
        }
    }
}
// Rozwiązanie: 1    0   3   0   5   0   7   0   9   0