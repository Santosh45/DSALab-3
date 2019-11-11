import java.util.Scanner;

class BinarySearch{
public static void main(String[] args){
int n, temp;
Scanner sc=new Scanner(System.in);
System.out.println("Enter the number of elements you want in array:");
n=sc.nextInt();

int arr[]=new int[n];

System.out.println("Enter the all Elements:");
for(int i=0; i<n; i++){
arr[i]=sc.nextInt();
}
for(int i=0; i<n;i++){
System.out.println(arr[i]);
}

}
}