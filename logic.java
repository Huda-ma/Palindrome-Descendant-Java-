import java.util.*;  

public static boolean isPalindromDescentdant(int num){
    boolean result = false;
    
    while(num > 9){
        
         if(isPlaindrom(num)){
         result = true;
         break;
         }
    num = sumOfDigits(num);
    }
    return result;
    
}


public static boolean isPalindrom(int num){
    int reverse = 0 , int n = num;
    
    while(n!=0){
        reverse = reverse * 10;
        reverse = reverse + n%10;
        n = n/10;
    }
    return (reverse == num);
    
}



public static int SumOfDigts(int num){
    string n = Integer.toString(num);
    Stringbuilder sb = new Stringbuilder;
    
    for(int i ; i< n.length()-1 ;i+=2){
        int d1 = Integer.ParseInt(Character.toString(n.chartAt(i)));
        int d2 = Integer.ParseInt(Character.toString(n.chartAt(i+1)));
        int sum = d1+d2; 
        sb.append(Integer.toString(sum));
    }
    return integer.ParseInt(sb.toString());
}


public class MainClass {
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
         System.out.print("enter a number");
            int x = sc.nextInt();  
         boolean res = isPalindromDescentdant(x);
        System.out.println(res);
        
         
    
       
    }
}
