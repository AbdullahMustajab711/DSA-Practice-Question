public class swapping{
    public static void main(String[]args){
        int[] a = {12,34,54,65,34};
        int[] b = {23,90,23,55,45};
        int temp;
        
        
        for(int i = 0; i < 5;i++){
            temp = a[i];
            a[i] = b[i];
            b[i] = temp;
        }

        System.out.print("First Array printed: ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        System.out.print("Second Array printed: ");
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
        
    }
}