public class Mouter {
    private int m = (int) (Math.random()*100);
 
    public void go(int x, final int y) {
        int a = x + y;
        final int b = x - y;

        class MInner {
            public void method() {
                System.out.println("m = " + m);
                System.out.println("x = " + x);
                System.out.println("y = " + y);
                System.out.println("a = " + a);
                System.out.println("b = " + b);
            }
        }

        MInner that = new MInner();
        that.method();
    } 
    public static void main(String[] args) throws Exception {
        Mouter that = new Mouter();
        that.go((int)(Math.random()*100), (int)(Math.random()*100));
    }
}
