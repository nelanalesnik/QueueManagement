import java.awt.EventQueue;
import javax.swing.JOptionPane;
import javax.swing.JFrame;
import java.awt.GridLayout;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.SystemColor;
import java.awt.Image;
import javax.swing.GroupLayout.Alignment;
import java.io.*;


public class QueueManagement {


	private JFrame frame  ;
	private JTextField Name= new JTextField(8);
	private JTextField Surname= new JTextField(8);
	private JTextField Index= new JTextField(6);
	public int i;
	public int wybrano;
	public int litery;
	public int nr; 
	public int nr1;
	public int nr2;
	public int nr3;
	public int nr4;
	public int nr5;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) throws  IOException{
	
	EventQueue.invokeLater(new Runnable() {
	public void run() {
	try {
	QueueManagement window = new QueueManagement();
	window.frame.setVisible(true);
	} catch (Exception e) {
	e.printStackTrace();
	}
	}
	});
	}

	/**
	 * Create the application.
	 * @wbp.parser.entryPoint
	 */
	public QueueManagement() {
	initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
	
	frame = new JFrame();
	frame.setResizable(false);
	frame.setForeground(SystemColor.textHighlight);
	frame.setBounds(100, 100, 400, 491);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	frame.getContentPane().setLayout(new GridLayout(14, 0, 0, 0));
	
	JPanel panel_1 = new JPanel();
	panel_1.setBackground(new Color(255, 255, 255));
	panel_1.setForeground(Color.WHITE);
	frame.getContentPane().add(panel_1);
	panel_1.setPreferredSize(new Dimension(300, 100000));


	JLabel lblNewLabel1 = new JLabel("");
	Image img = new ImageIcon(this.getClass().getResource("/small.jpg")).getImage();
	lblNewLabel1.setIcon(new ImageIcon(img));
	GroupLayout gl_panel_1 = new GroupLayout(panel_1);
	gl_panel_1.setHorizontalGroup(
	gl_panel_1.createParallelGroup(Alignment.LEADING)
	.addGroup(Alignment.TRAILING, gl_panel_1.createSequentialGroup()
	.addContainerGap(140, Short.MAX_VALUE)
	.addComponent(lblNewLabel1, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
	.addGap(109))
	);
	gl_panel_1.setVerticalGroup(
	gl_panel_1.createParallelGroup(Alignment.LEADING)
	.addComponent(lblNewLabel1, GroupLayout.PREFERRED_SIZE, 32, Short.MAX_VALUE)
	);
	panel_1.setLayout(gl_panel_1);
	

	JPanel panel_2 = new JPanel();
	panel_2.setToolTipText("");
	panel_2.setBackground(new Color(255, 255, 255));
	frame.getContentPane().add(panel_2);
	
	JLabel lblPobierzNumerek = new JLabel("Pobierz numerek:");
	lblPobierzNumerek.setForeground(new Color(0, 128, 128));
	lblPobierzNumerek.setHorizontalAlignment(SwingConstants.RIGHT);
	lblPobierzNumerek.setFont(new Font("Century Gothic", Font.BOLD, 18));
	panel_2.add(lblPobierzNumerek);
	
	JRadioButton btn1 = new JRadioButton("Stacjonarne");
	btn1.setHorizontalAlignment(SwingConstants.CENTER);
	btn1.addMouseListener(new MouseAdapter() {

    	
	@Override
	public void mouseClicked(MouseEvent e) {
	
	
	}
	});
	
	JLabel lblNewLabel_1 = new JLabel("Tryb studi\u00F3w:");
	lblNewLabel_1.setBackground(new Color(192, 192, 192));
	frame.getContentPane().add(lblNewLabel_1);
	lblNewLabel_1.setFont(new Font("Century Gothic", Font.BOLD, 14));
	lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
	
	
	btn1.setFont(new Font("Century Gothic", Font.PLAIN, 11));
	frame.getContentPane().add(btn1);
	
	JPanel panel_3 = new JPanel();
	frame.getContentPane().add(panel_3);
	
	JRadioButton btn2 = new JRadioButton(" Popo\u0142udniowe");
	btn2.setHorizontalAlignment(SwingConstants.CENTER);
	btn2.setFont(new Font("Century Gothic", Font.PLAIN, 11));
	panel_3.add(btn2);
	
	
	
	JPanel panel_4 = new JPanel();
	frame.getContentPane().add(panel_4);
	
	JRadioButton btn3 = new JRadioButton("Sobotnio-niedzielne");
	btn3.addMouseListener(new MouseAdapter() {
	
	@Override
	public void mouseClicked(MouseEvent e) {
	
	}
	});
	btn3.setHorizontalAlignment(SwingConstants.CENTER);
	btn3.setFont(new Font("Century Gothic", Font.PLAIN, 11));
	panel_4.add(btn3);
	
	ButtonGroup grupuj =	new ButtonGroup();	
	grupuj.add(btn2);
	    grupuj.add(btn3);
	grupuj.add(btn1);
	
	JPanel panel_6 = new JPanel();
	frame.getContentPane().add(panel_6);
	
	JLabel lblNewLabel_2 = new JLabel("                  Imi\u0119:");
	lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
	panel_6.add(lblNewLabel_2);
	lblNewLabel_2.setFont(new Font("Century Gothic", Font.BOLD, 14));
	
	Name = new JTextField();
	Name.setHorizontalAlignment(SwingConstants.CENTER);
	panel_6.add(Name);
	Name.setColumns(10);
	
	JPanel panel_8 = new JPanel();
	frame.getContentPane().add(panel_8);
	
	Surname = new JTextField();
	Surname.setHorizontalAlignment(SwingConstants.CENTER);
	Surname.addMouseListener(new MouseAdapter() {
	@Override
	public void mouseClicked(MouseEvent arg0) {
	
	}
	});
	
	JLabel lblNewLabel_3 = new JLabel("          Nazwisko:");
	panel_8.add(lblNewLabel_3);
	lblNewLabel_3.setHorizontalAlignment(SwingConstants.RIGHT);
	lblNewLabel_3.setFont(new Font("Century Gothic", Font.BOLD, 14));
	panel_8.add(Surname);
	Surname.setColumns(10);
	
	JPanel panel_10 = new JPanel();
	frame.getContentPane().add(panel_10);
	
	JLabel lblNewLabel_4 = new JLabel("Numer indeksu:");
	panel_10.add(lblNewLabel_4);
	lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
	lblNewLabel_4.setFont(new Font("Century Gothic", Font.BOLD, 14));
	
	Index = new JTextField();
	Index.setHorizontalAlignment(SwingConstants.CENTER);
	panel_10.add(Index);
	Index.setColumns(10);
	
	JPanel panel_11 = new JPanel();
	frame.getContentPane().add(panel_11);
	
	JPanel panel_5 = new JPanel();
	frame.getContentPane().add(panel_5);
	
	JPanel panel = new JPanel();
	frame.getContentPane().add(panel);
	panel.setPreferredSize(new Dimension(2000, 1000));

	JButton btnNewButton = new JButton("OK");
	Image img2 = new ImageIcon(this.getClass().getResource("/ok.jpg")).getImage();
	btnNewButton.setIcon(new ImageIcon(img2));
	btnNewButton.setForeground(new Color(255, 255, 255));
	btnNewButton.addMouseListener(new MouseAdapter() {
	
	public void mouseClicked(MouseEvent arg0) {
        
	}

	}
	);
	
	btnNewButton.setBackground(new Color(0, 128, 128));
	
	btnNewButton.addActionListener(new ActionListener() {
	public int g;
	public void actionPerformed(ActionEvent arg0) {
	
                Customer customer = new Customer();
        	customer.name = Name.getText();
        	customer.surname = Surname.getText();
        	customer.index = Index.getText();
        	customer.numerek=g;
        	
        	Assistant[] assistants = new Assistant[6]; 
        	assistants[0] = new Assistant("Beatka", "Z.", 1, "abcdefghijkl", "Dzienne");
        	assistants[1] = new Assistant("Jola", "K.", 2, "abcdefghijkl", "Popo³udniowe");
        	assistants[2] = new Assistant("Gra¿yna", "M.", 3, "abcdefghijkl", "Sobotnio-niedzielne");
        	    assistants[3] = new Assistant("Urszula", "W.", 4, "mnoprstuwz", "Popo³udniowe");
             	assistants[4] = new Assistant("Malwina", "D.", 5, "mnoprstuwz", "Sobotnio-niedzielne");
        	assistants[5] = new Assistant("Celina", "G.", 6, "mnoprstuwz", "Dzienne");
     
              
	        String name = Name.getText();

	            int l=name.length();
	       
	            String surname  = Surname.getText();
	            String index  = Index.getText();
	
	            if ((l>15)|| (l<3)) {
	            	JOptionPane.showMessageDialog(null, " Niepoprawny format imienia" );
	            	Name.setText("");
	        	Surname.setText("");
	        	Index.setText("");
	        	grupuj.clearSelection();
	            	
	            	}
	            
	            int m=surname.length();
	            if ((m>30)|| (m<3)) {
	            	JOptionPane.showMessageDialog(null, " Niepoprawny format nazwiska " );
	            	Name.setText("");
	        	Surname.setText("");
	        	Index.setText("");
	        	grupuj.clearSelection(); } 

	           int n=index.length();
	            if (n!=5) {
	            	JOptionPane.showMessageDialog(null, " Niepoprawny numer indeksu" );
	            	Name.setText("");
	        	Surname.setText("");
	        	Index.setText("");
	        	grupuj.clearSelection(); } 

                
                if(btn1.isSelected()){
	            	customer.tryb = "Dzienne";
	               }
                
                if(btn2.isSelected()){
	            	customer.tryb = "Popo³udniowe";
	               }
                
                if(btn3.isSelected()){
	            	customer.tryb = "Sobotnio-niedzielne";
	               }
                
               
                if((!btn1.isSelected())&&(!btn2.isSelected())&&(!btn3.isSelected())) { 
                	
                	JOptionPane.showMessageDialog(null, " Nie wybrano trybu studiów" );
                Name.setText("");
        	Surname.setText("");
        	Index.setText("");
        	grupuj.clearSelection();
        	}
                if ((btn1.isSelected())||(btn2.isSelected())||(btn3.isSelected())) {wybrano=1;}
                if((!btn1.isSelected())&&(!btn2.isSelected())&&(!btn3.isSelected())) {wybrano=0; }

               
	            if ((n==5)  &&  (m<30) && (m>2) && (l<15) && (l>2) && (wybrano==1)  )  
	            {
	            	g++;
	         
        	System.out.println(customer.numerek + "\t" + customer.name + "\t" + customer.surname + "\t" + customer.index + "\t" + customer.tryb  );
        	Name.setText("");
        	Surname.setText("");
        	Index.setText("");
        	grupuj.clearSelection();}
	            try {
	            	Writer output;
	         	    output = new BufferedWriter(new FileWriter("studentslist.txt", true));
	            output.append(System.lineSeparator()+customer.numerek + "\t" + customer.name + "\t" + customer.surname + "\t" + customer.index + "\t" + customer.tryb);
	            output.append("\n");
	      	output.close();
	       
	            } catch(IOException ie) {
	                ie.printStackTrace();
	            }   
	      	  
	           
	            

	            if ((surname.charAt(0)=='a')||(surname.charAt(0)=='b')||(surname.charAt(0)=='c')
	         	   ||(surname.charAt(0)=='d')||(surname.charAt(0)=='e')||(surname.charAt(0)=='f')
	         	   ||(surname.charAt(0)=='g')||(surname.charAt(0)=='h')||(surname.charAt(0)=='i')
	         	   ||(surname.charAt(0)=='j')||(surname.charAt(0)=='k')||(surname.charAt(0)=='l')) { 
	             	
	                  litery=1;
	               
	                 }
	            if ( (surname.charAt(0)=='m')||(surname.charAt(0)=='n')||(surname.charAt(0)=='o')||
  	            	(surname.charAt(0)=='p')||(surname.charAt(0)=='r')||(surname.charAt(0)=='s')
  	         	   ||(surname.charAt(0)=='t')||(surname.charAt(0)=='u')||(surname.charAt(0)=='w')
  	         	   ||(surname.charAt(0)=='z')) {
  	            	litery=2;
  	            } 

	            if ((n==5)  &&  (m<30) && (m>2) && (l<15) && (l>2) && (wybrano==1) && litery==1 && customer.tryb=="Dzienne" ) {
	            	nr++; 
	          	            }
	            if ((n==5)  &&  (m<30) && (m>2) && (l<15) && (l>2) && (wybrano==1) && litery==1 && customer.tryb=="Popo³udniowe" ) {
	            	nr1++; 
	            	
	            }
	            if ((n==5)  &&  (m<30) && (m>2) && (l<15) && (l>2) && (wybrano==1) && litery==1 && customer.tryb=="Sobotnio-niedzielne" ) {
	            	nr2++; 
	            
	            } if ((n==5)  &&  (m<30) && (m>2) && (l<15) && (l>2) && (wybrano==1) && litery==2 && customer.tryb=="Dzienne" ) {
	            	nr3++; 
	     
	            } if ((n==5)  &&  (m<30) && (m>2) && (l<15) && (l>2) && (wybrano==1) && litery==2 && customer.tryb=="Popo³udniowe" ) {
	            	nr4++; 
	       
	            } if ((n==5)  &&  (m<30) && (m>2) && (l<15) && (l>2) && (wybrano==1) && litery==2 && customer.tryb=="Sobotnio-niedzielne" ) {
	            	nr5++; 

	            }


	  	            if ((litery==1)&&(customer.tryb=="Dzienne"))
	  	            { JOptionPane.showMessageDialog(null, "Okienko numer: " + assistants[0].stanowisko + "\t"  + "\n" + "Asystenka: " + assistants[0].imie+ "\n" + "Twój numerek: " +"\t" 
	  	            + customer.numerek+"\n" + "Przed Tob¹ w kolejce: " + "\t" + (nr-1) );}
	  	            if ((litery==2)&&(customer.tryb=="Dzienne"))
	  	            {  JOptionPane.showMessageDialog(null, "Okienko numer: " +assistants[1].stanowisko + "\t"  + "\n" + "Asystenka: " + assistants[1].imie +"\n" + "Twój numerek: " +"\t" 
	  	            + customer.numerek+"\n"+"Przed Tob¹ w kolejce: " + "\t" +(nr3-1) );}
	  	           	if ((litery==1)&&(customer.tryb=="Popo³udniowe"))
	  	            { JOptionPane.showMessageDialog(null, "Okienko numer: "  +assistants[2].stanowisko+ "\t"  + "\n" + "Asystenka: " + assistants[2].imie +"\n" + "Twój numerek: " +"\t" 
	  	            + customer.numerek+"\n"+"Przed Tob¹ w kolejce: " + "\t" +(nr1-1) );}
	  	            if ((litery==2)&&(customer.tryb=="Popo³udniowe"))
	 {JOptionPane.showMessageDialog(null, "Okienko numer: "  +assistants[3].stanowisko+ "\t"  + "\n" + "Asystenka: " + assistants[3].imie +"\n" + "Twój numerek: " +"\t" 
	  	            + customer.numerek+"\n" +"Przed Tob¹ w kolejce: " + "\t" +(nr4-1));}
	  	            if ((litery==1)&&(customer.tryb=="Sobotnio-niedzielne"))
	 {JOptionPane.showMessageDialog(null, "Okienko numer: "  +assistants[4].stanowisko+ "\t"  + "\n" + "Asystenka: " +assistants[4].imie + "\n" + "Twój numerek: " +"\t" 
	  	            + customer.numerek+"\n"+"Przed Tob¹ w kolejce: " + "\t" +(nr2-1) );}
	  	            if ((litery==2)&&(customer.tryb=="Sobotnio-niedzielne"))
{JOptionPane.showMessageDialog(null, "Okienko numer: "  +assistants[5].stanowisko+ "\t"  + "\n" + "Asystenka: "+ assistants[5].imie + "\n" + "Twój numerek: " +"\t" 
	  	            + customer.numerek+"\n"+"Przed Tob¹ w kolejce: " + "\t" +(nr5-1) );}
	  	            
	  	            
	  	            
	   	     	}

	});
	btnNewButton.setFont(new Font("Century Gothic", Font.BOLD, 16));
	panel.add(btnNewButton);
	}
	

}