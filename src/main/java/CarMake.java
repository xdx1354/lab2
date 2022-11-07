import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum CarMake {
    Lamborghini,
    Porshe,
    Audi,
    Volvo,
    Skoda,
    Fiat,
    Opel,
    Renault,
    POLONEZ,
    SYRENA;


    private static final List<CarMake> VALUES = Collections.unmodifiableList(Arrays.asList(values()));
    private static final int size = VALUES.size();
    private static final Random rand = new Random();

    public static CarMake randomCarMake(){
        return VALUES.get(rand.nextInt(size));
    }
}
