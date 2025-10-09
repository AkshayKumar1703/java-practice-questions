//Problem: Write a program to check whether a number is palindrome or not
//Solution:
class Solution {
 public static int isplanindrome(int number) {
   int reversenum = 0;
   int remainder = 0;
   int originalnum = number;


    while(number != 0) {
     remainder = number % 10;
     reversenum = reversenum * 10 + remainder;
     number = number/10;
    }
   
 if (reversenum == originalnum){
   return 1;
 }
 return -1;


 }
 public static void main (String [] args){
   int number = 121;
   int result = isplanindrome(number);
  
   if (result == 1){
     System.out.println("Number is palindrome");
   }
   else {
     System.out.println("Number is not palindrome");
   }
 }
}
