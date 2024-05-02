import java.io.IOException;
import java.util.Scanner;


        public class Main {
            public static void main(String[] args) {
                Scanner scanner = new Scanner(System.in);

                System.out.print("RAKAM VE SAYIYI GİRİNİZ:");
                while (scanner.hasNext()) {
                    String a = scanner.next();
                    int x = scanner.nextInt();
                    System.out.printf("isim ve rakam :"+"%-5s%03d%n", a, x);
                }
                System.out.println();
            }
        }
