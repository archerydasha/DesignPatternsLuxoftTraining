/**
 * Created by User on 10.02.15.
 */
public abstract class CarDecorator extends Car{
    protected Car decoratedCar;
    protected CarDecorator(Car decoratedCar){
        this.decoratedCar = decoratedCar;
    }
}
