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
        /*
        manual implementation of floor & ceil function
        int row,col=0;
        if(LSqRt%(int)LSqRt == 0) //7.000%7 ==0 else 7.123%7!=0 by this we can determine LSqRt is perfect sq root/factor
        {
           row=(int)LSqRt;
           col=(int)LSqRt;
        }
        else
        {
         row = (int)LSqRt;      //Math.floor(LSqrt) for eg if LSqrt = 3.44 --> row = 3
         col = (int)LSqRt + 1;  //Math.ceil(LSqrt)  for eg if LSqrt = 3.44 --> col = 4
        }
        */
        
        int row =(int)Math.floor(LSqRt);   //Math function takes into account if it has perfect sqrt 
        int col =(int)Math.ceil(LSqRt);  
        
        if(L>81){
            //invalid input String
        }
        while(row * col < L){
            //error
            //adjust row & col 
            row++;
           //as we try to increase area of our rect or we can say we try to gather chairs for our L number of guests  
        }
        char []msgStr = s.toCharArray();
        char [][]msgChar = new char [row ][col];
        int x = 0; // index of first char in msgStr
        for(int i =0; i<row;i++){
            for(int j=0; j<col;j++)
            {     if(x<msgStr.length){
                  msgChar[i][j] = msgStr[x];
                  x++;
                  }
                  else{
                      msgChar[i][j] = '\0'; //to represent null char 
                  }
                  //System.out.print(msgChar[i][j]);
            }
                  //System.out.println();  
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
        
        /*
        int rowidx =0;
        for (int j =0; j<col; j++){
            String encodedStr ="";
            while(rowidx<row)
            {
             encodedStr = encodedStr + msgChar[rowidx][j];  
             rowidx++;
            }
            System.out.print(encodedStr +" ");
            rowidx=0;
        }
        */
        
    }
}
/*
2Darray of 1d char array of string long length and col loop 

or 
string array char at(0/1)then ++ till length()*/

/*
test case 2 
row 3 x col 4 = 12 element matrix
but total length of msg is 10 ie we have only 10 char elements
therefore adjust row * col
*/
