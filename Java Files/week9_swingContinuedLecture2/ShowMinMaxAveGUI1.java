package week9_swingContinuedLecture2;


public class ShowMinMaxAveGUI1
{  
	public static void main(String [] args)
	{
		MinMaxAveModel model = new MinMaxAveModel();
		MinMaxAveController1 controller = new MinMaxAveController1(model);
		MinMaxAveView1 view = new MinMaxAveView1(model, controller);
		controller.setView(view);
		view.setVisible(true);
	}
}
