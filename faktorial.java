import java.util.*;

public class faktorial {
    
    static long faktorial(int n) {
        long hasil = 1;
        for (int i = 1; i <= n; i++) {
            hasil *= i;
        }
        return hasil;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Program Hitung Faktorial");
        System.out.print("Masukkan bilangan positif: ");
        int n = in.nextInt();

        System.out.println("Faktorial dari " + n + " adalah: " + faktorial(n));
        in.close();
    }
}

    

