/** Joshua Famous  
 *  Lesson 3 - Name That Celebrity
 *  June 3, 2017
 *  This program will print celebrity names missing the first 2 and last 3 letters
 */

public class NameThatCelebrity {

    public static void main(String args[]){
        
        String name1 = "Allan Alda";
        String name2 = "John Wayne";
        String name3 = "Gregory Peck";
        
        String nameSubstring1 = name1.substring(2,name1.length()-3);
        String nameSubstring2 = name2.substring(2,name2.length()-3);
        String nameSubstring3 = name3.substring(2,name3.length()-3);
        
        System.out.println(nameSubstring1);
        System.out.println(nameSubstring2);
        System.out.println(nameSubstring3);
        
    }
    
}