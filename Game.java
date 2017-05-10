import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.ImageIcon;

public class Game extends JFrame implements ActionListener{
    
    public final int Rows = 13;
    public final int Columns = 9;
    public JButton buttons[][] = new JButton[Rows][Columns];
    public JPanel panel;  
    public JFrame window;
        
    public Game(){
        
// Create the window for the game//
        JFrame window = new JFrame();
        panel = new JPanel();
        panel.setLayout(new GridLayout(13,9));
        
        setSize(288,416);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
                
// Add buttons to the window with a loop creating a 2D array//
        for(int i =0;i<Rows;i++)
        {
            for(int j=0;j<Columns;j++) 
            {
                if (i == 12)
                {
                    buttons[i][j] = new JButton(new ImageIcon("bank1.jpg")); 
                    
// Bottom row of game to have this this image on each button//
                    
                    
                }
                else
                if (i ==0)
                {
                    buttons[i][j] = new JButton(new ImageIcon("bank2.jpg"));    
                    
// Top row of game to have this this image on each button//

                }
                 else 
                {                  
                    buttons[i][j] = new JButton(new ImageIcon("water1.jpg")); 

// All other buttons will be water//

                    
                }
                    buttons[i][j].addActionListener(this);
                    panel.add(buttons[i][j]);
                
// Add action listeners to buttons, to be able to interact//

                
          }
        }
        this.add(panel);
        
        
        setVisible(true);
    }    
    
    public void level1()
    {
        buttons[12][2].setIcon(new ImageIcon("stump2_man.jpg"));
        buttons[10][2].setIcon(new ImageIcon("stump1.jpg"));
        buttons[10][5].setIcon(new ImageIcon("stump1.jpg"));
        buttons[8][5].setIcon(new ImageIcon("stump1.jpg"));
        buttons[5][5].setIcon(new ImageIcon("stump1.jpg"));
        buttons[5][5].setIcon(new ImageIcon("stump1.jpg"));




        
// Here I will different images to the 2D array //     
        
    }
    public void actionPerformed(ActionEvent e)
    {
        
    }
    public static void main(String args[])
    {
        Game game = new Game();
        game.level1(); 
        
    }
}