class Example{
    // global array
    int[] arr;

    public static void main(String[] args) {
        Example e = new Example();
        // initial size
        e.arr = new int[1];

        // set initial value 3
        e.arr[0] = 3;
        e.print();

        // add 5 and resize the global array
        e.append(5);
        e.print();
    }

    // appends an item at the end of the array
    public void append(int data){
        int[] newArr = new int[this.arr.length+1];
        // copy
        for(int i=0;i<this.arr.length;i++){
            newArr[i] = this.arr[i];
        }
        // add new item at the end of newArr
        newArr[newArr.length-1] = data;
        // replace the global array
        this.arr = newArr;
    }

    public void print(){
        for (int i : this.arr) {
            System.out.print(i);
        }
        // empty print for new line
        System.out.println();
    }
}