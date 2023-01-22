package ch6ex2;
import java.util.Scanner;

public class Ch6Ex2 {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int uin,holder,i=2;
        
        System.out.println("Enter a positive number");
            uin=input.nextInt();
        
        while(i<=uin){
            holder=uin%i;
            
                if(holder==0){
                    System.out.println(i);
                    uin/=i;
                }
                else{
                    i++;
                }
        }
        
        
    }
    
}
