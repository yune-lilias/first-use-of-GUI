package hwfor;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

//import justplaying.usemouse;

public class homeworkfor extends  JPanel implements MouseListener {
	JFrame f = new JFrame("homeworkfor");
	JButton[] jb = new JButton[5];
	TextField tField = new TextField(30);
	public homeworkfor()
	{ 
		int step;
		for(step=0;step<=4;step++)
		{jb[step] = new JButton();}
		GridBagLayout gridbag = new GridBagLayout();
		f.setLayout(gridbag);
		GridBagConstraints c = new GridBagConstraints();
		c.fill = GridBagConstraints.BOTH;
		c.weightx = 1.0; 
		//gridbag.setConstraints(tField, c);
		
		JLabel l1 = new JLabel("Questions");
		c.gridx = 0;
		c.gridy = 0;
		gridbag.setConstraints(l1, c);	
		f.add(l1);    
		//c.weightx = 1.0;
		//c.gridwidth = GridBagConstraints.RELATIVE;
		c.gridx = 1;
		c.gridy = 0;
		jb[0]=createbutton("Half X-mas tree",gridbag,c);
		jb[0].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				button1();
				// TODO Auto-generated method stub
			}
		});
		jb[0].addMouseListener(this);
		f.add(jb[0]); 
		
		c.gridx = 2;
		c.gridy = 0;
		jb[1]=createbutton("X-mas tree",gridbag,c);
		jb[1].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				button2();
				// TODO Auto-generated method stub
			}
		});
		jb[1].addMouseListener(this);
		f.add(jb[1]); 

		c.gridx = 3;
		c.gridy = 0;
		jb[2]=createbutton("Guess num",gridbag,c);
		jb[2].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				button3();
				// TODO Auto-generated method stub
			}
		});
		jb[2].addMouseListener(this);
		f.add(jb[2]); 
		

		//c.gridwidth = GridBagConstraints.REMAINDER; //end row
		
		JLabel l2 = new JLabel("Challenge");
		c.gridx = 0;
		c.gridy = 1;
		c.gridwidth = 2;
		gridbag.setConstraints(l2, c);	
		f.add(l2);    
		
		//c.weightx = GridBagConstraints.REMAINDER;;
		c.gridx = 2;
		c.gridy = 1;
		c.gridwidth = 1;
		jb[3]=createbutton("XMarksDaSpot",gridbag,c);
		jb[3].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				button4();
				// TODO Auto-generated method stub
			}
		});
		jb[3].addMouseListener(this);
		f.add(jb[3]);
		
		c.gridx = 3;
		c.gridy = 1;
		jb[4] =createbutton("Diamond",gridbag,c);
		jb[4].addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				button5();
				// TODO Auto-generated method stub
			}
		});
		jb[4].addMouseListener(this);
		f.add(jb[4]); 
		
		c.gridx = 0;
		c.gridy = 2;
		c.gridwidth = 4;
		gridbag.setConstraints(tField, c);	 
		f.add(tField); 
		
		f.addWindowListener(new WindowAdapter() {           //without this, u cannot close the frame
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
			
		});
		f.addMouseListener(this);
		f.setSize(440, 120);
		f.setLocation(400, 250);
		f.setVisible(true);
	}
	
	 static public JButton createbutton(String name,GridBagLayout gridbag,GridBagConstraints c)
	{
		JButton button = new JButton(name);
         gridbag.setConstraints(button, c);	
         return button;
         }
	
	public static void button1()
	{
	Half_XmasTre b1 = new Half_XmasTre();
	String arg[] = null;
	Half_XmasTre.main(arg);
	}
	
	public static void button2()
	{
		Full_XmasTre b2 = new Full_XmasTre();
		String arg[] = null;
		Full_XmasTre.main(arg);
	}
	
	public static void button3()
	{
		Guess_A_Number b3 = new Guess_A_Number();
		String arg[] = null;
		Guess_A_Number.main(arg);
	}
	
	public static void button4()
	{
		XMarksDaSpot b4 = new XMarksDaSpot();
		String arg[] = null;
		XMarksDaSpot.main(arg);
	}
	
	public static void button5()
	{
		Diamond_R_4_Ever b5 = new Diamond_R_4_Ever();
		String arg[] = null;
		Diamond_R_4_Ever.main(arg);
	}
	
	public static void main(String arg[])
	{
	    playm();            //music is about 35m,just ignore this method
		new homeworkfor();
		
	}

	@Override
	public void mouseClicked(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		if(arg0.getSource() == jb[0])
		tField.setText("Print out a half X-mas tree");
		else if (arg0.getSource() == jb[1])
		tField.setText("Print out a X-mas tree");	
		else if (arg0.getSource() == jb[2])
		tField.setText("Guess a Magic-Number");	
		else if (arg0.getSource() == jb[3])
		tField.setText("Print out a X-marks");
		else if (arg0.getSource() == jb[4])
		tField.setText("Print out a Diamond");
		else
		tField.setText("Welcome");
	}

	@Override
	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	@SuppressWarnings("deprecation")
	static void playm() {
		File ff = null;
		Boolean break1 = false;
	  try {
		  URL url1;
		  try {
		  String packageName = homeworkfor.class.getPackage().getName();
		  ff = new File("src/"+packageName+"/leshphon.wav");
		  }catch(NullPointerException ee)
		  {ee.printStackTrace();
		  break1 = true;
		  }
          if(break1)	  
		  ff = new File("src/leshphon.wav");
		 // String f1 = homeworkfor.class.getResource("leshphon.wav").getPath(); 
		 // System.out.println(f1);
		url1 = ff.toURL();
		AudioClip aau;
		aau = Applet.newAudioClip(url1);
		aau.play();	
		aau.loop();
	} catch (MalformedURLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  //leshphon.wav
	}

}
