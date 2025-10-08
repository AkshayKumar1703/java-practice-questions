//Problem: Write a program to average a given list of numbers.
//Solution:
class Solution {
 public static void main(String[] args) {
   List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6);

    int sum = 0;
    for ( int i = 0 ; i < numbers.size(); i++){
          sum = sum + numbers.get(i);
 	   }
    double avg = (double)sum/numbers.size();

  System.out.println("The total sum of an array is" + " " + sum);
  System.out.println("The total sum of an array is" + " " + avg);
  }
}
