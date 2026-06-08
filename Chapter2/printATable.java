/* this program creates a table and cast floating point numbers to integers*/
package ElementaryProgramming$chapter2;

public class printATable {
    public static void main (String[] args){
        float a = 1, b = 2;
         
       
        
        System.out.println("a           b           pow(a,b)");
        System.out.println((int)(a)   +"           " +(int)(b  )+ "              " +(int)Math.pow (a , b));
        System.out.println((int)(a++) +"           " +(int)(b++)+ "              " +(int)Math.pow (a , b));
        System.out.println((int)(a++) +"           " +(int)(b++)+ "              " +(int)Math.pow (a , b));
        System.out.println((int)(a++) +"           " +(int)(b++)+ "              " +(int)Math.pow (a , b));
        System.out.println((int)(a++) +"           " +(int)(b++)+ "              " +(int)Math.pow (a , b));
    }
    
}
