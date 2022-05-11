public class Test{
  public static void main(String[] args) {
      Student[] students = new Student[3];
      students[0] = new Student(15, "Edrees");
      students[1] = new Student(16, "Ahmad");
      students[2] = new Student(17, "Sharif");

      Test obj = new Test();
      System.out.println(obj.search(new Student(66, "Nabi"), students));
  }
  public boolean search(Student student ,Student[] students){
    return this.recSearch(students,student,0,students.length-1);
   
}
private boolean recSearch(Student[] students,Student student,int start,int endP ){
   if(start>endP)
   {
       return false;
   }
   else
   {
       int mid=(start+endP)/2;
       if(student.ID==students[mid].ID)
       {
           return true;
       }
       else if(student.ID<students[mid].ID)
       {
           return this.recSearch(students, student, start, mid-1);
       }
       else
       return this.recSearch(students, student, mid+1, endP);
   }
}
}
class Student{
    int ID;
    String name;

    Student(int ID,String name)
    {
        this.ID=ID;
        this.name=name;
    }
}
