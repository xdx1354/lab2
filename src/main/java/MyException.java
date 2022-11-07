import java.util.ArrayList;
import java.util.List;

public class MyException extends Exception{

    //List<Car> carsResult = new ArrayList<>();
    MyException(List<Car> carsResult){
            //this.carsResult = carsResult;
        System.out.println(carsResult.toString());
    }
}