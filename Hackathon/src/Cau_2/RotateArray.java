package Cau_2;

public class RotateArray {
    public static int[] sort(int[] arr){
        for (int i = 0 ; i < arr.length ; i++){
            for (int j = i + 1 ; j < arr.length - 1 ; j++){
                if (arr[j] > arr[j + 1]){
                    int temp = arr[j] ;
                    arr[j] = arr[j + 1] ;
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }
    public static void display(int[] arr){
        for (int i = 0 ; i < arr.length; i++){
            System.out.printf("%d " , arr[i]);
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = new int[] {-1, -100, 3, 99};
        System.out.println("truoc khi sap xep : ");
        display(arr);
        System.out.println("sau khi sap xep :");
        sort(arr);
        display(arr);
    }
}
