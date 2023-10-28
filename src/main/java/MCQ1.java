import java.math.BigDecimal;
import java.util.Optional;
import java.util.stream.IntStream;

public class MCQ1 {


   /* public void print() {
        int i;
        System.out.println("THE NUMBER is i: " + i);
    }*/

    public static void sum(int i) {
      //  System.out.println("i : " + i);
    }

    public static BigDecimal sum(BigDecimal i){
        return i.add(BigDecimal.valueOf(4));
    }

    public static void main(String[] args) throws Exception {
        MCQ1 mcq1 = new MCQ1();
        //mcq1.print();
        BigDecimal sum = new BigDecimal("1");
        sum = sum(sum);
        //System.out.println("sum = "+sum);
       /* int result,x;
        x=1;
        result =0;
        while(x<=10){
            if(x%2 == 0)
                result +=x;
            ++x;
        }
        System.out.println(result);*/
        /*char[] a = new char[10];
        for(int i=0; i<10; ++i){
            a[i] = '1';
            System.out.println(a[i]+"");
            i++;
        }*/
        /*int i=1;
        i++;
        increment(i);
        System.out.println("i = "+i);*/

        /*Optional.of(24)
                .filter(v->v%4==0)
                .map(v-> {System.out.println(v);return v/2;})
                .filter(s->s!=0)
                .map(s->s/6)
                .map(s-> {System.out.println(s);return s;})
                .orElseThrow(()->new Exception("data Error"));*/
        /*IntStream.range(1,10)
                .filter(i -> {
            System.out.println("1");
            return i%2 == 0;
        })
                .filter(i->{
                    System.out.println("0");
                    return i>3;
                }).limit(1)
                .forEach(i-> System.out.println(i));*/
        /*IntStream.of(1,1,3,3,7,6,7)
                .distinct()
                .parallel()
                .map(i->i*2)
                .sequential()
                .forEach(System.out::print);*/

        /*try{
            badMethod();
            System.out.println("A");
        }
        catch (Exception ex){
            System.out.println("B");
        }
        finally {
            System.out.println("C");
        }*/
       // System.out.println("D");



    }

   /* public static void badMethod() {
        throw new Error();
    }*/

    private static void increment(int i) {
        i=i+2;
    }
}
