public class polymorphism {
    public static int add(int a , int b) {
        return a + b;
    }
    public static double add(double a , double b) {
        return a + b;
    }
    public static void main(String[] args) {
        int a = 1,b = 2;
        double c = 23.2,d = 34.4;
        int ans = add(a,b);
        double ans1 = add(c,d);
        System.out.println(ans);
        System.out.println(ans1);
    }
}
