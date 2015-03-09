
package pares;

public class Pares {

    
    public static void main(String[] args) {
      
        
       int c=0,n=1,sum=0;
        
       while(n<=100) {
          
        if(n%2==0){
            c++; 
             
       
        } else sum=sum+n; 
        n++; 
       }
       
    System.out.println("La suma de los numeros impares es: " + sum);
    
    System.out.println("hay " + c+" numeros pares"); 
    
    }
    
}
    
    

