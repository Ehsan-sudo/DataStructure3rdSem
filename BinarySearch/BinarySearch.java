public class BinarySearch{
    public static void main(String[] args) {
        Student[] s = {
            new Student(12, "Ahmad"),
            new Student(13, "Hamid"),
            new Student(14, "Ahmad1"),
            new Student(15, "Ahmad2"),
            new Student(16, "Ahmad3"),
        };
        BinarySearch bs = new BinarySearch();
        System.out.println(bs.bs(s, new Student(99, "Ahmad")));

    }

    public boolean bs(Student[] arr, Student s){
        return this.recBs(arr, s, 0, arr.length-1);
    }

    private boolean recBs(Student[] arr, Student s, int low, int high){
        if(low > high){
            return false;
        }
        else{
            int mid = (low + high)/2;
            if(arr[mid].id == s.id){
                return true;
            }
            else if(arr[mid].id > s.id){
                return this.recBs(arr, s, low, mid-1);
            }
            else{
                return this.recBs(arr, s, mid+1, high);
            }
        }
    }

}

class Student{
    int id;
    String name;

    Student(int id, String name){
        this.id = id;
        this.name = name;
    }
}