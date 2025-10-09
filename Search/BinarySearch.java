//Problem: Write a program to do a binary search
//Solution:
class Solution {
   public static int binarysearch(List<Integer> numbers, int target, int     minpoint,int maxpoint) {
       while (minpoint <= maxpoint) {
           int mid = minpoint + (maxpoint - minpoint) / 2;


           if (target == numbers.get(mid)) {
               return mid;
           }
           if (target > numbers.get(mid)) {
               minpoint = mid + 1;
           } else {
               maxpoint = mid - 1;
           }
       }
       return -1;
   }


 public static void main(String[] args) {
   List<Integer> numbers = new ArrayList<>(List.of(30, 4, 6, 20, 33, 50));
       Collections.sort(numbers);
       int listsize = numbers.size();
       int target = 4;
       int result = binarysearch(numbers, target, 0, listsize - 1);


       if (result == -1) {
           System.out.println("Number not found");
       } else {
           System.out.println("Number found at index: " + result);
       }
   }
}
