/*This code displays the population for each for the next five years*/
package IntroductionToJava$chapter1;
public class PopulationProjection1 {
    public static void main (String[] args){
        final int currentPopulation = 312032486;
        
        // now calculate for birth rate
        double birthRate = 60 / 7;
        double  birthHour= birthRate * 60 ;
        double  birthDays = birthHour * 24;
        double  birthYear = birthDays * 365;
        
        // now calculate for death rate
        double  deathRate = 60 / 13;
        double  deathHour = deathRate * 60;
        double  deathDays = deathHour * 24;
        double  deathYear = deathDays * 365;
        
       // now calculate for immigrant rate
       double  immigrantRate = 60 / 45;
       double  immigrantHour = immigrantRate * 60;
       double  immigrantDays = immigrantHour * 24;
       double  immigrantYear = immigrantDays * 365;
       
       double  yearlyChange = ((birthYear + immigrantYear) - deathYear) ; 
       
       // now calculate the yearly population
       
       double  year1 = currentPopulation + yearlyChange;
       double  year2 = year1 + yearlyChange;
       double  year3 = year2 + yearlyChange;
       double  year4 = year3 + yearlyChange;
       double  year5 = year4 + yearlyChange;
       
        System.out.println(" The population in five years time, taken that the current population is " + currentPopulation + " would be as follow: ");
        System.out.println(" In one year " + (int) year1);
        System.out.println(" In two years " + (int)year2);
        System.out.println(" In three years " + (int) year3);
        System.out.println(" In four years " + (int)year4 );
        System.out.println(" In five years " +  (int) year5);
        System.out.println((int)yearlyChange);
 
        
    }
    
}
