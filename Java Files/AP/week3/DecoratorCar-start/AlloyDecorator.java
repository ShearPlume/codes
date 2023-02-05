public class AlloyDecorator extends CarDecorator{
    public AlloyDecorator(Car car)
    {
        super(car);
    }
    @Override
    public Double getPrice() {        
        // TODO Auto-generated method stub
        return decoratedCar.getPrice()+250;
    }
    @Override
    public String getDescription() {
        // TODO Auto-generated method stub
        return super.getDescription()+" and an Alloy";
    }
    
}
