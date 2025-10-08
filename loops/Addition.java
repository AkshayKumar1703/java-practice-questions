//Problem: Write a program to sum a given list of numbers.
//Solution:

class Solution {
 public static void main(String[] args) {
   List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);

   Integer sum = 0;
   for (Integer number : numbers) {
     sum = sum + number;
   }
   
   System.out.println("Sum is : " + sum);
 }
}
