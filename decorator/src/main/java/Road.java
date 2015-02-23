/**
 * Created by User on 10.02.15.
 */
public class Road {
    public static void main(String[] args){
        Car superCar = new PoliceCar(new AmbulanceCar(new Mercedes()));
        superCar.Go();
    }
}
