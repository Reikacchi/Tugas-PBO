
 class Luar {
    private String outerVariable = "Variabel luar";

    class Dalam {
        String innerVariable = "Variabel dalam";

        public void bicara() {
            System.out.println(innerVariable);
            System.out.println(outerVariable);
        }
    }
}
public class App {
    public static void main(String[] args) throws Exception {
        Luar l = new Luar();
        Luar.Dalam d = l.new Dalam();

        d.bicara();
    }
}
