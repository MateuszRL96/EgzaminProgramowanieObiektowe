import java.util.Scanner;
// 9. Dana jest klasa RectangleArea jak poniżej. Uzupełnij metodę getData, w taki sposób, aby wczytywała dane
// z klawiatury i zapisywała je do zmiennych length, width.
class RectangleArea {
    public double length, width, area;
    public void getData(){
        // Rozwiązanie:
        Scanner scan = new Scanner(System.in);
        System.out.print("Input Length: ");
        this.length = scan.nextDouble();
        System.out.print("Input width: ");
        this.width = scan.nextDouble();
        scan.close();
    }
    public void computeField(){
        area = length * width;
    }
    public void fieldDisplay(){
        System.out.println("The area of the rectangle is: " + area);
    }

    // dodałem klasę main do testów
    public static void main(String[] args) {
        RectangleArea area1 = new RectangleArea();
        area1.getData();
        area1.computeField();
        area1.fieldDisplay();
    }

}
