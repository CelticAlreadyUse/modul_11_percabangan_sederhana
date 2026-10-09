package percabangan;
public class percabangan {
    public static void main(String[] args) {

        int x = 3,y = 5,z = 2,u = 3;

        System.out.println("x == u: " + (x == u));
        System.out.println("x != u: " + (x != u));
        System.out.println("!(x >= u) && (y != z): " + (!(x >= u) && (y != z)));
        System.out.println("(y == x) || (u > z): " + ((y == x) || (u > z)));
        System.out.println("x+2 < 10 && y-2 <5 || u +4 < z: " + (x+2 < 10 && y-2 <5 || u +4 < z));
    }
}
