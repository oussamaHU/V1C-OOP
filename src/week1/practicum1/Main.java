package week1.practicum1;

public class Main {
    //opdracht1
    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            System.out.println(i);
        }

        // opdracht 2
        int count = 1;
        while (count < 11) {
            System.out.println(count);
            count++;
        }
        // opdracht 3
        for (double xCount = 0.0; xCount < 10; xCount++) {
            System.out.println(Math.random());
        }
        //opdracht 4
        int num = 39, sum = 0;
        for (int i = 0; i <= num; ++i) {
            // sum = sum + i;
            sum += i;
        }
        System.out.println(+sum);

        //opdracht 5
        for (int i = 0; i < 5; i++) {
            if (i % 2 == 0) {
                System.out.println("s");
            } else {
                System.out.println("ss");
            }


        }
    }
}

