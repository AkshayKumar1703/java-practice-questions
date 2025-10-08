//Problem: Write a program to find a min and max value in a given list of numbers.
//Solution:
class Solution {
 public static void main(String[] args) {
   List<Integer> numbers = List.of(100,20,33,4,50,6);  

     int max_value = numbers.get(0);
     int min_value = numbers.get(0);
     for (int i = 0; i < numbers.size(); i++) {
        if(max_value <= numbers.get(i)) {
           max_value = numbers.get(i);
     }
        else {
           min_value = numbers.get(i);
     }
  }
  System.out.println("The largest value is" + "" + max_value);
  System.out.println("The smallest value is" + " " + min_value);
 }
}
