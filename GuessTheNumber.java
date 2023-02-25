/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guessthenumber;

/**
 *
 * @author DELL
 */
/*
public class GuessTheNumber {

    /**
     * @param args the command line arguments
     */
    //public static void main(String[] args) {
        // TODO code application logic here
    //}
    
//}*/

import java.util.Random;
import javax.swing.JOptionPane;

public class GuessTheNumber
{
    public static void main(String[] args)
    {
        int min = 1;
        int max = 100;
        int attempts = 5; // Maximum number of attempts allowed
        int score = 0; // Starting score
        
        Random rand = new Random();
        int target = rand.nextInt(max - min + 1) + min;
        
        for (int i = 1; i <= attempts; i++)
        {
            String input = JOptionPane.showInputDialog("Guess the number (between " + min + " and " + max + "):");
            int guess = Integer.parseInt(input);
            
            if (guess == target)
            {
                JOptionPane.showMessageDialog(null, "Congratulations! You guessed the number in " + i + " attempts.");
                score += 10 * (attempts - i + 1); // Award points based on number of attempts
                break;
            }
            else if (guess < target)
            {
                JOptionPane.showMessageDialog(null, "Your guess is too low.");
            }
            else
            {
                JOptionPane.showMessageDialog(null, "Your guess is too high.");
            }
            
            if (i == attempts)
            {
                JOptionPane.showMessageDialog(null, "Sorry, you have used up all your attempts. The number was " + target + ".");
            }
        }
        
        JOptionPane.showMessageDialog(null, "Your final score is " + score + ".");
    }
}

