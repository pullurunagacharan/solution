1. public class Bitwiseoperators {

	public static void main(String[] args) {
		int a=3,b=2,c=4;
		System.out.println(a&b&c);
		System.out.println(a|b|c);
		System.out.println(a^b^c);
                system.out.println(a<<b>>c);
                }
               }

2. 
   public class UnaryExpressions {
    public static void main(String[] args) {
        int x = 2;
        int y = ++x;
        int z = x++ + ++y;
        int m = x++ + ++x + y++ - z--;

        System.out.println("x: " + x);
        System.out.println("y: " + y);
        System.out.println("z: " + z);
        System.out.println("m: " + m);
    }
}

