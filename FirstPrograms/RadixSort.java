/**
 *  Joshua Famous
 *  Period 4
 *  4/11/2018
 *  This program will take an input of strings and sort them alphabetically using a Radix sort.
 */

import java.util.Scanner;
import java.util.ArrayList;

public class RadixSort {
    public static void main(String args[]){
        //vars
        Scanner scan = new Scanner(System.in);
        
        //input
        System.out.println("Enter words seperated by spaces : ");
        String[] dab = scan.nextLine().split(" ");
        
        //output
        printArray(sort(dab));
    }
    
    public static String[] sort(String[] ary){
        //populate storage arraylists
        ArrayList<String>[] alpha = (ArrayList<String>[])new ArrayList[26];
        for(int i = 0; i < 26; i ++){
            alpha[i] = new ArrayList<>();
        }
        //for each character, from end to start
        for(int i = wordLength-1; i >= 0; i --){
            //for each word
            for(int q = 0; q < ary.length; q ++){
                if(ary[q].length() > i){
                    //add the word to the correct arraylist
                    char cc = Character.toLowerCase(ary[q].charAt(i));
                    alpha[charToIndex(cc)].add(ary[q]);
                }
            }
            //reassemble the string array
                String[] tempStrings = new String[ary.length];
                int tempIndex = 0;
                for(ArrayList<String> b : alpha){
                    if(b.size() > 0){
                        for(int j = 0; j < b.size(); j ++){
                            tempStrings[tempIndex] = b.get(j);
                            tempIndex ++;
                        }
                    }
                }
                ary = tempStrings;
                //clear the alpha arraylists
                for(int c = 0; c < 26; c ++){
                    alpha[c] = new ArrayList<>();
                }
        }
        return ary;
    }
    
    public static int charToIndex(char c){
        return (int)c - 97;
    }
    
    public static void printArray(String[] values){
        for(int i = 0; i < values.length; i ++){
            System.out.print(values[i] + " ");
        }
        System.out.print("\n");
    }
    public static final int wordLength = 4;
}