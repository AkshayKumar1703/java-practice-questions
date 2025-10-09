//Problem: Write a program to find whether a given list of numbers is palindrome or not..
//Solution:
class Solution {
   public static void main(String[] args) {


       List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 4, 3, 2, 1);


       int firstIndex = 0;
       int lastIndex = numbers.size() - 1;


       boolean isPalindrome = true;


       while (firstIndex < lastIndex) {
           if (!numbers.get(firstIndex).equals(numbers.get(lastIndex))) {
               isPalindrome = false;
               break;
           }
           firstIndex++;
           lastIndex--;
       }


       if (isPalindrome) {
           System.out.println("palindrome");
       } else {
           System.out.println("not palindrome");
       }


       System.out.println(numbers);
   }
}
