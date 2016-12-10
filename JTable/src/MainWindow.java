import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;

import java.awt.ScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class MainWindow  extends JFrame{
	private JTable table;
	private JButton btnAdd;
	private JButton btnRemove;
	private PersonModel model;
	public MainWindow(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLocationRelativeTo(null);
		setSize(640,400);
		setResizable(false);
		getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10,11,480,430);
		getContentPane().add(scrollPane);
		
		model = new PersonModel();
		table = new JTable(model);
		scrollPane.setViewportView(table);
		table.setBounds(10, 342, 340, -319);
		 
		btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Person person = new Person();
				person.setName(JOptionPane.showInputDialog("Enter your name"));
				person.setSurname(JOptionPane.showInputDialog("Enter your surname"));
				Main.persons.add(person);
				table.updateUI();
				
			}
		});
		btnAdd.setBounds(516, 11, 89, 23);
		getContentPane().add(btnAdd);
		
		btnRemove = new JButton("Remove");
		btnRemove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(table.getSelectedRow()==-1 || Main.persons.size()==0){return;}
				Main.persons.remove(table.getSelectedRow());
				table.updateUI();
			}
		});
		btnRemove.setBounds(516, 45, 89, 23);
		getContentPane().add(btnRemove);
		
		
	}
}
