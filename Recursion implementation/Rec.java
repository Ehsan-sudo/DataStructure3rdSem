public class Rec{
    int count = 5;
    public static void main(String[] args) {
        Rec r = new Rec();
        r.factorial();

    }

    public void factorial(){
        if(this.count == 1){
             System.out.println("this is print");
        }
        else{
            this.count--;
            factorial();
        }
    }
}