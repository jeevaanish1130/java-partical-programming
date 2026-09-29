import java.awt.*;
import java.awt.event.*;
public class GridLayoutExample extends Frame
{
GridLayoutExample()
{
// Set GridLayout with 3 rows, 2 columns, 10px horizontal and vertical gaps
setLayout(new GridLayout(3, 2, 10, 10));
// Create and add buttons
add(new Button("Button 1"));
add(new Button("Button 2"));
add(new Button("Button 3"));
add(new Button("Button 4"));
add(new Button("Button 5"));
// Frame properties
setTitle("GridLayout Example");
setSize(300, 200);
setVisible(true);
// Close the frame when X button is clicked
addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent e){
dispose();
System.exit(0);
}
});
}
public static void main(String args[])
{
new GridLayoutExample();
}
}
