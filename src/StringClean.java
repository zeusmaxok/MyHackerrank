
public class StringClean {
	

	static boolean isValidISBN(String isbn) 
    { 
        // length must be 10 
        int n = isbn.length(); 
        if (n != 10) 
            return false; 
  
        // Computing weighted sum 
        // of first 9 digits 
        int sum = 0; 
        for (int i = 0; i < 9; i++)  
        { 
            int digit = isbn.charAt(i) - '0'; 
            if (0 > digit || 9 < digit) 
                return false; 
            sum += (digit * (10 - i)); 
        } 
  
        // Checking last digit. 
        char last = isbn.charAt(9); 
        if (last != 'X' && (last < '0' ||  
                            last > '9')) 
            return false; 
  
        // If last digit is 'X', add 10  
        // to sum, else add its value 
        sum += ((last == 'X') ? 10 : (last - '0')); 
  
        // Return true if weighted sum  
        // of digits is divisible by 11. 
        return (sum % 11 == 0); 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        String isbn = "0471958697"; 
        if (isValidISBN(isbn)) 
            System.out.print("Valid"); 
        else
            System.out.print("Invalid"); 
    } 
	

}
