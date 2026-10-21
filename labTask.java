public class labTask{
    public static void main(String[] args){
        String s1 = "Java";
        String s2 = "Programming Language";
        String s3 = "Hello World";
        
        String s4 = new String("Java");
        String s5 = new String("Python");

        System.out.println("Value of s1: " + (s1));
        System.out.println("Value of s2: " + (s2));
        System.out.println("Value of s3: " + (s3));
        System.out.println("Value of s4: " + (s4));
        System.out.println("Value of s5: " + (s5));

        String Java_1 = s4.intern();

        System.out.println("Compared value before intern: " + (s1 == s4));
        System.out.println("Compared value after intern: " + (s1 == Java_1));

        // ----------------------------------------------------------------------

        // double a = 25;
        // Double b = a;
        // String c = b.toString();
        
        // System.out.println("The value of Double is: " + (b));
        // System.out.println("Convert Double into String is: " + (c));    
        

        // -----------------------------------------------------------------------

        String concate = s1 + " + " + s2 + " + " + s3 + " + " + s4 + " + " + s5; 

        System.out.println("Concatenated String is: " + (concate));

        System.out.println(s1.toUpperCase());
        System.out.println(s2.toUpperCase());
        System.out.println(s3.toUpperCase());
        System.out.println(s4.toUpperCase());

        System.out.println("Substring is: " + 
        concate.substring(7 , 18));

    }
}