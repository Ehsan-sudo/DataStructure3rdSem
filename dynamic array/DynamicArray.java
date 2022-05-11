import java.util.ArrayList;

class DynamicArray{
    public static void main(String[] args) {
        
        Plan plan = new Plan();
        plan.add(new Person(12, "Ehsan"));
        plan.add(new Person(12, "ehsan2"));
        plan.add(new Person(12, "ehsan3"));
        plan.add(new Person(12, "ehsan4"));
        plan.print();
        System.out.println("--------------");
        plan.add(2, new Person(33, "New Item"));
        plan.print();
    }
}

class Person{
    int id;
    String name;

    Person(int id, String name){
        this.id = id;
        this.name = name;
    }

    public void print(){
        System.out.println(this.id+" "+this.name);
    }
}

class Plan{
    Person[] p;

    public void add(Person p){
        if (this.p == null){
            this.p = new Person[1];
            this.p[0] = p;
        }
        else{
            Person[] temp = new Person[this.p.length+1];
            
            for(int i=0;i<this.p.length;i++){
                temp[i] = this.p[i];
            } 
            temp[temp.length-1] = p;
            this.p = temp;
        }
    }

    public void add(int index, Person p){
        if(index > this.p.length || index<0){
            System.out.println("Out Of Bound Index");
        }

        Person[] temp = new Person[this.p.length+1];
        for(int j=0,i=0;i<this.p.length; j++){
            if(j==index){
                temp[j] = p;
            }
            else{
                temp[j] = this.p[i];
                i++;
            }
        }

        this.p = temp;
    }

    public void print(){
        for (Person person : this.p) {
            System.out.println(person.name);
        }
    }
}