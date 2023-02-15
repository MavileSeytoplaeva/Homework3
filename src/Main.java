import java.util.Locale;

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
        System.out.println("Задача 1");
        byte dog = 13;
        short cat = 25978;
        int frog = 68908;
        long horse = 974634523L;
        float rabbit = 5.8375f;
        double chicken = 14.5937854;
        System.out.println("Значение переменной dog с типом byte равно " + dog );
        System.out.println("Значение переменной cat с типом short равно " + cat );
        System.out.println("Значение переменной frog с типом int равно " + frog );
        System.out.println("Значение переменной horse с типом long равно " + horse );
        System.out.println("Значение переменной rabbit с типом float равно " + rabbit );
        System.out.println("Значение переменной chicken с типом double равно " + chicken );
    }

    public static void task2 () {
        System.out.println("Задача 2");
        float num1 = 27.12f;
        long num2 = 987678965549L;
        float num3 = 2.786f;
        short num4 = 569;
        short num5 = -159;
        short num6 = 27897;
        byte num7 = 67;
    }
    public static void task3 () {
        System.out.println("Задача 3");
        byte luda = 23;
        byte anna = 27;
        byte katya = 30;
        int students = luda + anna + katya;
        int oneStudent = 480 / students;
        System.out.println("На каждого ученика расчитано " + oneStudent + " листов бумаги.");
    }
    public static void task4 () {
        System.out.println("Задача 4");
        byte machinePerformancePerMinute = 16 / 2;
        int bottles1 = machinePerformancePerMinute * 20;
        System.out.println("За 20 минут машина произвела " + bottles1 + " штук бутылок.");

        int machinePerformancePerHour = machinePerformancePerMinute * 60;
        int bottlesOneDay = machinePerformancePerHour * 24;
        System.out.println("За сутки машина произвела " + bottlesOneDay + " штук бутылок.");

        int bottlesThreeDays = bottlesOneDay * 3;
        System.out.println("За 3 дня машина произвела " + bottlesThreeDays + " штук бутылок.");

        int bottlesOneMonth = bottlesOneDay * 31;
        System.out.println("За 1 месяц машина произвела " + bottlesOneMonth + " штук бутылок.");
    }
    public static void task5 () {
        System.out.println("Задача 5");
        int whiteColor = 2;
        int brownColor = 4;
        int cabinet = whiteColor + brownColor;
        int cabinets = 120 / cabinet;
        whiteColor = whiteColor * cabinets;
        brownColor = brownColor * cabinets;
        System.out.println("В школе, где " + cabinets + " классов, нужно " + whiteColor + " банок белой краски и " + brownColor + " банок коричневой краски.");
    }
    public static void task6 () {
        System.out.println("Задача 6");
        short bananas = 5 * 80;
        short milk = 2 * 105;
        short iceCream = 2 * 100;
        short eggs = 4 * 70;
        int breakfastGr = bananas + milk + iceCream + eggs;
        double breakfastKg = breakfastGr * 0.001;
        System.out.println("Вес такого спортзавтрака " + breakfastGr + " грамм или " + breakfastKg + " килограмм.");
    }
    public static void task7 () {
        System.out.println("Задача 7");
        short needToLoseGr = 7000;
        short eachDayMin = 250;
        short eachDayMax = 500;
        int willLoseMaxDays = needToLoseGr / eachDayMin;
        int willLoseMinDays = needToLoseGr / eachDayMax;
        int eachDayAverage = (eachDayMin+eachDayMax)/2;
        int willLoseAverageDays = needToLoseGr/eachDayAverage;

        System.out.println("Если спортсмен будет худеть по "+eachDayMin+" в день, то он похудеет за "+willLoseMaxDays+" дней.");
        System.out.println("Если спортсмен будет худеть по "+eachDayMax+" в день, то он похудеет за "+willLoseMinDays+" дней.");
        System.out.println("В среднем спортсмен может похудеть за "+willLoseAverageDays+" дней");

    }
    public static void task8 () {
        System.out.println("Задача 8");
        int mashaSalary = 67760;
        int denisSalary = 83690;
        int kristinaSalary = 76230;
        double percentIncrease = 1.1;

        double newMashaSalary = mashaSalary*percentIncrease;
        double newDenisSalary = denisSalary*percentIncrease;
        double newKristinaSalary = kristinaSalary*percentIncrease;

        byte year = 12;
        int annualMasha = mashaSalary*year;
        int annualDenis = denisSalary*year;
        int annualKristina = kristinaSalary*year;

        double newAnnualMasha = newMashaSalary*year;
        double newAnnualDenis = newDenisSalary*year;
        double newAnnualKristina = newKristinaSalary*year;

        double differenceMasha = newAnnualMasha-annualMasha;
        double differenceDenis = newAnnualDenis-annualDenis;
        double differenceKristina = newAnnualKristina-annualKristina;

        System.out.printf(Locale.US,"Маша теперь получает %.2f рублей. Годовой доход вырос на %.2f рублей.%n",newMashaSalary, differenceMasha);
        System.out.printf(Locale.US,"Денис теперь получает %.2f рублей. Годовой доход вырос на %.2f рублей.%n",newDenisSalary, differenceDenis);
        System.out.printf(Locale.US,"Кристина теперь получает %.2f рублей. Годовой доход вырос на %.2f рублей.%n",newKristinaSalary, differenceKristina);

    }
}