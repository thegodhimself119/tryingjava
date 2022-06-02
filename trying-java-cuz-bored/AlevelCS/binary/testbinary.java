package AlevelCS.binary;

import javax.swing.JOptionPane;
import java.lang.Math;


public class testbinary {
    public static void main(String[] args){
        String out="";
        decimal obj = new decimal();
        String decimal = JOptionPane.showInputDialog( "Enter any decimal" ); 
        float idecimal = Float.valueOf(decimal);
        if(idecimal<0){
            
           float  absidecimal = Math.abs(idecimal);
            String ans =obj.twocomplement(absidecimal);
            out = ans;
        }

        else if (idecimal>0){
             out = obj.posDecimalToBiniary(idecimal);
        }
        else{
            out = "0.0";
        }
       
        JOptionPane.showMessageDialog(null, out,"it's binary is" 
        ,JOptionPane.INFORMATION_MESSAGE);
        
        
        
        

       
       
        
    }
    
}
