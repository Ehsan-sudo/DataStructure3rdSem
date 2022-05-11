public class ReferenceType{
    public static void main(String[] a){
        Person p = new Person();
        p.name = "Ahmad";
        
        Test t = new Test();
        System.out.println(p.name);
        t.addName(p);
        System.out.println(p.name);
    }
}

class Test{
    public void addName(Person p){
        String name = p.name;
        p.name = name+"nnn";
    }

    public void addName(int i){
        i = i+4;
    }
}

class Person{
    String name;

    public void print(){
        System.out.println(this.name);
    }
}