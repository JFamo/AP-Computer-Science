import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;

public class PalindromeFromLetters
{
    public static void main(String args[]){
        //Variables
        Scanner scan = new Scanner(System.in);
        String input = "";
        String largestPalindrome = "";
        ArrayList<String> doubles = new ArrayList<String>();
        ArrayList<String> singles = new ArrayList<String>();
        
        //Input
        System.out.println("Enter letters, seperated by spaces : ");
        try{
            input = scan.nextLine();
        }catch(Exception e){
            System.out.println("Incorrect Input!");
        }
        ArrayList<String> letters = new ArrayList<>(Arrays.asList(input.split(" ")));
        
        //Find Double Letters and Single Letters
        for(int startIndex = 0; startIndex < letters.size(); startIndex ++){
            for(int nextIndex = startIndex + 1; nextIndex < letters.size(); nextIndex ++){
                if(letters.get(nextIndex).equals(letters.get(startIndex))){
                    doubles.add(letters.get(startIndex));
                }
            }
            if(!doubles.contains(letters.get(startIndex))){
                singles.add(letters.get(startIndex));
            }
        }
        
        //Form the Palindrome
        largestPalindrome = "";
        if(singles.size() > 0){
            largestPalindrome = singles.get(0);
        }
        for(int index = 0; index < doubles.size(); index ++){
            largestPalindrome = doubles.get(index) + largestPalindrome + doubles.get(index);
        }
        
        
        //Output
        System.out.println("Largest Palindrome : " + largestPalindrome);
    }
}
