public class Main {
    public static void main(String[] args) {
        System.out.println("Привет Мир!");

        byte box = 5;
          System.out.println("Значение переменной с типом byte равно " + box );
        short container = 10;
          System.out.println("Значение переменной с типом short равно " + container);
        int stock = 50;
          System.out.println("Значение переменной с типом int равно " + stock);
        long hangar = 100;
          System.out.println("Значение переменной с типом long равно " + hangar);
        float boxWeight = 10.57F;
          System.out.println("Значение переменной с типом float равно " + boxWeight);
        double weightContainer = 22.85;
          System.out.println("Значение переменной с типом double равно " + weightContainer);

        float a = 27.12F;
        long b = 987678965549L;
        double c = 2.786;
        short d = 569;
        int e = -159;
        int f =  27897;
        byte g = 67;

        byte firstTeacher = 23;
        byte secondTeacher = 27;
        byte thirdTeacher = 30;
        short thirdGradePapers = 480;
        int allStudents = firstTeacher + secondTeacher + thirdTeacher;
        int sheetsForEveryone = thirdGradePapers / allStudents;
          System.out.println("На каждого ученика рассчитано по " + sheetsForEveryone + " листов бумаги");

        byte performance = 16;
        byte timeInterval = 2;
        int productivityMinutes = performance / timeInterval;
          System.out.println("Производительность машины в минуту " + productivityMinutes + " штук бутылок");
        int timeIntervalA = productivityMinutes * 20;
          System.out.println("За 20 минут машина произвела " + timeIntervalA + " штук бутылок");
        int productivityPerHour = timeIntervalA * 3;
        int productivityPerDay = productivityPerHour * 24;
          System.out.println("В сутки машина произвела " + productivityPerDay + " штук бутылок");
        int productivityThreeDay = productivityPerDay * 3;
          System.out.println("За 3 дня машина произвела " + productivityThreeDay + " штук бутылок");
        int productivityPerMonth = productivityPerDay * 30;
          System.out.println("За месяц машина произвела " + productivityPerMonth + " штук бутылок");

        byte totalCans = 120;
        byte brownCansPerClass = 4;
        byte whiteCansPerClass = 2;
        int totalCansPerClass = brownCansPerClass + whiteCansPerClass;
        int totalClasses = totalCans / totalCansPerClass;
        int totalBrown = totalClasses * brownCansPerClass;
        int totalWhite = totalClasses * whiteCansPerClass;
          System.out.println("В школе, где " + totalClasses + " классов, нужно " + totalWhite + " банок белой краски и " + totalBrown + " банок коричневой краски");

        byte banana = 80;
        byte milk = 105;
        byte iceCream = 100;
        byte egg = 70;
        int totalBananas = banana * 5;
        int totalMilk = milk * 2;
        int totalIceCream = iceCream * 2;
        int totalEggs = egg * 4;
        int totalWeightProducts = totalBananas + totalMilk + totalIceCream + totalEggs;
          System.out.println("Общее колличество завтрака " + totalWeightProducts + " граммов");
        float productsKilograms = totalWeightProducts  / 1000F;
          System.out.println("Общее количество завтрака " + productsKilograms + " кг");

        byte needResetKilo = 7;
        int needResetGtamm = needResetKilo * 1000;
        short gramm_A = 250;
        short gramm_B = 500;
        int diet_A = needResetGtamm / gramm_A;
          System.out.println("При первой диете вернуться в весовую категорию удасться за " + diet_A + " дней");
        int diet_B = needResetGtamm / gramm_B;
          System.out.println("При второй диете вернуться в весовую категорию удасться за " + diet_B + " дней");

        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryChristina = 76230;
        double annualIncomeMasha = salaryMasha * 12;
        double annualIncomeDenis = salaryDenis * 12;
        double annualIncomeChristina = salaryChristina * 12;
        double increaseMasha = salaryMasha * 1.1;
        double increaseDenis = salaryDenis * 1.1;
        double increaseChristina = salaryChristina * 1.1;
        double incomeAfterIncreaseMasha = increaseMasha * 12;
        double incomeAfterIncreaseDenis = increaseDenis * 12;
        double incomeAfterIncreaseChristina = increaseChristina * 12;
        double totalIncomeMasha = incomeAfterIncreaseMasha - annualIncomeMasha;
        double totalIncomeDenis = incomeAfterIncreaseDenis - annualIncomeDenis;
        double totalIncomeChristina = incomeAfterIncreaseChristina - annualIncomeChristina;
          System.out.println("Маша теперь получает " + increaseMasha + " рублей. Годовой дохот вырос на " + totalIncomeMasha + " рублей" );
          System.out.println("Денис теперь получает " + increaseDenis + " рублей. Годовой доход вырос на " + totalIncomeDenis + " рублей");
          System.out.println("Кристина теперь получает " + increaseChristina + " рублей. Годовой доход вырос на " + totalIncomeChristina + " рублей");





















    }
}