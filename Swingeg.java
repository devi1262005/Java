import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Swingeg {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Survey:");
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.LEFT)); // Create a JPanel to hold components
      // Set GridLayout with 3 rows and 1 column

        JLabel nameLabel = new JLabel("Name:");
        JTextField nameTF = new JTextField(20);
		String[] opts={"Dance","Music","Audience"};
		JLabel Events=new JLabel("Your Role:");
		JComboBox<String> comboBox=new JComboBox<>(opts);
		JLabel comments = new JLabel("Comments:");
        JTextArea nameTA = new JTextArea("Type here", 5, 20);
		JButton but=new JButton("Submit:");


        panel.add(nameLabel);
        panel.add(nameTF);
        panel.add(nameTA);
		panel.add(comments);
		panel.add(nameTA);
		panel.add(Events);
		panel.add(comboBox);

        
        frame.add(panel); // Add the panel to the frame
        frame.setSize(300, 200); // Increased height to accommodate JTextArea
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
