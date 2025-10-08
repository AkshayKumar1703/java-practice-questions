//Problem: Write a program to remove duplicates of a given list of numbers.
//Solution:
class Solution {
 public static void main(String[] args) {

   List<Integer> numbers = List.of(100, 20, 33, 4, 50, 6, 33);
   List<Integer> sortedList = new ArrayList<>(numbers);


   for (int i = 0; i < sortedList.size(); i++) {
       for (int j = 0; j < (sortedList.size() - i - 1); j++) {  
            if (sortedList.get(j) > sortedList.get(j + 1)) {
                int temp = sortedList.get(j);
                sortedList.set(j, sortedList.get(j + 1));
                sortedList.set(j + 1, temp);
            }
       }
   }
       List<Integer> uniquenumbers = new ArrayList<>();
       for (int i = 0; i < sortedList.size(); i++) {
         if (i == 0 || !sortedList.get(i).equals(sortedList.get(i - 1))) {
               uniquenumbers.add(sortedList.get(i));
           }
       }

       System.out.println("Original List: " + numbers);
       System.out.println("Sorted without duplicates: " + uniquenumbers);
   }
}
