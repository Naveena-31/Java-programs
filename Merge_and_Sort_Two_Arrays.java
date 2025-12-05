import java.util.Scanner;
public class Main {
    static void sort(int[] arr,int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int t=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=t;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int[] arr1=new int[n1];
        int[] arr2=new int[n2];
        for(int i=0;i<n1;i++){
            arr1[i]=sc.nextInt();
        }
        for(int i=0;i<n2;i++){
            arr2[i]=sc.nextInt();
        }
        int n3=0;
        int[] res=new int[n1+n2];
        for(int i=0;i<n1;i++){
            res[n3++]=arr1[i];
        }
        for(int i=0;i<n2;i++){
            res[n3++]=arr2[i];
        }
        sort(res,n3);
        for(int i=0;i<n3;i++){
            System.out.print(res[i]);
            if(i<n3-1){
                System.out.print(" ");
            }
        }
    }
}