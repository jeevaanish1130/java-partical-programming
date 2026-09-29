import java.awt.*;
public class ButtonExample extends Frame
{
ButtonExample()
{
// Create a Button
Button btn = new Button("Click Me");
// Set Button Position
btn.setBounds(100, 80, 100, 40);
// Add Button to Frame
add(btn);
// Set Frame Properties
setTitle("Button Example");
setSize(300, 200);
setLayout(null);
setVisible(true);
}
public static void main(String args[]){
new ButtonExample();
}
}
