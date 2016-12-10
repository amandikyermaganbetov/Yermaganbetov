import javax.swing.JFrame;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JRadioButton;


public class MainFrame extends JFrame {
	private JTextField txtDoYouKnow;

	public MainFrame() {
		setVisible(true);
		setSize(300, 300);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Bagdat mal");
		getContentPane().add(rdbtnNewRadioButton, BorderLayout.WEST);
		
		txtDoYouKnow = new JTextField();
		txtDoYouKnow.setText("Do you know answers?");
		getContentPane().add(txtDoYouKnow, BorderLayout.CENTER);
		txtDoYouKnow.setColumns(10);
		
		
	}

}
