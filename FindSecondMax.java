import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int max=arr[n-1];//find the largest element in the array
        for(int i=n-2;i>=0;i--){//iterate from last to find the next largest element
            if(arr[i]<max){
                System.out.print(arr[i]);//prints the second largest element
                break;
            }
        }
    }
}