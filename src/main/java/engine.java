import java.util.*;

public class engine {


   public static void randomise(int length,List<Car>cars){
        String []carArray = {"Lamborghini","Volvo","Audi","Skoda","Porshe","FIAT","Opel","Renault","Dacia","Mazda","POLONEZ","SYRENA"};

        for(int i=0; i<length; i++){
            Random rand = new Random();
            int p_random = 1000+ rand.nextInt(10000);
            int y_random = 1980 + rand.nextInt(42);
            int m_random = rand.nextInt(carArray.length);
            String make = carArray[m_random];
            Car a = new Car(make,p_random,y_random);
            cars.add(a);
        }

    }

   public static void sorting(List<Car>cars){
       cars.sort((s1, s2) -> {
           return (s1.year - s2.year);
       });
   }

   public static void UpFromYear(List <Car> cars,List <Car> carsResult, int inputYear){
       for (int i=0; i<cars.toArray().length; i++){
           if(cars.get(i).year>=inputYear){
               carsResult.add(cars.get(i));
           }
       }
   }
    public static void DownFromYear(List <Car> cars,List <Car> carsResult, int inputYear){
        for (int i=0; i<cars.toArray().length; i++){
            if(cars.get(i).year<=inputYear){
                carsResult.add(cars.get(i));
            }
        }
    }
}
