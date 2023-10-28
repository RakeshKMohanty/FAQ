class Super{
    public int i =0;
    public Super(String text){
        i =1;
    }
}
public class MCQ extends Super {
    public MCQ(String text) {
        super(text);
        i =2;
    }

    /*void testMethod(){
        throw new RuntimeException(new Exception("It is a new Exception"));
    }*/

    public static void main(String[] args) {
        MCQ mcq = new MCQ("Hello");
        System.out.println(mcq.i);

    }
}
