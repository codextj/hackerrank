import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
  
        Scanner sc = new Scanner(System.in);        
        String sentence = sc.nextLine(); //take input String using nextLine() as sentence may contain spaces   
        sentence = sentence.toLowerCase();
        //so that when we check for duplicates upper and lower case alphabet will be treated as same ie considered duplicate
        sentence = sentence.replaceAll("\\s+","");//for removing space
        char []pangramChk = sentence.toCharArray(); //converting string to array 
        Arrays.sort(pangramChk); //as array has in-built method for sorting 
        String sorted = new String(pangramChk); 
        // converting array into string again as due to sorting all the chars are now arranged in increasing order of ascii values 
        sentence =  sorted.replaceAll("(.)\\1{1,}", "$1");
        //using regex to remove duplicates as due to sorting all the duplicates will be next to one another
        //replaceAll("regex"), "replacement" Replaces all occurances of "regex" with "replacement.
        //due to all this checks now if our string/sentence is pangram it must be having 26 unique letter/chars ie alphabets  
                     if(sentence.length()==26)
                      {
                       System.out.println("pangram");
                     }
                    else
                       {
                        System.out.println("not pangram");
                      }
                   }
                }
