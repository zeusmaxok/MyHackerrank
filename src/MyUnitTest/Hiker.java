package MyUnitTest;


public class Hiker implements Validator{

    public boolean isValid (String str) {
        
        String isbn = str.replaceAll("[- _]", "");
        int length = isbn.length();
        
        
        
        if(length == 10){
            return isValidTenBasedISBN(isbn);
        }
        
        if(length == 13){
            return isValidThirteenBasedISBN(isbn);
        }
        
        return false; 
    }
    
    
    private boolean isValidTenBasedISBN (String str) {
        int sum = 0;
        boolean result = false;
        
        for(int i = 0; i < 9; i++){
            int num = str.charAt(i) - '0';
            
            sum += (num * (10 - i));
        }
        
        char lastChar = str.charAt(9);
        
        if(lastChar == 'X' || lastChar == 'x'){
            sum += 10;
        }else{
            sum += lastChar - '0';
        }
        
        result = (sum % 11 == 0) ? true : false;
        
        return result;
    }
    
    private boolean isValidThirteenBasedISBN (String str) {
        int sum = 0;
        boolean result = false;
        
        for(int i = 0; i < 12; i++){
            
            int num = str.charAt(i) - '0';
            
            if(i % 2 == 0){
                sum += num * 1;
            }else{
                sum += num * 3;
            }
        }
        
        int check = 10 - sum % 10;
        
        if(check == 10){
            check = 0;
        }
        
        System.out.println(str.charAt(12) - '0');
        
        result = (check == (str.charAt(12) - '0')) ? true : false;
        
        return result;
    }
}
