import java.util.Scanner;
public class HurricaneSpeed {
    public static void main(String[] args) {
        System.out.println("Enter the speed: ");
        Scanner keybd = new Scanner(System.in);
        int speed;
        speed = keybd.nextInt();

    if  ((speed >= 74) && (speed <= 95)) {
        System.out.println("Category 1");
    }
    else if ((speed >= 96) && (speed <= 110)) {
        System.out.println("Category 2");
    } else if ((speed >= 111) && (speed <= 129)) {
        System.out.println("Category 3");
    }
    else if ((speed >= 130) && (speed <= 156)) {
        System.out.println("Category 4");
    }
    else if (speed >= 157) {
        System.out.println("Category 5");
    } else {
        System.out.println("too weak");
     }
    }
}
