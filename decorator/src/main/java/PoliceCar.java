/**
 * Created by User on 10.02.15.
 */
public class PoliceCar extends CarDecorator{

    protected PoliceCar(Car decoratedCar) {
        super(decoratedCar);
    }

    @Override
    public void Go() {
        decoratedCar.Go();
        System.out.println("Warning! Police Car on the rode!");
    }
}
