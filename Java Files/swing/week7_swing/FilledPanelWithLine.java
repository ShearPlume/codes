package swing.week7_swing;

import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.Border;
public class FilledPanelWithLine extends JPanel{
    public FilledPanelWithLine(int nBorder, int wBorder, int sBorder, 
     int eBorder,Color borderColor, Color fillColor)
     {
    this.setLayout(new BorderLayout());
    Border blackline = BorderFactory.createLineBorder(Color.black); 
     this.setBorder(blackline);
     // need another panel for the inner border
    JPanel mainPanel = new JPanel(new BorderLayout());
    mainPanel.setBackground(borderColor);
    Border emptyBorder = BorderFactory.createEmptyBorder(nBorder,wBorder,sBorder,eBorder); 
    mainPanel.setBorder(emptyBorder);
    JPanel innerPanel = new JPanel();
    innerPanel.setBackground(fillColor);
    mainPanel.add(innerPanel);
    this.add(mainPanel);// attach new panel to container
    }}
    
