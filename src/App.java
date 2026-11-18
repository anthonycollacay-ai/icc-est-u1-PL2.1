//import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        long nanoTime = System.nanoTime();
        long currentTimeMillis = System.currentTimeMillis();
        System.out.println("Nano Time: " + nanoTime);
        System.out.println("Current Time (ms): " + currentTimeMillis);

        Generador g = new Generador();
        List<Integer> list = Generador.generate(100);
        System.out.println(list);
    }
}