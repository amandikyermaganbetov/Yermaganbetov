import java.awt.BorderLayout;
import java.util.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;


public class MainWindow extends JFrame {
	private static TutorListModel t;
	private JList<String> list;
		public MainWindow(){
			
			t = new TutorListModel();
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setSize(600,500);
			setResizable(false);
			setLocationRelativeTo(null);
			getContentPane().setLayout(null);
			
			JScrollPane scrollPane = new JScrollPane();
			scrollPane.setBounds(0,23, 525, 448);
			getContentPane().add(scrollPane);
			
			list = new JList<String>(t);
			
			
			scrollPane.setViewportView(list);
			
			JButton btnRemove = new JButton("remove");
			
			btnRemove.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
				List<String> objects = list.getSelectedValuesList();	
					for(String s: objects){
						t.removeElement(s);
					}
					list.updateUI();
					
				}
			});
			btnRemove.setBounds(525, 23, 69, 448);
			getContentPane().add(btnRemove);
			
			JButton btnAddElement = new JButton("Add Element");
			btnAddElement.setBounds(263, 0, 331, 23);
			btnAddElement.addActionListener(new ActionListener() {
				

				public void actionPerformed(ActionEvent e) {
					String s= JOptionPane.showInputDialog("Enter your element");
					t.addElement(s);
					list.updateUI();
				}
			});
			getContentPane().add(btnAddElement);
			
		
			
			
			
			list.updateUI();
			setVisible(true);

			
		}
		
		public void addElement(String s){
			t.addElement(s);
		}
		public void removeElement(int index){
			t.removeElement(index);
		}
		
}
