// 1. Dana jest klasa Pracownik:
class Pracownik{
    String imie;
    String nazisko; //nazwisko
    double hodziny; //godziny
    int latapracy;
}

public class Main3 {
    public static void main(String[] args) {
        // W tym samym pakiecie co klasa utworzona została tablica zawierająca 100 pracowników
        Pracownik [] employeeData = new Pracownik[100]; // zainicjowanie tablicy 100 elementów
                                                        // bez rzeczywistych obiektów typu Pracownik

        // Tworzenie obiektów typu Pracownik i umieszczanie w tablicy employeeData do testów
        for (int i=0; i<employeeData.length; i++){
            employeeData[i] = new Pracownik();
        }

        // Przypisywanie wartości do niektórych pracowników w celu testów
        employeeData[1].imie = "Grześ";
        employeeData[1].nazisko = "Grześ";
        employeeData[1].hodziny = 245;
        employeeData[1].latapracy = 5;        
        employeeData[5].imie = "Stasiu";
        employeeData[5].nazisko = "Stasiu";
        employeeData[5].hodziny = 503;
        employeeData[5].latapracy = 25;
        employeeData[26].imie = "Zbysiu";
        employeeData[26].nazisko = "Zbysiu";
        employeeData[26].hodziny = 1005;
        employeeData[26].latapracy = 43;
        
        // Zdefiniuj kod, który wyświetli imię, nazwisko praz godziny każdego pracownik,
        // który pracuje w firmie ponad 20 lat.

        // Rozwiązanie: (zakładając że każdy pracownik ma już przypisane jakieś randomowe wartości)
        for (int i=0; i<employeeData.length; i++){
            if(employeeData[i].latapracy > 20){
                System.out.println(employeeData[i].imie + " " + employeeData[i].nazisko + " " + employeeData[i].hodziny);
            }
        }
    }
}
