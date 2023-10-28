public class Child extends Parent {

    int i = 21;
    int j = 22;

    public void methodshow() {
        j = 221;
        System.out.println("In Childmethod");
        System.out.println("Child i: "+i);
        System.out.println("Child j: "+j);
    }
}
