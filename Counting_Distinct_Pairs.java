import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Set <String> set=new HashSet<>();
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]<arr[j]){
                    String p=arr[i]+"-"+arr[j];
                    set.add(p);
                }
            }
        }
        if(set.size()==0){
            System.out.println("-1");
        }
        else{
            System.out.println(set.size());
        }
    }
}