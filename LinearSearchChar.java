public class LinearSearchChar{    
public static int linearSearch(char[] arr, char key){    
        int n=arr.length;
		for(int i=0;i<n;i++){    
            if(arr[i] == key){    
                return i;    
            }    
        }    
        return -1;    
    }    
    public static void main(String a[]){    
        char[] a1= {'a','e','i','o','u'};    
        char key = 'a';    
        System.out.println(key+" is found at index: "+linearSearch(a1, key));    
    }    
}    