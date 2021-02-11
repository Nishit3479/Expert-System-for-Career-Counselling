package ai.lab.assignment;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ESFCC implements ActionListener
{
	public static void main(String []args)
	{
		new ESFCC();
	}
	
	static JFrame frame1;
	static JPanel jp1;
	static JLabel l1, l2, l3, l4, l5, l6;
	static JComboBox A, B, C, D, E, F;
	static JButton b1, b2;
	static JTextArea tf1;
	ESFCC()
	{
		frame1 = new JFrame("Expert System for Career Counselling");
		frame1.setBounds(600,150,750,800);
		frame1.setLayout(null);
		frame1.setDefaultCloseOperation(frame1.EXIT_ON_CLOSE);
	
		jp1 = new JPanel();
		jp1.setBounds(0,0,750,800);
		jp1.setBackground(Color.DARK_GRAY);
		jp1.setLayout(null);
		frame1.add(jp1);
		
		l1 = new JLabel("Expert System");
		l1.setBounds(230,10,480,100);
		l1.setFont(new Font("Arial", Font.PLAIN, 40));
		l1.setForeground(Color.white);
		jp1.add(l1);
		
		l2 = new JLabel("For Career Counselling");
		l2.setBounds(200,70,480,100);
		l2.setFont(new Font("Arial", Font.PLAIN, 30));
		l2.setForeground(Color.white);
		jp1.add(l2);
		
		l3 = new JLabel("Enter your Intermediate Stream   :");
		l3.setBounds(40,190,350,40);
		l3.setFont(new Font("Arial", Font.PLAIN, 20));
		l3.setForeground(Color.white);
		jp1.add(l3);
		
		String s1[] = {"PCM", "PCB", "Arts", "Commerce"}; 
		
		A = new JComboBox(s1);
		A.setBackground(Color.DARK_GRAY);
		A.setForeground(Color.white);
		A.setBounds(370,197,150,25);
		jp1.add(A);
		
		A.addActionListener(new java.awt.event.ActionListener() {
	        public void actionPerformed(java.awt.event.ActionEvent evt) {
	        	if(A.getSelectedItem()=="PCM")
	    		{
	    			C.setVisible(true);
	    			D.setVisible(false);
	    			E.setVisible(false);
	    			F.setVisible(false);
	    		}
	    		else if(A.getSelectedItem()=="PCB")
	    		{
	    			D.setVisible(true);
	    			C.setVisible(false);
	    			E.setVisible(false);
	    			F.setVisible(false);
	    		}
	    		else if(A.getSelectedItem()=="Arts")
	    		{
	    			E.setVisible(true);
	    			C.setVisible(false);
	    			D.setVisible(false);
	    			F.setVisible(false);
	    		}
	    		else
	    		{
	    			F.setVisible(true);
	    			C.setVisible(false);
	    			D.setVisible(false);
	    			E.setVisible(false);
	    		}
	        }
	    });

		l4 = new JLabel("Your Marks in Intermediate          :");
		l4.setBounds(40,280,350,40);
		l4.setFont(new Font("Arial", Font.PLAIN, 20));
		l4.setForeground(Color.white);
		jp1.add(l4);
		
		String s2[] = {"90% +", "80% - 89%", "70% - 79%", "60% - 69%", "Less than 60%"};
		
		B = new JComboBox(s2);
		B.setBackground(Color.DARK_GRAY);
		B.setForeground(Color.white);
		B.setBounds(370,287,150,25);
		jp1.add(B);
		
		l5 = new JLabel("You are Interested in                  :");
		l5.setBounds(40,370,350,40);
		l5.setFont(new Font("Arial", Font.PLAIN, 20));
		l5.setForeground(Color.white);
		jp1.add(l5);
		
		String s3[] = {"Coding", "Electrical Work", "Chipsets", "Mechanical Work", "Data Science", "Hacking", "Business"};
		
		C = new JComboBox(s3);
		C.setBackground(Color.DARK_GRAY);
		C.setForeground(Color.white);
		C.setBounds(370,377,150,25);
		C.setVisible(true);
		jp1.add(C);
		
		String s4[] = {"Neuro", "Cardio", "Gastro", "Ortho", "Others"};
		
		D = new JComboBox(s4);
		D.setBackground(Color.DARK_GRAY);
		D.setForeground(Color.white);
		D.setBounds(370,377,150,25);
		D.setVisible(false);
		jp1.add(D);
		
		String s5[] = {"Psychology", "Painting", "Writing/Poetry", "Business", "Others"};
		
		E = new JComboBox(s5);
		E.setBackground(Color.DARK_GRAY);
		E.setForeground(Color.white);
		E.setBounds(370,377,150,25);
		E.setVisible(false);
		jp1.add(E);
		
		String s6[] = {"CA", "Economics", "Business", "Others"};
		
		F = new JComboBox(s6);
		F.setBackground(Color.DARK_GRAY);
		F.setForeground(Color.white);
		F.setBounds(370,377,150,25);
		F.setVisible(false);
		jp1.add(F);
	    
	    b1 = new JButton("Submit");
	    b1.setBounds(430,500,90,30);
		b1.setFont(new Font("Arial", Font.BOLD, 15));
		b1.setBackground(Color.WHITE);
		b1.setForeground(Color.black);
		b1.addActionListener(this);
		jp1.add(b1);
		
		b2 = new JButton("Reset");
	    b2.setBounds(185,500,90,30);
		b2.setFont(new Font("Arial", Font.BOLD, 15));
		b2.setBackground(Color.WHITE);
		b2.setForeground(Color.black);
		b2.addActionListener(this);
		jp1.add(b2);
		
		tf1 = new JTextArea();
		tf1.setBounds(10,625,700,100);
		tf1.setFont(new Font("Arial", Font.PLAIN, 20));
		tf1.setBackground(Color.DARK_GRAY);
		tf1.setForeground(Color.white);
		jp1.add(tf1);
		tf1.setVisible(false);
		
		l6 = new JLabel("©Java-Eclipse");
		l6.setBounds(600,730,120,25);
		l6.setFont(new Font("Arial", Font.BOLD, 15));
		l6.setForeground(Color.white);
		jp1.add(l6);
		
		frame1.setVisible(true);
	}

	public void actionPerformed(ActionEvent e) 
	{
		if(e.getActionCommand()=="Submit")
		{
			tf1.setVisible(true);
			if(A.getSelectedIndex()==0)
			{
				if(C.getSelectedItem()=="Coding")
				{
					if(B.getSelectedIndex()==4)
					{
						tf1.setText("Your Marks are less but as Computer Science Engineering (CSE)\nis a general course, you can opt for that.");
					}
					else
					{
						tf1.setText("Computer Science Engineering (CSE) will be the optimal choice for you.");
					}
				}
				else if(C.getSelectedItem()=="Electrical Work")
				{
					if(B.getSelectedIndex()==4)
					{
						tf1.setText("Your Marks are less but as Electrical Engineering (EE)\nis a general course, you can opt for that.");
					}
					else
					{
						tf1.setText("Electrical Engineering (EE) will be the optimal choice for you.");
					}
				}
				else if(C.getSelectedItem()=="Chipsets")
				{
					if(B.getSelectedIndex()==4)
					{
						tf1.setText("Your Marks are less and Electronic and Communication Engineering (ECE)\nis a tough course, so it is advised to opt for \nComputer Science Engineering (CSE).");
					}
					else
					{
						tf1.setText("Electronic and Communication Engineering (ECE) \nwill be the optimal choice for you.");
					}
				}
				else if(C.getSelectedItem()=="Mechanical Work")
				{
					if(B.getSelectedIndex()==4)
					{
						tf1.setText("Your Marks are less but as Mechanical Engineering (ME)\nis a general course, you can opt for that.");
					}
					else
					{
						tf1.setText("Mechanical Engineering (ME) will be the optimal choice for you.");
					}
				}
				else if(C.getSelectedItem()=="Data Science")
				{
					if(B.getSelectedIndex()==4 || B.getSelectedIndex()==3)
					{
						tf1.setText("Your Marks are less but as Data Science is new for everyone\nYou can start from scratch. So, you can opt for\nComputer Science Engineering with spec. in Data Analytics (CSE-DA).");
					}
					else
					{
						tf1.setText("Computer Science Engineering with spec. in Data Analytics (CSE-DA)\nwill be the optimal choice for you.");
					}
				}
				else if(C.getSelectedItem()=="Hacking")
				{
					if(B.getSelectedIndex()==4 || B.getSelectedIndex()==3)
					{
						tf1.setText("Your Marks are less and Computer Science Engineering with spec.\nin Networking and Security is a tough course. So, you can opt for\nComputer Science Engineering (CSE).");
					}
					else
					{
						tf1.setText("Computer Science Engineering with spec. in Networking and Security (CSE-NS)\nwill be the optimal choice for you.");
					}
				}
				else if(C.getSelectedItem()=="Business")
				{
					tf1.setText("You can opt for the only available bachelor's course for business i.e.,\nBachelor of Business Administration (BBA).");
				}
			}
			else if(A.getSelectedIndex()==1)
			{
				if(D.getSelectedItem()=="Neuro")
				{
					if(B.getSelectedIndex()==4 || B.getSelectedIndex()==3 || B.getSelectedIndex()==2)
					{
						tf1.setText("Your Marks are less, So it is advised to opt for a basic spec. in \nBachelor of Medicine, Bachelor of Surgery (MBBS).");
					}
					else
					{
						tf1.setText("Bachelor of Medicine, Bachelor of Surgery (MBBS)\nwith spec. in Neurology will be the optimal choice for you.");
					}
				}
				else if(D.getSelectedItem()=="Cardio")
				{
					if(B.getSelectedIndex()==4 || B.getSelectedIndex()==3)
					{
						tf1.setText("Your Marks are less, So it is advised to opt for a basic spec. in \nBachelor of Medicine, Bachelor of Surgery (MBBS).");
					}
					else
					{
						tf1.setText("Bachelor of Medicine, Bachelor of Surgery (MBBS)\nwith spec. in Cardiology will be the optimal choice for you.");
					}
				}
				else if(D.getSelectedItem()=="Gastro")
				{
					if(B.getSelectedIndex()==4)
					{
						tf1.setText("Your Marks are less but Bachelor of Medicine, Bachelor of Surgery (MBBS)\nwith spec. in Gastrology is a basic course. So, you can opt for that.");
					}
					else
					{
						tf1.setText("Bachelor of Medicine, Bachelor of Surgery (MBBS)\nwith spec. in Gastrology will be the optimal choice for you.");
					}
				}
				else if(D.getSelectedItem()=="Ortho")
				{
					if(B.getSelectedIndex()==4)
					{
						tf1.setText("Your Marks are less but Bachelor of Medicine, Bachelor of Surgery (MBBS)\nwith spec. in Orthology is a basic course. So, you can opt for that.");
					}
					else
					{
						tf1.setText("Bachelor of Medicine, Bachelor of Surgery (MBBS)\nwith spec. in Orthology will be the optimal choice for you.");
					}
				}
				else
				{
					tf1.setText("You can opt for Medicine, Bachelor of Surgery (MBBS)\nwithout a specialization and can later opt for a specialization\ndepending on you grades and interest.");
				}
			}
			else if(A.getSelectedIndex()==2)
			{
				if(E.getSelectedItem()=="Psychology")
				{
					if(B.getSelectedIndex()==4 || B.getSelectedIndex()==3)
					{
						tf1.setText("Your Marks are less, So it is advised to opt for a basic Arts course like \nPainting, Writing and Poetry or\nBachelor of Business Administration (BBA).");
					}
					else
					{
						tf1.setText("Psychology will be the optimal choice for you.");
					}
				}
				else if(E.getSelectedItem()=="Painting")
				{
					tf1.setText("You can easily apply for an Arts course on Painting.");
				}
				else if(E.getSelectedItem()=="Writing/Poetry")
				{
					tf1.setText("You can easily apply for an Arts course on Writing/Poetry.");
				}
				else if(E.getSelectedItem()=="Business")
				{
					tf1.setText("You can opt for the only available bachelor's course for business i.e.,\nBachelor of Business Administration (BBA).");
				}
				else
				{
					tf1.setText("You can opt from the various number of Arts courses and as most of them\nare easy, there will not be an obstruction because of your Grades.");
				}
			}
			else
			{
				if(F.getSelectedItem()=="CA")
				{
					if(B.getSelectedIndex()==4 || B.getSelectedIndex()==3)
					{
						tf1.setText("Your Marks are less and Chartered Accountancy (CA) is a tough course.\nSo, it is advised to opt for a basic course like\nBachelor of Business Administration (BBA).");
					}
					else
					{
						tf1.setText("Chartered Accountancy (CA) will be the optimal choice for you.");
					}
				}
				else if(F.getSelectedItem()=="Economics")
				{
					if(B.getSelectedIndex()==4)
					{
						tf1.setText("Your Marks are less and Economics is a tough course.\nSo, it is advised to opt for a basic course like\nBachelor of Business Administration (BBA).");
					}
					else
					{
						tf1.setText("Economics will be the optimal choice for you.");
					}
				}
				else if(F.getSelectedItem()=="Business")
				{
					tf1.setText("You can opt for the only available bachelor's course for business i.e.,\nBachelor of Business Administration (BBA).");
				}
				else
				{
					tf1.setText("You can opt from the various number of Commerce courses and as most of them\nare easy, there will not be an obstruction because of your Grades.");
				}
			}
		}
		if(e.getActionCommand()=="Reset")
		{
			tf1.setVisible(false);
			A.setSelectedIndex(0);
			B.setSelectedIndex(0);
			C.setSelectedIndex(0);
			D.setSelectedIndex(0);
			E.setSelectedIndex(0);
			F.setSelectedIndex(0);
		}
	}
}

