public class Array_basic{
    public static int maximum(int[]arr){
        int max = arr[0];
        for(int i = 0; i<arr.length; i++){
            if(max<arr[i]){
                max = arr[i];
            }
        }
        return max;
    }

    public static int sumElements(int[]arr){
        int sum = 0;
        for(int i : arr){
            sum+=i;
        }
        return sum;
    }

    public static int minimum(int[]arr){
        int min = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(min>arr[i]){
                min = arr[i];
            }
        }
        return min;
    }

    public static void printArray(int[]arr){
        for(int i : arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }

    public static int[] reverseArray(int[]arr){
        int[]reversed = new int[arr.length];
        int indx = 0;
        for(int i = arr.length-1; i>=0; i--){
            reversed[indx++] = arr[i];
        }
        return reversed;
    }

    public static int searchElement(int[]arr, int x){
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == x){
                return i;
            }
        }

        return -1;
    }
    
    public static int countOccurences(int[]arr, int x){
        int count = 0; 
        for(int i : arr){
            if (i == x) {
                count++;
            }
        }
        return count;
    }

    public static int lastoccurence(int[]arr, int x){
        int lastoccurence = -1;

        for(int i = 0; i<arr.length; i++){
            if(arr[i] == x){
                lastoccurence = i;
            }
        }
        return lastoccurence;
    }

    public static boolean checkSorted(int[]arr){

        for(int i = 0; i<arr.length-1; i++){
            if (arr[i]> arr[i+1]) return false;
        }
        return true;
    }

    public static void main(String[]args){
        int[] arr = {1,2,3,9};
        int[] reversed = reverseArray(arr);
        printArray(reversed);
        System.out.println(sumElements(arr));
        // System.out.println(searchElement(arr,9));
        // System.out.println("Number of occurences: "+countOccurences(arr, 9));
        // System.out.println("Last Occurence: "+lastoccurence(arr, 9));
        System.out.println(checkSorted(arr));
    }
}