public class Car {

    public String make;
    public int price;
    public int year;

    Car(String make, int price, int year){
        this.year = year;
        this.make = make;
        this.price = price;
    }
    @Override
    public String toString(){
        return "Make: "+make+", price:" +price +", year: "+year;
    }

}
