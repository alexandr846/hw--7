public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println();
        System.out.println("Задача-1");
        double total = 0;
        int deposite = 15000;
        double percentPerMonth = 1.01;
        int Month = 1;
        while (total < 2_459_000) {
            total = (total + deposite) * percentPerMonth;
            System.out.printf("«Месяц %s,сумма накоплений равна %.2f рублей»%n", Month, total);
            Month++;
        }
        System.out.println();
        System.out.println("Задача-2");
        int conter = 0;
        while (conter < 10) {
            conter++;
            System.out.print(conter + " ");
        }
        System.out.println();
        for (; conter >= 1; conter--) {
            System.out.print(conter + " ");
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
            System.out.printf("«Год %s,численность населения составляет %s%n", year, population);
        }
        System.out.println();
        System.out.println("Задача-4");
        double vasyPercent = 1.07;
        double vasyDeposite = 15000;
        int vasyMonth = 1;
        while (vasyDeposite < 12_000_000) {
            vasyDeposite *= vasyPercent;
            System.out.printf("Месяц %s депозит составит: %.2f%n", vasyMonth, vasyDeposite);
            vasyMonth++;

        }
        System.out.println();
        System.out.println("Задача-5");
        double vasyPercent1 = 1.07;
        double vasyDeposite1 = 15000;
        int vasyMonth1 = 1;
        while (vasyDeposite1 < 12_000_000) {
            vasyDeposite1 *= vasyPercent1;
            if (vasyMonth1 % 6 == 0)
                System.out.printf("Месяц %s депозит составит: %.2f%n", vasyMonth1, vasyDeposite1);
            vasyMonth1++;

        }
        System.out.println();
        System.out.println("Задача-6");
        vasyPercent1 = 1.07;
        vasyDeposite1 = 15000;
        vasyMonth1 = 1;
        int targetMonthsAmount = 9 * 12;
        for (int i = 1; i <= targetMonthsAmount; i++) {
            vasyDeposite1 *= vasyPercent1;
            if (i % 6 == 0)
                System.out.printf("Месяц %s депозит составит: %.2f%n", i, vasyDeposite1);

        }
        System.out.println();
        System.out.println("Задача-7");
        int friday = 3;
        for (int i = 1; i < 31; i++) {
            if (i == friday || (i - friday) % 7 == 0) {
                System.out.printf("«Сегодня пятница,%s-eчисло. Необходимо подготовить отчет»%n", i);
            }
        }
        System.out.println();
        System.out.println("Задача-8");
        int period = 79;
        int curentYear = 2024;
        int lowerBound = curentYear - 200;
        int uperBound = curentYear + 100;
        for (int i = 0; i < uperBound; i += period) {
            if (i > lowerBound) {
                System.out.println(i);
            }

        }


    }

}
