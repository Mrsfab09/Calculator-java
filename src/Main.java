import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double wynik = 0;

        System.out.println("\n\n\t\t--Calculator--\n");

        int numbers;
        do {
            System.out.print("Podaj ilosc liczb ktore chcesz policzyc: ");
            numbers = scanner.nextInt();
            System.out.print("\n");

            if (numbers < 2) {
                System.out.println("[Blad !] Liczba musi byc wieksza od 1\n");
            }
        }while(numbers < 2);

        ArrayList<Double> liczby = new ArrayList<>();

        for(int i =1;i<=numbers;i++){
            System.out.print("Podaj liczbę #" + i + ": ");
            double liczba = scanner.nextDouble();
            liczby.add(liczba);
        }

        System.out.println("\n\t\t\t[MENU]");
        System.out.println("\t | [+] Dodawanie   |");
        System.out.println("\t | [-] Odejmowanie |");
        System.out.println("\t | [*] Mnozenie    |");
        System.out.println("\t | [/] Dzielenie   |");
        System.out.println("\t | [Q] Wyjscie     |\n");

        System.out.print("Wybierz: ");
        char chooseOption = scanner.next().charAt(0);

        switch(chooseOption){
            case '+':
                for (double liczba : liczby) {
                    wynik += liczba;
                }
                System.out.println("Wynik= "+wynik);
                break;
            case '-':
                for (double liczba : liczby) {
                    wynik -= liczba;
                }
                System.out.println("Wynik= "+wynik);
                break;
            case '*':
                for (double liczba : liczby) {
                    wynik *= liczba;
                }
                System.out.println("Wynik= "+wynik);
                break;
            case '/':
                for (int i = 1; i < liczby.size(); i++) {
                    if (liczby.get(i) != 0) {
                        wynik /= liczby.get(i);
                    } else {
                        System.out.println("\n[Błąd !] Nie można dzielić przez zero.");
                        return;
                    }
                }
                System.out.println("Wynik= "+wynik);
            default:
                System.out.println("\n[Blad !] Nieprawidlowy znak, podaj poprawny znak");
                break;
        }
    }
}
//TODO Adding colors in terminal