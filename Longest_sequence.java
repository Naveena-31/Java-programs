package problems;
import java.util.HashSet;
import java.util.Set;
public class zz {
    public static int fun(int longest, int[] arr){
        Set<Integer> numset = new HashSet<>();
        for (int i : arr) {
            numset.add(i);
        }
        for(int num : numset){
            if(!numset.contains(num - 1)){
                System.out.println(num+"  -  "+numset.toString());
                int count = 1;
                int current = num;
                while (numset.contains(current + 1)) {
                    current++;
                    count++;
                    System.out.println(current+"--- count: "+count);
                }
                longest = Math.max(count, longest);
            }
        }
        return longest;
    }
    public static void main(String[] args) {
        int[] arr = {101,102,103,0,1,4,3,2,32};
        int longest = 0;
        System.out.println(fun(longest,arr)); 
    }
}