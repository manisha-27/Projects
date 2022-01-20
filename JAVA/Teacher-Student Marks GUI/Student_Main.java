import java.awt.BorderLayout;
import java.awt.event.ActionEvent;  
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Student_Main {
	Student_Main(){

        JFrame frame = new JFrame("Student GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,150);
        JPanel panel = new JPanel();
        JPanel panel1 = new JPanel();
        JButton ent = new JButton("ENTER ID");
        ent.setBounds(90,600,140, 40);
        JLabel label = new JLabel();        
        label.setText("ID :");
        JTextField textfield= new JTextField();
        textfield.setBounds(120, 40, 150, 30);
        panel.add(ent);
        panel1.add(textfield);
       
        frame.add(label);
        frame.add(textfield);
        
        
        ent.addActionListener(new ActionListener() {

        	@Override
        	public void actionPerformed(ActionEvent arg0) {
        	       funent();                
        	}          
        	});
      //  frame.setLayout(null);
        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.getContentPane().add(BorderLayout.CENTER, panel1);
        frame.setVisible(true);    
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   

	}
	public void funent() {
		
		JFrame f=new JFrame("Student Details");
		         
		            //back button
		JButton back=new JButton("Back");    
        back.setBounds(90,200,140, 40); 
		
	      JLabel label1 = new JLabel();        
	      label1.setText("Marks ");
	      label1.setBounds(110, 0, 100, 100);
	      JLabel label = new JLabel();        
	      label.setText("Student ID:");
	      label.setBounds(10, 50, 100, 100);
	      JLabel label9 = new JLabel();        
	      label9.setText("Student ID ");  //yahan pe Student ki id ka msg daaldena (-_-)
	      label9.setBounds(110, 50, 100, 100);
	      JLabel label2= new JLabel();
	      label2.setText("Subject: ");
	      label2.setBounds(10, 110, 100, 100);
	      
	      
          //yahan pe show kara dena marks ko  (-_-)
         JLabel label6 = new JLabel();        
         label6.setText("MathsNo.");
         label6.setBounds(110, 110, 100, 100);
         JLabel label7 = new JLabel();        
         label7.setText("PhysicsNo.");
         label7.setBounds(170, 110, 100, 100);
         JLabel label8 = new JLabel();        
         label8.setText("EnglishNo.");
         label8.setBounds(230, 110, 100, 100);
	      
	      
	      JLabel label3 = new JLabel();        
          label3.setText("Maths");
          label3.setBounds(110, 140, 100, 100);
          JLabel label4 = new JLabel();        
          label4.setText("Physics");
          label4.setBounds(170, 140, 100, 100);
          JLabel label5 = new JLabel();        
          label5.setText("English");
          label5.setBounds(230, 140, 100, 100);
	      
          f.add(label);
	      f.add(label1);
	      f.add(label2);
	      f.add(label3);
	      f.add(label4);
	      f.add(label5);
	      f.add(label6);
	      f.add(label7);
	      f.add(label8);
	      f.add(label9);
	      f.add(back);
	      f.setSize(300,300); 
	      
	      back.addActionListener(new ActionListener() {
              
              @Override
              public void actionPerformed(ActionEvent arg0) {
            	  f.setVisible(false);
          }          
            });
	      
	      
	      f.setLayout(null);    
	      f.setVisible(true);    
	      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   

		
	}
	 public static void main(String[] args) {    
         new Student_Main();    
	 }
}
