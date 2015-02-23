
/**
 * Created by User on 10.02.15.
 */
public class AmbulanceCar extends CarDecorator {

    protected AmbulanceCar(Car decoratedCar) {
        super(decoratedCar);
    }

    @Override
    public void Go() {
        decoratedCar.Go();
        System.out.println("Weeew-weeew-weeew, ambulance coming!");
    }
}
