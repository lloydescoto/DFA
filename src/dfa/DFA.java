package dfa;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.*;
import java.lang.Math;
import java.lang.NumberFormatException;

public class DFA
{
	/*
        Main Method
         */
	public static void main(String[] args) throws NumberFormatException
	{
		new MyFrame();
	}
}
/*
This the class that provide the GUI and the algorithm of DFA
*/
class MyFrame extends JFrame 
{
	public ArrayList<String> states = new ArrayList<>();
	public ArrayList<String> finalStates = new ArrayList<>();
	public JPanel p;
        public int num = 0, num2 = 4;
	public JLabel[] label;
	public JLabel[] finalLabel;
	public JLabel[][] destinationLabel;
	public JButton b,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16;
	public JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21,l22;
	public JTextField t1,t2,t3,t4,t5,t6,t7,t8;
	public String[][] destination;
	public int ypos = 140;
	public int finalypos = 140;
	public int x = 0;
	public int y = 0;
	public int despos = 140;
	public MyFrame()
	{
	p = new JPanel();
	label = new JLabel[100]; 
	finalLabel = new JLabel[100];
	destinationLabel = new JLabel[100][2];
	destination = new String[100][2];
	b = new JButton("Add");
	b3 = new JButton("Update");
	b4 = new JButton("Connect");
	b5 = new JButton("Update");
	b6 = new JButton("Add");
	b7 = new JButton("Update");
	b8 = new JButton("Result");
	b9 = new JButton("Clear");
	b10 = new JButton("Clear");
	b11 = new JButton("Clear");
	b12 = new JButton("Clear");
	b13 = new JButton("Clr States");
	b14 = new JButton("Clr Destination");
	b15 = new JButton("Clr Final States");
	b16 = new JButton("Reset");
	l1 = new JLabel("States");
	l2 = new JLabel("Deterministic Finite Automata");
	l3 = new JLabel("States Destinations");
	l4 = new JLabel("State:");
	l5 = new JLabel("Destination:");
	l6 = new JLabel("0 Or 1:");
	l7 = new JLabel("Final States");
	l8 = new JLabel("State Table");
	l9 = new JLabel("States");
	l10 = new JLabel("0");
	l11 = new JLabel("1");
	l12 = new JLabel("Manage DFA");
	l13 = new JLabel("Name:");
	l14 = new JLabel("New:");
	l15 = new JLabel("FS Name:");
	l16 = new JLabel("New FS Name:");
	l17 = new JLabel("Final States");
	l18 = new JLabel("States");
	l19 = new JLabel("String(Set of 0 or 1 only)");
	l20 = new JLabel("Input:");
	l21 = new JLabel("Result");
	l22 = new JLabel("No Result");
	t1 = new JTextField(20);
	t2 = new JTextField(20);
	t3 = new JTextField(20);
	t4 = new JTextField(20);
	t5 = new JTextField(20);
	t6 = new JTextField(20);
	t7 = new JTextField(20);
	t8 = new JTextField(20);
	int PANEL_WIDTH = 1600; 
	int PANEL_HEIGHT = 900;
	setTitle("Deterministic Finite Automata");
	setExtendedState(JFrame.MAXIMIZED_BOTH);
	p.setLayout(null);
	p.setPreferredSize( new Dimension(PANEL_WIDTH,PANEL_HEIGHT) );
	p.setBackground(Color.BLACK);
	l1.setBounds(930,90,250,50);
	l1.setForeground(new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255)));
	l1.setFont(new Font("Serif", Font.PLAIN, 30));
	l13.setBounds(950,120,250,50);
	l13.setForeground(Color.white);
	l13.setFont(new Font("Serif", Font.PLAIN, 20));
	l14.setBounds(950,150,250,50);
	l14.setForeground(Color.white);
	l14.setFont(new Font("Serif", Font.PLAIN, 20));
	l2.setBounds(510,0,400,50);
	l2.setForeground(new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255)));	
	l2.setFont(new Font("Serif", Font.PLAIN, 30));
	t1.setBounds(1008,138,100,20);
	t1.setFont(new Font("Serif", Font.PLAIN, 20));
	b.setBounds(1120,138,100,20);
	b.setBackground(Color.blue);
	b.setForeground(Color.white);
	l3.setBounds(930,180,250,50);
	l3.setForeground(new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255)));
	l3.setFont(new Font("Serif", Font.PLAIN, 30));
	t2.setBounds(1085,413,100,20);
	t2.setFont(new Font("Serif", Font.PLAIN, 20));
	l4.setBounds(950,210,250,50);
	l4.setForeground(Color.white);
	l4.setFont(new Font("Serif", Font.PLAIN, 20));
	l5.setBounds(950,240,250,50);
	l5.setForeground(Color.white);
	l5.setFont(new Font("Serif", Font.PLAIN, 20));
	l6.setBounds(950,270,250,50);
	l6.setForeground(Color.white);
	l6.setFont(new Font("Serif", Font.PLAIN, 20));
	b3.setBounds(1120,168,100,20);
	b3.setBackground(Color.blue);
	b3.setForeground(Color.white);
	t3.setBounds(1008,168,100,20);
	t3.setFont(new Font("Serif", Font.PLAIN, 20));
	l7.setBounds(930,335,250,50);
	l7.setForeground(new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255)));
	l7.setFont(new Font("Serif", Font.PLAIN, 30));
	b4.setBounds(950,315,100,20);
	b4.setBackground(Color.blue);
	b4.setForeground(Color.white);
	t4.setBounds(1058,288,100,20);
	t4.setFont(new Font("Serif", Font.PLAIN, 20));
	t5.setBounds(1058,258,100,20);
	t5.setFont(new Font("Serif", Font.PLAIN, 20));
	l8.setBounds(120,50,250,50);
	l8.setForeground(new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255)));
	l8.setFont(new Font("Serif", Font.PLAIN, 30));
	l9.setBounds(40,90,250,50);
	l9.setForeground(new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255)));
	l9.setFont(new Font("Serif", Font.PLAIN, 30));
	l10.setBounds(180,90,250,50);
	l10.setForeground(new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255)));
	l10.setFont(new Font("Serif", Font.PLAIN, 30));
	l11.setBounds(280,90,250,50);
	l11.setForeground(new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255)));
	l11.setFont(new Font("Serif", Font.PLAIN, 30));
	l12.setBounds(1050,50,250,50);
	l12.setForeground(new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255)));
	l12.setFont(new Font("Serif", Font.PLAIN, 30));
	t6.setBounds(1058,228,100,20);
	t6.setFont(new Font("Serif", Font.PLAIN, 20));
	b5.setBounds(1058,315,100,20);
	b5.setBackground(Color.blue);
	b5.setForeground(Color.white);
	l15.setBounds(950,365,250,50);
	l15.setForeground(Color.white);
	l15.setFont(new Font("Serif", Font.PLAIN, 20));
	l16.setBounds(950,395,250,50);
	l16.setForeground(Color.white);
	l16.setFont(new Font("Serif", Font.PLAIN, 20));
	t7.setBounds(1085,385,100,20);
	t7.setFont(new Font("Serif", Font.PLAIN, 20));
	b6.setBounds(1195,385,100,20);
	b6.setBackground(Color.blue);
	b6.setForeground(Color.white);
	b7.setBounds(1195,413,100,20);
	b7.setBackground(Color.blue);
	b7.setForeground(Color.white);
	l17.setBounds(400,50,250,50);
	l17.setForeground(new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255)));
	l17.setFont(new Font("Serif", Font.PLAIN, 30));
	l18.setBounds(435,90,250,50);
	l18.setForeground(new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255)));
	l18.setFont(new Font("Serif", Font.PLAIN, 30));
	l19.setBounds(930,460,400,50);
	l19.setForeground(new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255)));
	l19.setFont(new Font("Serif", Font.PLAIN, 30));
	l20.setBounds(950,490,250,50);
	l20.setForeground(Color.white);
	l20.setFont(new Font("Serif", Font.PLAIN, 20));
	t8.setBounds(1008,507,100,20);
	t8.setFont(new Font("Serif", Font.PLAIN, 20));
	b8.setBounds(950,535,100,20);
	b8.setBackground(Color.blue);
	b8.setForeground(Color.white);
	b9.setBounds(1058,535,100,20);
	b9.setBackground(Color.blue);
	b9.setForeground(Color.white);
	l21.setBounds(930,565,400,50);
	l21.setForeground(new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255)));
	l21.setFont(new Font("Serif", Font.PLAIN, 30));
	l22.setBounds(1050,595,400,50);
	l22.setForeground(new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255)));
	l22.setFont(new Font("Serif", Font.PLAIN, 40));
	b10.setBounds(950,440,100,20);
	b10.setBackground(Color.blue);
	b10.setForeground(Color.white);
	b11.setBounds(1166,315,100,20);
	b11.setBackground(Color.blue);
	b11.setForeground(Color.white);
	b12.setBounds(1228,153,100,20);
	b12.setBackground(Color.blue);
	b12.setForeground(Color.white);
	b15.setBounds(1078,670,130,20);
	b15.setBackground(Color.blue);
	b15.setForeground(Color.white);
	b16.setBounds(1228,670,130,20);
	b16.setBackground(Color.blue);
	b16.setForeground(Color.white);
	b14.setBounds(928,670,130,20);
	b14.setBackground(Color.blue);
	b14.setForeground(Color.white);
	b13.setBounds(778,670,130,20);
	b13.setBackground(Color.blue);
	b13.setForeground(Color.white);
	p.add(t1);
	p.add(t2);
	p.add(t3);
	p.add(t4);
	p.add(t5);
	p.add(t6);
	p.add(t7);
	p.add(t8);
	p.add(l1);
	p.add(l2);
	p.add(l3);
	p.add(l4);
	p.add(l5);
	p.add(l6);
	p.add(l7);
	p.add(l8);
	p.add(l9);
	p.add(l10);
	p.add(l11);
	p.add(l12);
	p.add(l13);
	p.add(l14);
	p.add(l15);
	p.add(l16);
	p.add(l17);
	p.add(l18);
	p.add(l19);
	p.add(l20);
	p.add(l21);
	p.add(l22);
	p.add(b16);
        //b16 Reset the Values of the State Values
	b16.addActionListener(new ActionListener() {
		@Override
        public void actionPerformed(ActionEvent e) {
			ypos = 140;
            finalypos = 140;
            despos = 140;
            y = 0;
            x = 0;
            Arrays.fill(finalLabel, null);
            Arrays.fill(label, null);
            finalStates.clear();
            states.clear();
            for(int b = 0;b < destinationLabel.length;b++)
            {
	            for(int c = 0;c < destinationLabel[b].length;c++)
	            {
		           	destinationLabel[b][c] = null;
	            }
            }
	        for(int d = 0;d < destination.length;d++)
            {
	            for(int f = 0;f < destination[d].length;f++)
	            {
		           	destination[d][f] = null;
	            }
            }
            l22.setText("No Result");
        }
    });
        //b15 Clear the Jlabel of the Final States
	p.add(b15);
	b15.addActionListener(new ActionListener() {
		@Override
        public void actionPerformed(ActionEvent e) {
			for(int a = 0;a < finalLabel.length;a++)
	            {
		            p.remove(finalLabel[a]);
		            p.revalidate();
		            p.repaint(); 
	            } 
        }
    });
	p.add(b14);
        //b14 Clear the Jlabel of the Destinations of the states
	b14.addActionListener(new ActionListener() {
		@Override
        public void actionPerformed(ActionEvent e) {
			for(int b = 0;b < destinationLabel.length;b++)
	            {
		            for(int c = 0;c < destinationLabel[b].length;c++)
		            {
			           	p.remove(destinationLabel[b][c]);
			           	p.revalidate();
		        		p.repaint();
		            }
	            }
        }
    });
        //b13 Clear the Jlabel of the States
	p.add(b13);
	b13.addActionListener(new ActionListener() {
			@Override
            public void actionPerformed(ActionEvent e) {
	        	
	            for(int a = 0;a < label.length;a++)
	            {
		            p.remove(label[a]);
		            p.revalidate();
		            p.repaint(); 
	            }        
            }
        });
        //b12 Clear the text in the States
	p.add(b12);
	b12.addActionListener(new ActionListener() {
			@Override
            public void actionPerformed(ActionEvent e) {
				t1.setText("");
				t3.setText("");
				p.revalidate();
				p.repaint();
            }
        });
        //b11 Clear the text in the States Destination
	p.add(b11);
	b11.addActionListener(new ActionListener() {
			@Override
            public void actionPerformed(ActionEvent e) {
				t4.setText("");
				t5.setText("");
				t6.setText("");
				p.revalidate();
				p.repaint();
            }
        });
        //b10 Clear the text in the Final States
	p.add(b10);
	b10.addActionListener(new ActionListener() {
			@Override
            public void actionPerformed(ActionEvent e) {
				t2.setText("");
				t7.setText("");
				p.revalidate();
				p.repaint();
            }
        });
        //b12 Clear the text in the Strings
	p.add(b9);
	b9.addActionListener(new ActionListener() {
			@Override
            public void actionPerformed(ActionEvent e) {
				t8.setText("");
				p.revalidate();
				p.repaint();
            }
        });
        /*
        b8 is the algo that get the last state of the inputted string
        and check if it is accepted or rejected
        */
	p.add(b8);
	b8.addActionListener(new ActionListener() {
		boolean accept = true;
			@Override
            public void actionPerformed(ActionEvent e) {
	        try
	        {
				String inputtedString = t8.getText();
				String startingPos = states.get(0);
				String statePos = states.get(0);
				int Pos = states.indexOf(startingPos);
				for(int x = 0;x < inputtedString.length();x++)
                {
                    int stringAt = Integer.parseInt(Character.toString(inputtedString.charAt(x)));
                    if(stringAt == 1 || stringAt == 0)
                    {
                        accept = true;
                    }
                    else
                    {
                        accept = false;
                        break;
                    }
                }
                if(accept == false)
                {
	                t8.setText("Invalid");
                }
				else if(inputtedString.equals("") && finalStates.contains(states.get(0)))
				{
					l22.setText("Accepted");
				}
				else
				{
					for(int c = 0;c < inputtedString.length();c++)
					{
                                            int currPos = Integer.parseInt(Character.toString(inputtedString.charAt(c)));
                                            statePos = destination[Pos][currPos];
                                            Pos = states.indexOf(statePos);
					}
					String finalState = statePos;
					if(finalStates.contains(finalState))
					{
						l22.setText("Accepted");
					}
					else
					{
						l22.setText("Rejected");
					}
				}
				p.revalidate();
				p.repaint();
            }
            catch(NumberFormatException ex)
            {
	            if(t8.getText().equals("") && finalStates.contains(states.get(0)))
	            {
		            t8.setText("Accepted");
	            }
	            else
	            {
	            t8.setText("Invalid");
            	}
            }
        }
        });
        //b7 Update the final states if there's some wrong input
	p.add(b7);
	b7.addActionListener(new ActionListener() {
			@Override
            public void actionPerformed(ActionEvent e) {
				String oldFinalState = t7.getText();
				String newFinalState = t2.getText();
				t7.setText("");
				t2.setText("");
				if(!finalStates.contains(oldFinalState))
				{
					t7.setText("Not Exists");
				}
				else if(finalStates.contains(newFinalState))
				{
					t7.setText("Existing");
				}
				else if(newFinalState.equals(""))
				{
					t7.setText("");
					t2.setText("No Input");
				}
				else if(oldFinalState.equals(""))
				{
					t7.setText("No Input");
					t2.setText("");
				}
				else
				{
					int indexState = finalStates.indexOf(oldFinalState);
					finalStates.set(indexState,newFinalState);
					finalLabel[indexState].setText(finalStates.get(indexState));
					p.revalidate();
					p.repaint();
				}
            }
        });
        //b6 Add Final states in the table
	p.add(b6);
	b6.addActionListener(new ActionListener() {
			@Override
            public void actionPerformed(ActionEvent e) {
				String inputtedFinalState = t7.getText();
				t7.setText("");
				if(finalStates.contains(inputtedFinalState))
				{
					t7.setText("Existing");
				}
				else if(inputtedFinalState.equals(""))
				{
					t7.setText("No Input");
				}
				else
				{
					finalStates.add(inputtedFinalState);
					finalLabel[y] = new JLabel(finalStates.get(y));
					finalLabel[y].setBounds(460,finalypos,50,50);
					finalLabel[y].setForeground(new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255)));
					finalLabel[y].setFont(new Font("Serif", Font.PLAIN, 30));
					p.add(finalLabel[y]);
					p.revalidate();
					p.repaint();
					y++;
					finalypos = finalypos + 50;
				}
            }
        });
        //b5 Update the states destionaton if there's some wrong input
	p.add(b5);
	b5.addActionListener(new ActionListener() {
			@Override
            public void actionPerformed(ActionEvent e) {
	        try
	        {
				String initialState = t6.getText();
				String destinationState = t5.getText();
				int oneNzero = Integer.parseInt(t4.getText());
				t6.setText("");
				t5.setText("");
				t4.setText("");
				if(!states.contains(initialState))
				{
					t6.setText("Not Exists");
					t5.setText("");
					t4.setText("");
				}
				else if(destinationState.equals(""))
				{
					t6.setText("");
					t5.setText("No Input");
					t4.setText("");
				}
				else if(initialState.equals(""))
				{
					t6.setText("No Input");
					t5.setText("");
					t4.setText("");
				}
				else if(oneNzero != 1 && oneNzero != 0)
				{
					t6.setText("");
					t5.setText("");
					t4.setText("Invalid");
				}
				else
				{
					int indexInitialState = states.indexOf(initialState);
					destination[indexInitialState][oneNzero] = destinationState;
					destinationLabel[indexInitialState][oneNzero].setText(destination[indexInitialState][oneNzero]);
					p.revalidate();
					p.repaint();
				}
            }
            catch(NumberFormatException ex)
            {
	            t6.setText("");
				t5.setText("");
				t4.setText("Invalid");
            }
        }
        });
        //b4 Add the 0 and 1 destination of the states
	p.add(b4);
	b4.addActionListener(new ActionListener() {
		int nxtPos = 50;
			@Override
            public void actionPerformed(ActionEvent e) {
	        try
	        {
				String initialState = t6.getText();
				String destinationState = t5.getText();
				int oneNzero = Integer.parseInt(t4.getText());
				t6.setText("");
				t5.setText("");
				t4.setText("");
				if(destinationState.equals(""))
				{
					t6.setText("");
					t5.setText("No Input");
					t4.setText("");
				}
				else if(initialState.equals(""))
				{
					t6.setText("No Input");
					t5.setText("");
					t4.setText("");
				}
				else if(!states.contains(initialState))
				{
					t6.setText("Not Exists");
					t5.setText("");
					t4.setText("");
				}
				else if(oneNzero != 1 && oneNzero != 0)
				{
					t6.setText("");
					t5.setText("");
					t4.setText("Invalid");
				}
				else
				{
					int indexInitialState = states.indexOf(initialState);
					destination[indexInitialState][oneNzero] = destinationState;
					destinationLabel[indexInitialState][oneNzero] = new JLabel(destination[indexInitialState][oneNzero]);
					if(oneNzero == 0)
					{
						destinationLabel[indexInitialState][oneNzero].setBounds(175,despos+(nxtPos*(indexInitialState)),50,50);
					}
					if(oneNzero == 1)
					{
						destinationLabel[indexInitialState][oneNzero].setBounds(275,despos+(nxtPos*(indexInitialState)),50,50);
					}
					destinationLabel[indexInitialState][oneNzero].setForeground(new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255)));
					destinationLabel[indexInitialState][oneNzero].setFont(new Font("Serif", Font.PLAIN, 30));
					p.add(destinationLabel[indexInitialState][oneNzero]);
					p.revalidate();
					p.repaint();
				}
			}
			catch(NumberFormatException ex)
			{
				t6.setText("");
				t5.setText("");
				t4.setText("Invalid");
			}
            }
        });
        //b3 Update the States if there's some wrong input
	p.add(b3);
	b3.addActionListener(new ActionListener() {
			@Override
            public void actionPerformed(ActionEvent e) {
				String oldState = t1.getText();
				String newState = t3.getText();
				int indexState = states.indexOf(oldState);
				if(!states.contains(oldState))
				{
					t1.setText("Not Exists");
					t3.setText("");
				}
				else if(oldState.equals(""))
				{
					t1.setText("No Input");
					t3.setText("");
				}
				else if(newState.equals(""))
				{
					t1.setText("");
					t3.setText("No Input");
				}
				else
				{
					states.set(indexState,newState);
					t1.setText("");
					t3.setText("");
					label[indexState].setText(states.get(indexState));
					p.revalidate();
					p.repaint();
				}
            }
        });
        //b Add States in the table
	p.add(b);
	b.addActionListener(new ActionListener() {
			@Override
            public void actionPerformed(ActionEvent e) {
				String inputtedState = t1.getText();
				t1.setText("");
				if(states.contains(inputtedState))
				{
					t1.setText("Existing");
				}
				else if(inputtedState.equals(""))
				{
					t1.setText("No Input");
				}
				else
				{
					states.add(inputtedState);
					label[x] = new JLabel(states.get(x));
					label[x].setBounds(65,ypos,50,50);
					label[x].setForeground(new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255)));
					label[x].setFont(new Font("Serif", Font.PLAIN, 30));
					p.add(label[x]);
					p.revalidate();
					p.repaint();
					x++;
					ypos = ypos + 50;
				}
            }
        });
	add(p);
	setVisible(true);
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}