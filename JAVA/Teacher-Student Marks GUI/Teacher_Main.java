import java.awt.BorderLayout; 
import java.awt.FlowLayout;
import javax.swing.*;
import java.awt.event.ActionEvent;  
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame; 

class Teacher_Main{
	Teacher_Main(){
         JFrame frame = new JFrame("Teacher Main Layout");
         frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         frame.setSize(400,100);
        JPanel panel = new JPanel();
        JButton add = new JButton("Add");
        JButton display = new JButton("Display");
        JButton update = new JButton("Update");
        JButton delete = new JButton("Delete\n");
        panel.add(add); // Components Added using Flow Layout
        panel.add(display);
        panel.add(update);
        panel.add(delete);
        
        
        //Links buttons to the function that are to be performed
        add.addActionListener(new ActionListener() {               

        	@Override
        	public void actionPerformed(ActionEvent arg0) {
        	       Add();                
        	}          
        	});
        update.addActionListener(new ActionListener() {

        	@Override
        	public void actionPerformed(ActionEvent arg0) {
        	       Update();                
        	}          
        	});
        delete.addActionListener(new ActionListener() {

        	@Override
        	public void actionPerformed(ActionEvent arg0) {
        	       Delete();                
        	}          
        	});
        display.addActionListener(new ActionListener() {

        	@Override
        	public void actionPerformed(ActionEvent arg0) {
        	       Display();                
        	}          
        	});
        
        
        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.setVisible(true);
	}
        
	
	    //Add Function
        public static void Add(){    
            JFrame f=new JFrame("ADD Enteries"); 
                        //submit button
            JButton b=new JButton("Submit");    
            b.setBounds(90,200,140, 40); 
                
                         //back button
            JButton back=new JButton("Back");    
            back.setBounds(10,200,75, 30); 
            
                        //enter name label
            JLabel label = new JLabel();
            JLabel label5 = new JLabel();        
            label.setText("Enter Name/ID :");
            label.setBounds(10, 10, 100, 100);
            JLabel label_Marks = new JLabel();        
            label_Marks.setText("Enter Marks :");
            label_Marks.setBounds(10, 83, 100, 100);
            
                        //textfield to enter name
            JTextField textfield= new JTextField();
            textfield.setBounds(110, 50, 130, 30);
            
            
                       //creating input box for Subject marks
            JTextField textfield1= new JTextField();
            textfield1.setBounds(110, 120, 40, 30);
            JTextField textfield2= new JTextField();
            textfield2.setBounds(170, 120, 40, 30);
            JTextField textfield3= new JTextField();
            textfield3.setBounds(230, 120, 40, 30);
            
            
                        //creating subjects marks labels
            JLabel label1 = new JLabel();        
            label1.setText("Maths");
            label1.setBounds(110, 110, 100, 100);
            JLabel label2 = new JLabel();        
            label2.setText("Physics");
            label2.setBounds(170, 110, 100, 100);
            JLabel label3 = new JLabel();        
            label3.setText("English");
            label3.setBounds(230, 110, 100, 100);
            
            //add to frame
            f.add(label_Marks);
            f.add(textfield);
            f.add(textfield1);
            f.add(textfield2);
            f.add(textfield3);
            f.add(label);
            f.add(label1);
            f.add(label2);
            f.add(label3);
            f.add(label5);
            f.add(b);
            f.add(back);
            f.setSize(300,300);    
            f.setLayout(null);    
            f.setVisible(true);    
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
            
            //action listener and links the message to the Submit button to be displayed after Submit is clicked
            b.addActionListener(new ActionListener() {
                
                @Override
                public void actionPerformed(ActionEvent arg0) {
                	label5.setText("Enteries updated");  
                    label5.setBounds(100, 130, 100, 100);
            }          
              });
            
          //action listener making this frame not visible
            back.addActionListener(new ActionListener() {
                
                @Override
                public void actionPerformed(ActionEvent arg0) {
              	  f.setVisible(false);
            }          
              });
        }
        
       
           //Update Function
           public void Update(){    
                JFrame f=new JFrame("Update Enteries"); 
                            //submit button
                JButton b=new JButton("Submit");    
                b.setBounds(90,200,140, 40); 
                
                //back button
                JButton back=new JButton("Back");    
                back.setBounds(10,200,75, 30); 
                
                //enter name label
                JLabel label = new JLabel();
                JLabel label5 = new JLabel();
                label.setText("Enter Name/ID :");
                label.setBounds(10, 10, 100, 100);
                
                JLabel label_Marks = new JLabel();
                label_Marks.setText("Enter Marks :");
                label_Marks.setBounds(10, 83, 100, 100);
                
                             //textfield to enter name
                JTextField textfield= new JTextField();
                textfield.setBounds(110, 50, 130, 30);
                
                            //creating input box for Subject marks
                JTextField textfield1= new JTextField();
                textfield1.setBounds(110, 120, 40, 30);
                JTextField textfield2= new JTextField();
                textfield2.setBounds(170, 120, 40, 30);
                JTextField textfield3= new JTextField();
                textfield3.setBounds(230, 120, 40, 30);
                
                
                           //creating subjects marks labels
                JLabel label1 = new JLabel();        
                label1.setText("Maths");
                label1.setBounds(110, 110, 100, 100);
                JLabel label2 = new JLabel();        
                label2.setText("Physics");
                label2.setBounds(170, 110, 100, 100);
                JLabel label3 = new JLabel();        
                label3.setText("English");
                label3.setBounds(230, 110, 100, 100);
                
                //add to frame
                f.add(label_Marks);
                f.add(textfield);
                f.add(textfield1);
                f.add(textfield2);
                f.add(textfield3);
                f.add(label);
                f.add(label1);
                f.add(label2);
                f.add(label3);
                f.add(label5);
                f.add(b);   
                f.add(back);
                f.setSize(300,300);    
                f.setLayout(null);    
                f.setVisible(true);    
                f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
                
              //action listener and links the message to the Submit button to be displayed after Submit is clicked
                b.addActionListener(new ActionListener() {
                    
                    @Override
                    public void actionPerformed(ActionEvent arg0) {
                            label5.setText("Enteries updated");  
                            label5.setBounds(100, 130, 100, 100);
                    }          
                  });
                
                back.addActionListener(new ActionListener() {
                    
                    @Override
                    public void actionPerformed(ActionEvent arg0) {
                  	  f.setVisible(false);
                }          
                  });
                
                }   
           
