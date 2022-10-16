public class Main
{
    static void heapify(int[] arr,int n,int i){
      int parent=i/2;
      
      if(arr[parent]>0){
          if(arr[i]>arr[parent]){
              int swap=arr[i];
        arr[i]=arr[parent];
        arr[parent]=swap;
        
        heapify(arr,n,n-1);
          }
      }
    }
    
    static int insertNode(int[] arr,int n,int key){
        n=n+1;
        arr[n-1]=key;
        heapify(arr,n,key);
        
        return n;
    }
    
    static void printArray(int[] arr, int n){
        
        for(int i=0;i<n;i++)
            System.out.println(arr[i]);
            System.out.println();
        
        
    }
	public static void main(String[] args) {
	    int MAX=1000;
		int[] arr=new int[MAX];
		int n= 5;
	
		 arr[0] = 10;
        arr[1] = 5;
        arr[2] = 3;
        arr[3] = 2;
        arr[4] = 4;
         
		int key=1;
		n=insertNode(arr,n,key);
		printArray(arr,n);
	}
}
