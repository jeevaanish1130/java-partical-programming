import java.awt.*;
public class HelloWorldAWT extends Frame
{
HelloWorldAWT()
{
// Create a Label
Label lbl = new Label("Hello World");
// Set Label Position
lbl.setBounds(100, 100, 100, 30);
// Add Label to Frame
add(lbl);// Set Frame Properties
setTitle("Hello World AWT");
setSize(300, 200);
setLayout(null);
setVisible(true);
}
public static void main(String args[])
{
new HelloWorldAWT();
}
}
