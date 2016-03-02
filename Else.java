import javax.swing.JOptionPane;
public class Else {
	public static void main (String [] args){
		int s1=12345;
		int s2=23456;
		String s3="";
		String s4="";
		s3=JOptionPane.showInputDialog("please enter your username");
		s4=JOptionPane.showInputDialog("please enter your password");
		double s5,s6;
		s5=Double.parseDouble(s3);
	        s6=Double.parseDouble(s4);
                if(s5==s1){
		if(s2==s6){
		JOptionPane.showMessageDialog(null,"welcome to username");
			}else{ 
				JOptionPane.showMessageDialog(null,"wrong username or password");
			}
			}else{ 
				JOptionPane.showMessageDialog(null,"wrong username or password");
			}
			}								}
