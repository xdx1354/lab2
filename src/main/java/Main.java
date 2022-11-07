import java.util.*;

import edu.colorado.io.EasyReader;

/*
INPUT FORMAT: X  R/W
GDZIE X TO ŻĄDANA LICZBA GENEROWANYCH SAMOCHODÓW
R - WYPISANIE LISTY W TERMINALU
W - WYPISANIE LISTY W TERMINALU PO WYRZUCENIU WYJĄTKU MYEXCEPTION
 */

public class Main {
    public static void main (String[] Args){

        List<Car> cars = new ArrayList<>();
        List<Car> carsResult = new ArrayList<>();

        Integer numberOfCars = Integer.parseInt(Args[0]);       //Zczytuje zadaną liczbę samochodów z CLI
        String outputOption = Args[1];                          //Zczytuje R lub W z CLI

        Utilities.randomise(numberOfCars,cars);                    //Generowanie tablicy samochodów o losowych danych
        Utilities.sorting(cars);                                   //Sortowanie tablicy samochodów
//        System.out.println(cars.size());
//        System.out.println(cars);

        System.out.print("Wybierz kryterium wyszukiwania: \n 1. Najstarszy \n 2. Nie starszy niż *wybrany rok* \n 3. Nie młodszy niż *wybrany rok* \n");
        EasyReader input = new EasyReader(System.in);
        int n = input.intInput();
        switch (n) {
            case 1 -> {
                carsResult.add(cars.get(0));
                try{
                    checkException(outputOption,carsResult);
                }
                catch (Exception e){
                    System.out.println("Wykryto " + e + " (podano na wejscie programu argument W)");
                }

                if(Objects.equals(Args[1], "R")){
                    System.out.println(cars.get(0));
                }

            }
            case 2 -> {
                System.out.print("Podaj rok (1980-2022): ");
                EasyReader rok = new EasyReader(System.in);
                int inputYear = rok.intInput();
                Utilities.UpFromYear(cars, carsResult, inputYear);

                try{
                    checkException(outputOption,carsResult);
                }
                catch (Exception e){
                    System.out.println("Wykryto " + e + " (podano na wejscie programu argument W)");
                }

                if(Objects.equals(Args[1], "R")){
                    System.out.println(carsResult);
                }

            }
            case 3 -> {
                System.out.println("Podaj rok(1980-2022): ");
                EasyReader rok = new EasyReader(System.in);
                int inputYear = rok.intInput();
                Utilities.DownFromYear(cars, carsResult, inputYear);

                try{
                    checkException(outputOption,carsResult);
                }
                catch (Exception e){
                    System.out.println("Wykryto " + e + " (podano na wejscie programu argument W)");
                }

                if(Objects.equals(Args[1], "R")){
                    System.out.println(carsResult);

                }
            }
        }
    }

    static void checkException(String outputOption,List<Car> carsResult) throws MyException{
        if(Objects.equals(outputOption, "W")){
            throw new MyException(carsResult);

        }
    }
}