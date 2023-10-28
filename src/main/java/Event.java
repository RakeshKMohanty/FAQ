public class Event {
    public static void main(String[] args) {
        
        String s = "abcabcbb";

        System.out.println("firstuniquechar : "+firstUniqueCharachter("leetcode"));
        int length =1;
        /*for(int i=0;i<=s.length()-2;i++){
           // System.out.println(s.indexOf(s.charAt(i)));
           // s.in
            int newlength = 1;
            for(int j=i+1;j<s.length()-1;j++){

                if(s.charAt(i) == s.charAt(j)){
                    if(length < newlength)
                        length = newlength;
                    break;
                }
                newlength++;
            }
        }*/

        for (int i=0;i<=s.length()-2;i++){
            String newstring = String.valueOf(s.charAt(i));
            int newLength = 1;
            for(int j=i+1; j<= s.length()-1;j++){
                String charAtJ = String.valueOf(s.charAt(j));
                if(newstring.contains(charAtJ)) {
                    if(newLength > length)
                        length = newLength;
                    break;
                }
                newstring = newstring.concat(charAtJ);
                newLength++;
            }
        }
        System.out.println("length :"+length);
    }
    public static int firstUniqueCharachter(String input){
        char unique = '\u0000';
        int index =-1;
        for(int i=0;i<=input.length()-1;i++){
            char c = input.charAt(i);
            if(input.indexOf(c) == input.lastIndexOf(c)) {

               // unique = c;
                index = i;
                break;
            }
        }
        //return unique;
        return index;
    }
    
}
