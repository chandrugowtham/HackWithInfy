import java.util.ArrayList;
import java.util.List; 
class XOR_Operation{                    
    static int pairORSum(int arr[], int n) {
       List<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {	
            	list.add(arr[i] ^ arr[j]);
            	System.out.print(arr[i]^arr[j]);
            	System.out.print(" ");
            }
        }System.out.println();
        int ans = 0;
        for(Integer value : list) {
        	System.out.print("ans=ans^value="+ans+"^"+value);
        	System.out.println();
        	ans = ans ^ value;
        	
        }      
        return ans; 
    }   
    public static void main (String[] args) {      
        int arr[] = { 1,2,3,4 }; 
        int n = arr.length;    
        System.out.println(pairORSum(arr, 
                                arr.length)); 
    } 
}