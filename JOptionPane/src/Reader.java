import javax.swing.JOptionPane;
public class Reader {
		int i,k;
		String n1,n2;
		public void Scan(){
			n1 = JOptionPane.showInputDialog("Enter the 1st number: ");
			n2 = JOptionPane.showInputDialog("Enter the 2nd number: ");
			i = Integer.parseInt(n1);
			k = Integer.parseInt(n2);
		}
		public void Scan(int a, int b){
			JOptionPane.showMessageDialog(null,"You're first number is: "+i);
			JOptionPane.showMessageDialog(null,"You're second number is: "+k);
			
		}
}
