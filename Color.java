// 4. Przeanalizuj poniższy kod. Obok utwórz dwa różne obiekty typu Color i
// pokaż w jaki sposób można zmienić barwę dla pola r.
public enum Color {
    RED(255, 0, 0), GREEN(0, 255, 0), BLUE(0, 0, 255);

    public int r;
    public int g;
    public int b;

    private Color(int r, int g, int b) {
        this.b = b;
        this.r = r;
        this.g = g;
    }

    void changeR(int r) {
        this.r = r;
    }

    public static void main(String[] args) {
        // Rozwiązanie:
        Color color1 = RED;   // nie tworzy się obiektów z klasy enum w taki sam sposób jak dla zwykłych klas,
        Color color2 = GREEN; // enum jest już zdefiniowany jako stałe wartości i nie można go dalej modyfikować,
                              // dlatego też konstruktor jest prywatny, bo i tak nie zmienia się wartości jego parametrów

        color1.changeR(221); // 255 -> 221
        color2.changeR(45); // 0 -> 45

        // wyświetlanie parametrów obiektów w celu testów:
        System.out.println(color1.r); // wyświetlanie parametru r obiektu color1: 221
        System.out.println(color2.r); // 45
        System.out.println(color2.g); // 255
        System.out.println(color2.b); // 0
    }
}