//the main class of the file
public class LinkedList{
    public static void main(String[] args) {
    	//creating 3 Person objects
        Person ahmad = new Person("Ahmad");
        Person ahmadChild = new Person("Mohammad");
        Person MohammadChild = new Person("Karim");
	
	//adding the objects
        ahmad.add(ahmadChild);
        ahmad.add(MohammadChild);
	
	//printing the objects
        ahmad.print();
    }
}

class Person{
    //attributes
    String name;
    Person child;
    
    //constructors
    Person(String name){
        this.name = name;
    }
    Person(){}
    
    //public add method
    public void add(Person person){
        if(this.child == null){
            this.child = person;
        }
        else{
            this.child = this.addRec(this.child, person);
        }
    }
    
    //private recursive add method which is only used by public add method
    private Person addRec(Person base, Person newPerson){
        if(base == null){
            return newPerson;
        }
        else{
            base.child =  this.addRec(base.child, newPerson);
            return base;
        }
    }

    //public print method
    public void print(){
        Person temp = new Person(); //this is to avoid the referencing issue
        temp = this;

        while(temp != null){
            System.out.println(temp.name);
            temp = temp.child;
        }
    }
}
