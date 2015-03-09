
package operaciones;
import java.util.*;

public class Operaciones {

    
    public static void main(String[] args) {
        Scanner lec= new Scanner (System.in);
        
        int op;
        double a,b,r;
     
        
       
        
        do{
        System.out.println("introduzca dos numeros");
        a=lec.nextDouble();
        b=lec.nextDouble();
                   
                    System.out.println("elija una operacion");
        System.out.println("1) suma");
        System.out.println("2) resta");
        System.out.println("3) multiplicacion ");
        System.out.println("4) division");
        
        op=lec.nextInt();
               
        
        switch(op){
        

            case 1: r=a+b;
                System.out.println("la suma es "+r);
                
                break;
                
            case 2: r=a-b;
                System.out.println("la resta es "+r);
        
                break;
                
            case 3: r=a*b;
                System.out.println("la multiplicacion es "+r);
                
                break;
            case 4: r=a/b;
                System.out.println("la division es " +r);
                
                break;
                
        
    }
    }while (op>4 || op<1);
        
        
        
        
        
    }
    
}
