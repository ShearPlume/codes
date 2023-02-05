public class CDDecorator extends CarDecorator{
    public CDDecorator(Car car)
    {
        super(car);
    }
    @Override
    public Double getPrice() {        
        // TODO Auto-generated method stub
        return decoratedCar.getPrice()+150;
    }

    @Override
    public String getDescription() {
        // TODO Auto-generated method stub
        return super.getDescription()+" and a CDD";
    }
}
