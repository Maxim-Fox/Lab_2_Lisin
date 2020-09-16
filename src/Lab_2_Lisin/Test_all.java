package Lab_2_Lisin;
import java.lang.*;
public class Test_all {
    public static void main(String[] args) {
        Ball b1 = new Ball(100, 100);
        System.out.println(b1);
        b1.move (30, 45);
        System.out.println(b1);
        System.out.println("-------------------------------");
        Ball b2 = new Ball (500, 0);
        System.out.println(b2);
        b2.move ( -50, 11);
        System.out.println(b2);
        System.out.println("-------------------------------");
        Ball b3 = new Ball ( -111, -3);
        System.out.println(b3);
        b3.move (50, 6);
        System.out.println(b3);
        System.out.println("-------------------------------");

        Author a1 = new Author("Jack", "Jack@mail.ru", 'm');
        System.out.println(a1.toString());
        Author a2 = new Author("Alexander","Alexander_Kryg@dmail.ru", 'm');
        System.out.println(a2.toString());
        Author a3 = new Author("Maximilian", "Maximilian_Velikii@gmail.com",'m');
        System.out.println(a3.toString());
    }
}

