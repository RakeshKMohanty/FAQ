

public class Abstractemployee {

    public static void main(String[] args) {
        Child child = new Child();
        Parent p = new Parent();
        //child = p;
        Parent parent = new Child();
        parent.methodshow();
        System.out.println(parent.i);
        System.out.println(parent.j);
    }


}
