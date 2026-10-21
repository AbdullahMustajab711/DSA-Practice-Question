public class wrapper{
    public static void main(String[]args){
        int a = 45;
        Integer obj1 = a;
        
        double b = 399;
        Double obj2 = b;

        char ch = 'A';
        Character obj3 = ch;

        boolean bool = true;
        Boolean obj4 = bool;

        System.out.println("Integer object: " + obj1);
        System.out.println("Double object: " + obj2);
        System.out.println("Character object: " + obj3);
        System.out.println("Boolean object: " + obj4);

        System.out.println(obj1.getClass());
        System.out.println(obj2.getClass());
        System.out.println(obj3.getClass());
        System.out.println(obj4.getClass());

    }
}