import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int L = s.length();
        double LSqRt = Math.sqrt(L);      
        
        int row =(int)Math.floor(LSqRt);   // 3.24 --> 3 if perfect sq factor 3 -->3
        int col =(int)Math.ceil(LSqRt);    // 3.24 --> 4 if perfect sq factor 3 -->3
        
        if(L>81){
            //invalid input String
        }
        
        while(row * col < L){
            //error
            //adjust row & col 
            row++; //manipuliting rows as col are already at there max value == ceil func
           //as we try to increase area of our rect or we can say we try to gather chairs for our L number of guests 
           //ie we have more char then place to store them as we are trying to store them in [][]array so we increase size of array
        }
        
        char []msgStr = s.toCharArray();
        char [][]msgChar = new char [row ][col];
        int x = 0; // index of first char in msgStr
        for(int i =0; i<row;i++){
            for(int j=0; j<col;j++)
            {    
                  if(x<msgStr.length)
                    {
                    msgChar[i][j] = msgStr[x];
                    x++;
                    }
                  else
                      {
                      //if we are here it means we have run out of chars ie guest but still have chairs left 
                      msgChar[i][j] = '\0'; //to represent null char 
                      }                 
            }                      
         }
               
     
        for (int j =0; j<col; j++)
          {
             String encodedStr ="";
             for(int i =0; i<row; i++)
              { 
                if(msgChar[i][j]=='\0')
                {
                //if char is null empty no need to add/append , for some reason its not showing equal by compiler while                   
                //testing may be because string length may differ def !== def+'/0'
                }
                else
                {
                     encodedStr =encodedStr + msgChar[i][j];             
                }
              }
             System.out.print(encodedStr +" ");                                                  
          }
  }
}
