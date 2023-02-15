// 10. Utwórz dwuwymiarową tablicę 5x5 zawierającą elementy typu całkowitego, następnie wpisz do niej
// liczby parzyste począwszy od 20.
public class Tablica2D {
    public static void main(String[] args) {
        int [][] tablica = new int[5][5];
        int liczba = 20;

        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < tablica[i].length; j++) {
                tablica[i][j] = liczba;
                liczba += 2;
                //System.out.println(tablica[i][j] + " ");
            }
        }
    }
}
