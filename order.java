public class order {
    static void Order(int[] arr) {  
        int n = arr.length;  
        int temp = 0;  
        for (int i = 0; i < n; i++) {
            for (int j = 1; j < (n - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    //swap elements  
                    temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        }

    public static void main(String[] args) {
        int arr[] = { 3, 60, 8, 2, 45, 20, 5, 19, 70, 15 };

        System.out.println("Array Before ordered: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        Order(arr);

        System.out.println("Array After it is ordered: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}