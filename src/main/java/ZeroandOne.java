public class ZeroandOne {
    public static void arrangeZerondOne(int[] input){
        int right = input.length-1;
        for(int i =0;i<=input.length-1 ;i++){
            if(input[i] == 1){
                for (int k =right; k>=i;k--){
                    if(input[k]==0){
                        int temp = input[k];
                        input[k] = input[i];
                        input[i] = temp;
                    }
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] input = {1,0,0,0,1,1,1,0,0,1,1,0,1};
        int[] input1 = {1,1,1,1,1,0};
        int[] input2 = {0,0,0,0,0,1};
        arrangeZerondOne(input1);
        for (int i : input1) {
            System.out.print(" "+i);
        }
    }
}
