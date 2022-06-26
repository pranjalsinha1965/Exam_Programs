class OperatorExample{

    public static void main(String args[]){
    
    //For positive number, >> and >>> works same
    
    System.out.println(20>>2);
    
    System.out.println(20>>>2);
    
    //For negative number, >>> changes parity bit
    
    System.out.println(-20>>2);
    
    System.out.println(-20>>>2);
    
    }}