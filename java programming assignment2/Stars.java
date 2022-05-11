public class Stars{
    public static void main(String[] args) {
        PrintStars ps = new PrintStars();

        ps.set_count(10);
        ps.printSnake();
    }
}

class PrintStars{
    private int count;

    public void set_count(int count){
        this.count = count;
    }

    public int get_count(){
        return this.count;
    }

    public void printPyramid(){
        int starCount = 1;
        int spaceCount = this.count;

        for(int i=0;i<this.count;i++){

            // printing spaces
            for(int j=spaceCount;j>0;j--){
                System.out.print(" ");
            }

            // printing stars
            for(int k=0;k<starCount;k++){
                System.out.print("*");
            }

            starCount = starCount+2;
            spaceCount--;
            System.out.println("");

        }
    }
    
    // way one
    public void printDoublePyramid(){
        int starCount = 1;
        int spaceCount = this.count;

        for(int i=0;i<this.count;i++){

            // printing spaces
            for(int j=spaceCount;j>0;j--){
                System.out.print(" ");
            }

            // printing stars
            for(int k=0;k<starCount;k++){
                System.out.print("*");
            }

            starCount = starCount+2;
            spaceCount--;
            System.out.println("");

        }

        spaceCount = 1;
        starCount = starCount-2;

        for(int i=0;i<this.count;i++){
            starCount = starCount-2;
            spaceCount++;
            
            // printing spaces
            for(int j=spaceCount;j>0;j--){
                System.out.print(" ");
            }
            
            // printing stars
            for(int k=0;k<starCount;k++){
                System.out.print("*");
            }
            
            System.out.println("");

        }
    }

    public void printSnake(){
        for(int i=0;i<this.count;i++){
            if(i%2 == 0){
                System.out.println("  * *");
            }
            else{
                System.out.println("   * *");
            }
        }
    }
}