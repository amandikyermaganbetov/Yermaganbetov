import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextField;


public class Main {

	public static void main(String[] args) {
		Okno o = new Okno();
		o.setVisible(true);
		JScrollPane scrPane= new JScrollPane();
		scrPane.setBounds(100, 100, 100, 100);
		o.setLayout(null);
		o.add(scrPane);
		JTextField text = new JTextField(100);
		
		text.setText("asdasdas");
		scrPane.setViewportView(text);

	}

}
