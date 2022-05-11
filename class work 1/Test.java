public class Test {
    public static void main(String[] args) {

        Test3 t3 = new Test3(4);
        t3.t
    }
}

class Test2{
    private int id;
    String name;
}

class Test3{
    Test2[] t = new Test2[1];

    public void setData(Test2 t){
        this.t[0] = t;
    }

    public void printSize(){
        System.out.println(this.t.length);
    }
    
}