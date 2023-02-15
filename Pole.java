import java.util.Scanner;
// 6. Dana jest klasa Pole jak poniżej. Uzupełnij metodę obliczPole, w taki sposób, aby wczytywała dane z
// klawiatury (w konsoli) do zmiennej bok oraz obliczała pole kwadratu
public class Pole {
    public double pole;

    public double obliczPole() {
        // Rozwiązanie: (nie ogarniam BufferedReader'a na pamięć)
        Scanner scan = new Scanner(System.in);
        System.out.print("Podaj bok: ");
        double bok = scan.nextDouble();
        scan.close();
        return bok * bok;
    }

    // Rozwiązanie:
    public static void main(String[] args) {
        Pole pole1 = new Pole();
        System.out.println(pole1.obliczPole());
    }
}
