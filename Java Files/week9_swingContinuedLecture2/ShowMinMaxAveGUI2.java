package week9_swingContinuedLecture2;


public class ShowMinMaxAveGUI2
{  
	public static void main(String [] args)
	{   //Main creates Model object
		//Main creates Controller object, passing Model object to constructor
		//Controller creates View object, passing Model and Controller objects to constructor

		MinMaxAveModel model = new MinMaxAveModel();
		MinMaxAveController2 controller = new MinMaxAveController2(model);
		//need a method in the controller to create the view! hence different version of controller
	}
}
