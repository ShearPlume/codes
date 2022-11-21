package swing.week7_swing.week7lab;
import java.awt.*;


public class SearchFont
{
public static void main(String[] args)
{
String[] fontNames=GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
for(int i=0;i<fontNames.length;i++)
System.out.println(fontNames[i]);
}
}