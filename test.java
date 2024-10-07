import Src.pancakeFlip;

public class test {
    public static void main(String[] args) {
        pancakeFlip P = new pancakeFlip();
        //test stack geneartion
        System.out.println("test stack generation"); 
        int[] test = P.generate(15);
        for(int i = 0; i < test.length; i++){
            System.err.print(test[i] + " ");
        }
        //test stack flip methodology
        System.err.println("\nTest flip");
        test= P.flip(test,4);
        for(int i = 0; i < test.length; i++){
            System.err.print(test[i] + " ");
        }
        //test pancakeSort
        System.err.println("\n Test Sort");
        test = P.pancakeSort(test);
        for(int i = 0; i < test.length; i++){
            System.err.print(test[i] + " ");
        }
    }    
}
