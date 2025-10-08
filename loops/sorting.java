//Problem: Write a program to sort a given list of numbers.
//Solution:
class Solution {
   public static void main(String[] args) {
      
       List<Integer> numbers = List.of(0, 20, 33, 4, 50, 6);
       List<Integer> sortedList = new ArrayList<>(numbers);
    
       for (int i = 0; i < sortedList.size(); i++) {
           for (int j = 0; j < sortedList.size() - i - 1; j++) {
               if (sortedList.get(j) > sortedList.get(j + 1)) {
                   int temp = sortedList.get(j);
                   sortedList.set(j, sortedList.get(j + 1));
                   sortedList.set(j + 1, temp);
               }
           }
       }
       System.out.println("Original list: " + numbers);
       System.out.println("Sorted list: " + sortedList);
   }
}
