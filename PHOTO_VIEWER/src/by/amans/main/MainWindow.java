package by.amans.main;

import java.awt.BorderLayout;
import java.awt.Choice;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.AbstractButton;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MainWindow extends JFrame {
	private JTextField textField;
	private JLabel imageLabel;
	private JPanel panel1;
	private JPanel panel2;
	private JTabbedPane tabbedPane;
	private JLabel lblNewLabel;
	private JButton btnView;
	private JScrollPane scrollPane;
	private JPanel panel;
	private JTextArea txtrEnterUrlHere;
	private JButton btnGetImage;
	private JButton btnGetFile;
	private JMenuBar menuBar;
	private JMenu mnFile;
	private JMenuBar menuBar_1;
	private JMenuItem mntmSave;
	private JMenu mnOptions;
	private JMenuItem mntmExit;

	public MainWindow(int i, int j) {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(660,392);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		panel1 = new JPanel(null);
		panel2 = new JPanel(null);
		
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 38, 611, 307);
		//setResizable(false);
		getContentPane().add(tabbedPane);
		((JTabbedPane) tabbedPane).addTab("Tab 1", panel1);
		
		
		((JTabbedPane) tabbedPane).addTab("Tab 2",panel2);
		
		Choice choice = new Choice();
		choice.setBounds(478, 10, 93, 20);
		
		panel2.add(choice);
		choice.add(".png");
		
		choice.add(".jpg");
		lblNewLabel = new JLabel("Format");
		lblNewLabel.setBounds(402, 10, 70, 20);
		panel2.add(lblNewLabel);
		
		btnView = new JButton("View");
		btnView.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(Main.getImage()==null){return;}
					imageLabel.setIcon(new ImageIcon(Main.getImage()));
					imageLabel.updateUI();
			}
		});
		btnView.setBounds(278, 10, 89, 23);
		panel2.add(btnView);
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 39, 499, 229);
		panel2.add(scrollPane);
		
		panel = new JPanel();
		scrollPane.setViewportView(panel);
		panel.setLayout(new BorderLayout(0, 0));
		
		imageLabel = new JLabel("");
		panel.add(imageLabel, BorderLayout.CENTER);
		
		
		txtrEnterUrlHere = new JTextArea();
		txtrEnterUrlHere.setText("Enter url here");
		txtrEnterUrlHere.setWrapStyleWord(true);
		txtrEnterUrlHere.setBounds(10, 25, 574, 243);
		panel1.add(txtrEnterUrlHere);
		
	btnGetImage = new JButton("GET IMAGE");
		btnGetImage.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					Main.setImage(new URL(txtrEnterUrlHere.getText()));
					
				} catch (MalformedURLException e) {
					
					
					JOptionPane.showMessageDialog(null,"Invalid statement or No internet connection");;
				}
			}
		});
		//btnGetImage.addActionListener(e->System.out.println("Amandik"));
		btnGetImage.setBounds(328, 0, 116, 23);
		panel1.add(btnGetImage);
		
		btnGetFile = new JButton("GET FILE");
		btnGetFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			JFileChooser chouser = new JFileChooser();
			int reply=0;
			reply=chouser.showOpenDialog(null);
			if(reply==JFileChooser.APPROVE_OPTION){
			Main.setImage(chouser.getSelectedFile());}
			}
		});
		btnGetFile.setBounds(462, 0, 89, 23);
		panel1.add(btnGetFile);
		
		menuBar = new JMenuBar();
		menuBar.setBounds(252, 128, 97, 21);
		panel1.add(menuBar);
		
		menuBar_1 = new JMenuBar();
		menuBar_1.setBounds(0, 0, 644, 21);
		getContentPane().add(menuBar_1);
		
		 mnFile = new JMenu("FIle");
		menuBar_1.add(mnFile);
		
		mntmSave = new JMenuItem("Save");
		mntmSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser  chouser = new JFileChooser();
				int reply = chouser.showSaveDialog(null);
				if(reply==JFileChooser.APPROVE_OPTION){
					Main.saveImage(chouser.getSelectedFile(), choice.getSelectedItem() );
				}
				
			}
		});
		mnFile.add(mntmSave);
		
		mnOptions = new JMenu("Options");
		menuBar_1.add(mnOptions);
		
		mntmExit = new JMenuItem("Exit");
		mntmExit.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
			System.exit(0);	
			}
		});
		mnOptions.add(mntmExit);
		//mntmExit.addActionListener(e-> System.out.print("HEllo to Everyone"));
		setVisible(true);
		
		
	}
}
