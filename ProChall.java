import javax.swing.JOptionPane;
/**
 * ProChall15 class does the following:
 * 1) create a JOptionPane
 * 2) add a final integer
 * 3)create a String
 * 4) create double variables
 * 5) create integer variable
 * 6) JOptionPane to create dialogues with strings
 * 7) do the math through the variables
 * 8) input
 * 
 * @author Tomas Moshi
 * @version v1.0
 * @since 9/7/22
 */
public class ProChall{
    public static void main (String[] args){
        
        final double COMM_RATE = 0.02;
        String temp;
        double total, pricePerShareDouble, commission, totalCostShares;
        int numShares;
        
       temp = JOptionPane.showInputDialog(null,"Enter number of shares ");
        numShares = Integer.parseInt(temp);
        temp =JOptionPane.showInputDialog(null,"Enter price per share ");
        pricePerShareDouble = Double.parseDouble(temp);
        
        totalCostShares = pricePerShareDouble * numShares;
        commission = COMM_RATE * totalCostShares;
        total = commission + totalCostShares;
        

        JOptionPane.showMessageDialog(null, String.format("Total cost of shares are: $%,.2f",totalCostShares) +
        String.format("\nCommission cost is: $%,.2f",commission) +
        String.format("\nTotal Cost is: $%,.2f",total));
        System.exit(0);
    }
}