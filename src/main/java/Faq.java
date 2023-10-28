import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Faq {

    List<Integer> list = new ArrayList<>();
   public boolean addElement(int element){

       if(!list.contains(element))
       {
           list.add(element);
           Collections.sort(list);
           return true;
       }
       return false;
    }

    public int removeElement(int element){

       if(list.contains(element))
       {
           int i = list.indexOf(element);
           Integer remove = list.remove(i);
           Collections.sort(list);
           return 1;
       }
       return 0;
    }
    public static void main(String[] args) {

       Faq setImplement = new Faq();
       setImplement.addElement(21);
       setImplement.addElement(14);
        setImplement.addElement(24);
        setImplement.addElement(15);
        setImplement.addElement(111);
        setImplement.addElement(10);
        setImplement.addElement(9);
        setImplement.addElement(34);

        setImplement.addElement(15);
        setImplement.removeElement(15);
        setImplement.list.forEach(element -> System.out.printf(element+" "));

    }
}
