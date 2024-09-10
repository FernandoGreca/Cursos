import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        Set<Integer> a = new HashSet<>();
        Set<Integer> b = new HashSet<>();
        Set<Integer> c = new HashSet<>();

        System.out.print("How many students for course A? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            a.add(sc.nextInt());
        }

        System.out.print("How many students for course B? ");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            b.add(sc.nextInt());
        }

        System.out.print("How many students for course C? ");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            c.add(sc.nextInt());
        }

        Set<Integer> set = new HashSet<>(a);
        set.addAll(b);
        set.addAll(c);


        System.out.println("Total Students: " + set.size());

        sc.close();
    }
}
