import java.awt.*;
import java.awt.event.*;

public class awteg {
    public static void main(String[] args) {
        Frame frame = new Frame("Survey:");
        Panel panel = new Panel(new BorderLayout());

        Label nameLabel = new Label("Name:");
        TextField nameTF = new TextField(20);
        String[] opts = {"Dance", "Music", "Audience"};
        Label eventsLabel = new Label("Your Role:");
        Choice comboBox = new Choice();
        for (String opt : opts) {
            comboBox.add(opt);
        }
        Label comments = new Label("Comments:");
        TextArea nameTA = new TextArea("Type here", 5, 20);
        Button button = new Button("Submit");

        panel.add(nameLabel, BorderLayout.WEST);
        panel.add(nameTF, BorderLayout.CENTER);
        panel.add(eventsLabel, BorderLayout.NORTH);
        panel.add(comboBox, BorderLayout.EAST);
        panel.add(comments, BorderLayout.SOUTH);
        panel.add(nameTA, BorderLayout.SOUTH);

        frame.add(panel);
        frame.setSize(300, 200);
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
