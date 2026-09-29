//Bubblesort

public class selectionsort{


public static void print(int []arr){
    for(int i=0;i<arr.length;i++){
        System.out.println(arr[i]);
        

    }
    System.out.println();
}

    public static void main(String[] args) {
        int arr[]= {2,5,3,1,9};

        for(int i=0;i<arr.length-1;i++){
            int min=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[min]>arr[j]){
                    int temp= arr[min];
                    arr[min]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        print(arr);
    }
}