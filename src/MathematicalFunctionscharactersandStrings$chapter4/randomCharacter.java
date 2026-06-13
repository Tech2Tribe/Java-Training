/*This program displays a random uppercase letter using Math.random */
package MathematicalFunctionscharactersandStrings$chapter4;
public class randomCharacter {
    public static void main (String[] args){
        
            //'A' + Math,random() * 26 helps get all the alphabet in capital letters
        char randomLetter = (char) ('A' + Math.random() * 26);

        System.out.println(randomLetter);
    }
}
    

