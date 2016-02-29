import javax.swing.JOptionPane;

public class Rectangle {
        public static void main (String [] args){
	        String s1="";
		String s2="";
		s1=JOptionPane.showInputDialog("Please enter the width of the rectangle");
		s2=JOptionPane.showInputDialog("Please enter the hight of the rectangle");
	        double dbls1,dbls2,dbla,dblp;
										                 	dbls1=Double.parseDouble(s1);
													dbls2=Double.parseDouble(s2);
													dbla=dbls1*dbls2;
													dblp=2*(dbls1+dbls2);
													JOptionPane.showMessageDialog(null,"The area of the retangle is" + dbla+"\n The perimeter of the retangle is" + dblp);
																							            	
																									               
																										               }
																											       }
