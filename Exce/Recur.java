import javax.swing.plaf.SliderUI;

public class Recur{
    public static void main(String[] args) {
        Recur r = new Recur();
        int[] arr = {12,33,1023,2322};
        r.revers(arr, arr.length-1, 0);
    }

    public int factorial(int n){
        if(n == 1){
            return 1;
        }
        else{
            return n * factorial(n-1);
        }
    }

    // utility function
    public void print(int[] arr){
        for (int i : arr) {
            System.out.print(i+ " ");
        }
        System.out.println();
    }    

    // method from book
    private boolean recSearch(int[] arr, int search, int less, int more){
        if(less > more){ //control case
            return false;
        }
        else{ //recursion case
            int mid = (less+more)/2;
            if(search == arr[mid]){
                return true;
            }
            else if (search < arr[mid]){  //if target value was less than middle value
                return recSearch(arr, search, less, mid-1);
            }
            else{ //if target value was more than middle value
                return recSearch(arr, search, mid+1, more);
            }
        }
    }

    // wrapper function
    public boolean binarySearch(int[] arr, int search){
        if(arr.length == 0){
            return false;
        }
        else if(arr.length == 1){
            return arr[0] == search;
        }
        // return recSearch(arr, search, 0, arr.length-1);
        return recSearch2(arr, search);
    }

    // my custom method
    public boolean recSearch2(int[] arr, int search){
        if(arr.length == 1){
            return arr[0] == search;
        }
        else{
            int mid = (arr.length/2);

            if(arr[mid] == search){
                return true;
            }
            else if(arr[mid] > search){
                return recSearch2(slice(arr, 0, mid), search);
            }
            else{
                return recSearch2(slice(arr, mid+1, arr.length), search);
            }
        }
    }
    
    // utility function
    public int[] slice(int[] arr, int start, int end){
        if(arr.length == 1){
            int[] temp = new int[1];
            temp[0] = arr[0];
            return temp;
        }
        else if(arr.length == 2){
            int[] temp = new int[1];
            temp[0] = arr[0];
            return temp;
        }

        int size = end-start;
        int[] temp = new int[size];
        for(int i=start, j=0;i<end;i++, j++){
            temp[j] = arr[i];
        }
        return temp;
    }

    public void revers(int[] arr, int i, int j){
        if(j > i){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            revers(arr, i--, j++);
        }
        this.print(arr);
    }
}