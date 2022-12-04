import java.util.Objects;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }


    public static void task1 () {
        System.out.println("\nЗадача 1");
        byte a = 100;
        System.out.println(a);
        short b = 10000;
        System.out.println(b);
        int c = 100000000;
        System.out.println(c);
        long d = 1000000000;
        System.out.println(d);
        float e = (-2.4F);
        System.out.println(e);
        double f = 6.7;
        System.out.println(f);


    }
    public static void task2 () {
        System.out.println("\nЗадача 2");

        double a = 27.12;
        long b = 987678965549L;
        float c = 2.786f;
        short d = 569;
        short e = -159;
        short f = 27897;
        byte g = 67;
        System.out.println(a+b+c+d+e+f+g);

    }
    public static void task3 () {
        System.out.println("\nЗадача 3");

        byte a = 23;
        byte b = 27;
        byte c = 30;
        int all = (a + b + c);
        short paper = 480;
        int limPaper = paper / all;
        System.out.println("На каждого ученика рассчитано " + limPaper + " листов бумаги");
    }

    public static void task4 () {
        System.out.println("\nЗадача 4");

        byte productivity = 8;

        byte minutes = 20;
        int a = productivity * minutes;
        System.out.println("За " + minutes + " минут машина произвела " + a + " бутылок");

        int day = 1;
        day = day * 24 * 60;
        int b = day / productivity;
        System.out.println("За " + day + " дней машина произвела " + b + " бутылок");

        int threeDays = 3;
        threeDays = threeDays * 3;
        int c = threeDays / productivity;
        System.out.println("За " + threeDays + " дней машина произвела " + c + " бутылок");

        int month = day * 30;
        int d = month / productivity;
        System.out.println("За " + month + " месяц машина произвела " + d + " бутылок");
    }

    public static void task5() {
        System.out.println("\nЗадача 5");
        byte allCans = 120;
        byte whiteCans = 2;
        byte brownCans = 4;

        int rooms = allCans / (whiteCans + brownCans);
        int allWhiteCans = rooms * whiteCans;
        int allBrownCans = brownCans * rooms;

        System.out.println("В школе, где " + rooms + " классов, нужно " + allWhiteCans + " банок белой краски и " + allBrownCans + " банок коричневой краски");
    }


    public static void task6() {
            System.out.println("\nЗадача 6");

            byte banana = 5;
            byte bananaWeight = 80;
            double milk = 200;
            byte milkWeight = 105;
            byte iceCream = 2;
            byte iceCreamWeight = 100;
            byte egs = 4;
            byte egsWeight = 70;
            milk = milk / milkWeight;

            double mix = banana * bananaWeight + milk * milkWeight + iceCream * iceCreamWeight + egs * egsWeight;
        System.out.println( "Вес коктеля в граммах составил " + mix);
        System.out.println( "Вес коктеля в килограммах составил " + ( mix / 1000 ));

    }
    public static void task7 () {
        System.out.println("\nЗадача 7");
        int weight = 7;
        weight =weight * 1000;
        short loseWeight250 = 250;
        short loseWeight500 = 500;

        int days = weight / loseWeight250;
        System.out.println("Для того чтобы похудеть на " + (weight / 1000) + " кг сбрасывая по " + loseWeight250 + " грамм нужно потратить " + days  + " дней" );

        days = weight / loseWeight500;
        System.out.println("Для того чтобы похудеть на " + (weight / 1000) + " кг сбрасывая по " + loseWeight500 + " грамм нужно потратить " + days  + " дней" );

        days = (weight / loseWeight250 + weight / loseWeight500) / 2;
        System.out.println("Для того чтобы похудеть на " + (weight / 1000) + " кг, любым из этих способов, нужно потратить " + days  + " дня" );



    }

    public static void task8 () {
        System.out.println("\nЗадача 8");

        while (true) {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите имя работника или Стоп");
            var name = in.next();
            if (!Objects.equals(name, "Стоп")) {

                Scanner in1 = new Scanner(System.in);
                System.out.println("Введите зарплату в месяц");
                int monthSalary = in1.nextInt();

                Scanner in2 = new Scanner(System.in);
                System.out.println("Введите стаж работы в годах");
                byte workingTime = in2.nextByte();

                int salaryPerYear = monthSalary * 12;
                float salaryIncrease = 1.1F;

                if (workingTime >= 3) {
                    double monthSalaryNew = monthSalary * salaryIncrease;
                    System.out.println("Зарплату " + name + " повысили и теперь она будет составлять " + monthSalaryNew + " рублей в месяц");
                    System.out.println("По сравнению с прошлым годом наши расходы на оплату труда за год увеличатся на " + (monthSalaryNew * 12 - salaryPerYear));
                } else {
                    System.out.println("Зарплата остаётся " + monthSalary);

                }
            } else {
                System.out.println("Конец цикла");
                break;
            }
        }













    }


}

