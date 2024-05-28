public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println();
        System.out.println("Задача-1");
        double total = 0;
        int deposite = 15000;
        double percentPerMonth = 1.01;
        int month = 1;
        while (total < 2_459_000) {
            total = (total + deposite) * percentPerMonth;
            System.out.printf("«Месяц %s,сумма накоплений равна %.2f рублей»%n", month, total);
            month++;
        }
        System.out.println();
        System.out.println("Задача-2");
        int counter = 0;
        while (counter < 10) {
            counter++;
            System.out.print(counter + " ");
        }
        System.out.println();
        for (; counter >= 1; counter--) {
            System.out.print(counter + " ");
        }
        System.out.println();
        System.out.println("Задача-3");
        int birthRate;
        int mortalityRate;
        int population = 12_000_000;
        for (int year = 1; year <= 10; year++) {
            birthRate = population / 1000 * 17;
            mortalityRate = population / 1000 * 8;
            population += birthRate - mortalityRate;
            System.out.println(" « Год " + year + " численность населения составляет " + population + "»");
        }
        System.out.println();
        System.out.println("Задача-4-5");
        double vasyPercent = 1.07;
        double vasyDeposite = 15000;
        int vasyMonth = 1;
        while (vasyDeposite < 12_000_000) {
            vasyDeposite *= vasyPercent;
            if (vasyMonth % 6 == 0) {
                System.out.printf("Month %s : deposite: %.2f%n", vasyMonth, vasyDeposite);
            }
            vasyMonth++;
        }

        System.out.println();
        System.out.println("Задача-6");
        vasyPercent = 1.07;
        vasyDeposite = 15000;
        vasyMonth = 1;
        int targetMonthsAmount = 9 * 12;
        for (
                int i = 1;
                i <= targetMonthsAmount; i++) {
            vasyDeposite *= vasyPercent;
            if (i % 6 == 0)
                System.out.printf("Месяц %s депозит составит: %.2f%n", i, vasyDeposite);

        }
        System.out.println();
        System.out.println("Задача-7");
        int friday = 2;
        for (
                int i = 1;
                i < 31; i++) {
            if (i == friday || (i - friday) % 7 == 0) {
                System.out.printf("«Сегодня пятница,%s-eчисло. Необходимо подготовить отчет»%n", i);// В результате у вас должно получиться от 4 до 5 сообщений с напоминаниями по разным датам.


            }
        }
        System.out.println();
        System.out.println("Задача-8");
        int period = 79;
        int curentYear = 2024;
        int lowerBound = curentYear - 200;
        int uperBound = curentYear + 100;
        for (
                int i = 0;
                i < uperBound; i += period) {
            if (i > lowerBound) {
                System.out.println(i);// проверил все выводится корректно.

            }
        }
    }
}


























