# Pangrams
- HackerRank link: [hackerrank.com/challenges/pangrams](https://www.hackerrank.com/challenges/pangrams)
- Difficulty: **Easy**


# Solution
## Java
###Imports
```import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
```
```java
 public class Solution 
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);        
    String sentence = sc.nextLine(); 

```
    Take input String using nextLine() as sentence may contain spaces   
```java
    sentence = sentence.toLowerCase();
    sentence = sentence.replaceAll("\\s+","");

```
    1)So that when we check for duplicates upper and lower case alphabet will be treated as same ie considered duplicate
    2)for removing space

```java
     char []pangramChk = sentence.toCharArray();
     Arrays.sort(pangramChk); 
     String sorted = new String(pangramChk); 
```
    1)converting string to array
    2)as array has in-built method for sorting
    3)converting array into string again as due to sorting all the chars are now arranged in increasing order of ascii values 

```java
     sentence =  sorted.replaceAll("(.)\\1{1,}", "$1");
```
     using regex to remove duplicates as due to sorting all the duplicates will be next to one another
     replaceAll("regex"), "replacement" Replaces all occurances of "regex" with "replacement.
     due to all this checks now if our string/sentence is pangram it must be having 26 unique letter/chars ie alphabets  

```java
       if(sentence.length()>25)
                      {
                       System.out.println("pangram");
                     }
                    else
                       {
                        System.out.println("not pangram");
                      }
                   }
                }

```
Last, we print whether given sentence is pangram or not
