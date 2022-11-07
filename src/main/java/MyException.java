import java.util.List;

public class MyException extends Exception{

    MyException(List<Car> carsResult){
        System.out.println(carsResult.toString());
    }
}