class Solution {
 public static int linearSearch(List<Integer> numbers, int target) {
   for (int i = 0; i<numbers.size(); i++) {
        if(numbers.get(i)== target)
         return i;
      }
      return -1;
   }
   public static void main(String args[]) {
       List<Integer> numbers = List.of(2, 4, 0, 1, 9);
       int target = 9;
       int result = linearSearch(numbers, target);
      
       if(result == -1){
         System.out.println("Number not found");
       }
       else {
         System.out.println("Number found :" + " index = "+result +" ,Number = " +target);
       }
   }
 }