           //Delete Function
           public void Delete() {
     		  JFrame f= new JFrame("DELETE ENTRY");
     		  //submit button
     		  JButton b= new JButton("Submit");
     	       b.setBounds(90,170,140, 40);
     	       
               //back button
               JButton back=new JButton("Back");    
               back.setBounds(10,170,75, 30); 

     		  //enter label
     		  JLabel label= new JLabel();
     		  label.setText("Enter ID");
     		  //setting bounds
     		  label.setBounds(10, 10, 100, 100);
     		  JTextField textfield= new JTextField();
     	      textfield.setBounds(110, 50, 130, 30);
     	      f.add(label);
     	      f.add(textfield);
     	      f.add(b); 
     	      f.add(back);
     	      f.setSize(300,300);    
     	      
     	      f.setLayout(null);    
     	      f.setVisible(true);    
     	      f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     	      
     	   //action listener and links the message to the Submit button to be displayed after Submit is clicked
              b.addActionListener(new ActionListener() {           
                  
                  @Override
                  public void actionPerformed(ActionEvent arg0) {
                          label.setText("ID Deleted");   
                          label.setBounds(90, 90, 200, 100);
                  }          
                });
              
              back.addActionListener(new ActionListener() {
                  
                  @Override
                  public void actionPerformed(ActionEvent arg0) {
                	  f.setVisible(false);
              }          
                });
     		  
     	  }
           
           public static void Display1() {  
        	   
               // Create and set up the window.  
               final JFrame frame = new JFrame("Enteries Display");  
               
               //back button
               JButton back=new JButton("Back");    
               back.setBounds(10,200,75, 30); 
         
               // Display the window.  
               frame.setSize(450, 350);  
               frame.setVisible(true);  
               frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
         
               // set flow layout for the frame
               frame.getContentPane().setLayout(new FlowLayout());  
         
               frame.add(back);
               
               JTextArea textArea = new JTextArea(15, 40);  
               JScrollPane scrollableTextArea = new JScrollPane(textArea);  
         
               scrollableTextArea.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);  
               scrollableTextArea.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);  
         
               frame.getContentPane().add(scrollableTextArea); 
               
               back.addActionListener(new ActionListener() {
                   
                   @Override
                   public void actionPerformed(ActionEvent arg0) {
                 	  frame.setVisible(false);
               }          
                 });
               
               }  
           public static void Display() {  
         
         
               javax.swing.SwingUtilities.invokeLater(new Runnable() {  
         
                   public void run() {  
                       Display1();  
                   }  
               });  
           }

	public static void main(String[] args) {
		new Teacher_Main(); 
	}
		
}
