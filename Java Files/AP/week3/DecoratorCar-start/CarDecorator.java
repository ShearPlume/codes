public abstract class CarDecorator extends Car {
	protected Car decoratedCar;
	public CarDecorator(Car decoratedCar) {
		this.decoratedCar = decoratedCar;
	}
	public Double getPrice() {
		return decoratedCar.getPrice();
	}
	public String getDescription() {
		return decoratedCar.getDescription();
	}
}

// abstract class A
// {
// 	abstract void A();
// }

// abstract class B extends A
// {
// 	abstract void B()
// }

// class C extends B
// {
	
// }