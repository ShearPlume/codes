package week9_swingContinuedLecture2;


//import java classes for GUI components
import javax.swing.*;
import java.awt.event.*;

public class MinMaxAveController1 implements ActionListener {
	private MinMaxAveView1 viewObject;
	private MinMaxAveModel modelObject;

	public MinMaxAveController1(MinMaxAveModel model) {
		modelObject = model;
	}

	public void setView(MinMaxAveView1 view) {
		viewObject = view;
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == viewObject.enterField) {
			String numString = viewObject.enterField.getText().trim();
			try {
				double num = Double.parseDouble(numString);
				modelObject.enterNum(num);
				viewObject.updateTextFields();
			} catch (NumberFormatException nfx) {
				JOptionPane.showMessageDialog(viewObject, "Enter a double",
						"Result summary", JOptionPane.ERROR_MESSAGE);
				viewObject.enterField.setText("");
			}
		} else if (e.getSource() == viewObject.clearButton) {
			modelObject.resetFields();
			viewObject.resetTextFields();
		} else if (e.getSource() == viewObject.quitButton)
			System.exit(0);
	}
}
