
package changenumber;
import java.util.*;
public class Changenumber {

    public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      System.out.println("Enter a hex number:");
      String hex = input.nextLine();
      System.out.println("The decimal value for hex number" + hex + "is" + hexToDecimal(hex.toUpperCase()));
    }
    public static int hexToDecimal(String hex){
        int decimalVaule = 0;
        for(int i =0;i<hex.length();i++)
        {
            char hexChar = hex.charAt(i);
            decimalVaule = decimalVaule *16 + hexCharToDecimal(hexChar);
        }
        return decimalVaule;
    }
    public static int hexCharToDecimal(char ch){
        if(ch >='A' && ch <='F')
            return 10 + ch -'A';
        else
        return    ch - '0';
    }
}
