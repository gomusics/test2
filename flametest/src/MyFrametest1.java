import javax.swing.*;

import java.awt.FlowLayout;
import java.util.*;

class MyFrame extends JFrame {
	public MyFrame() {
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("My Frame");
		
		setLayout(new FlowLayout());
		JButton button = new JButton("¹öÆ°");
		this.add(button);
		setVisible(true);
	}
}

public class MyFrametest1 {

	public static void main(String[] args) {
		MyFrame f = new MyFrame();

	}

}
