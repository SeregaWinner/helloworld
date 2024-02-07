public class Main {
    public static void main(String[] args) {
        System.out.println("Привет Мир!");
        System.out.println("Hello World!");

        var dog = 8.0;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper = paper + 4;
        System.out.println(paper);
        dog = dog - 3.5;
        System.out.println(dog);
        cat = cat - 1.6;
        System.out.println(cat);
        paper = paper - 7639;
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var firstFighter = 78.2;
        var secondFighter = 82.7;
        var totalWeightFighter = firstFighter + secondFighter;
        System.out.println("Общая масса бойцов равна " + totalWeightFighter + "кг");
        var massDifferenceFighter = secondFighter - firstFighter;
        System.out.println("Разница в массе между бойцами равна " + massDifferenceFighter + "кг");
        var massDifference = (secondFighter + firstFighter) % firstFighter;
        System.out.println("Разница в массе при остатке деления " + massDifference + "кг");

        var totalOperatingTime = 360;
        var timeAlone = 8;
        var totalStaff = totalOperatingTime / timeAlone;
        System.out.println("Всего работников в компании - " + totalStaff + "человек");
        totalStaff = totalStaff + 94;
        totalOperatingTime = totalStaff * timeAlone;
        System.out.println("Если в компании работает " + totalStaff + " человек, то всего " + totalOperatingTime + " часов работы может быть поделено между сотрудниками");

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

        float numberA = 27.12F;
        long numberB = 987678965549L;
        double numberC = 2.786;
        short numberD = 569;
        int numberE = -159;
        int numberF =  27897;
        byte numberG = 67;

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
        short grammA = 250;
        short grammB = 500;
        int dietA = needResetGtamm / grammA;
          System.out.println("При первой диете вернуться в весовую категорию удасться за " + dietA + " дней");
        int dietB = needResetGtamm / grammB;
          System.out.println("При второй диете вернуться в весовую категорию удасться за " + dietB + " дней");
        float dayMidle = ((dietA + dietB)/100f)*50;
          System.out.println("При чередовании диеты вернуться в весовую категорию удасться " + dayMidle + " день");

        int salaryMasha = 67760;
        int salaryDenis = 83690;
        int salaryChristina = 76230;
        int interestRate = 10;
        double annualIncomeMasha = salaryMasha * 12;
        double annualIncomeDenis = salaryDenis * 12;
        double annualIncomeChristina = salaryChristina * 12;
        double increaseMasha = (annualIncomeMasha / 100)* interestRate;
        double increaseDenis = (annualIncomeDenis/100)* interestRate;
        double increaseChristina = (annualIncomeChristina /100)* interestRate;
        double incomeAfterIncreaseMasha = increaseMasha * 12;
        double incomeAfterIncreaseDenis = increaseDenis * 12;
        double incomeAfterIncreaseChristina = increaseChristina * 12;
        double totalIncomeMasha = incomeAfterIncreaseMasha - annualIncomeMasha;
        double totalIncomeDenis = incomeAfterIncreaseDenis - annualIncomeDenis;
        double totalIncomeChristina = incomeAfterIncreaseChristina - annualIncomeChristina;
          System.out.println("Маша теперь получает " + increaseMasha + " рублей. Годовой дохот вырос на " + totalIncomeMasha + " рублей" );
          System.out.println("Денис теперь получает " + increaseDenis + " рублей. Годовой доход вырос на " + totalIncomeDenis + " рублей");
          System.out.println("Кристина теперь получает " + increaseChristina + " рублей. Годовой доход вырос на " + totalIncomeChristina + " рублей");

        System.out.println("Задание 1");
        int clientOS = 1;
        int clientiOS = 0;
        int clientAndroid = 1;
        if (clientiOS == clientOS) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientAndroid == clientOS) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println("Задание 2");
        int clientDeviceYear = 2016;
        int frontier = 2015;
        if (clientOS == clientiOS && clientDeviceYear < frontier) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }
        if (clientOS == clientiOS && clientDeviceYear >= frontier) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == clientAndroid && clientDeviceYear < frontier) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientOS == clientAndroid && clientDeviceYear >= frontier) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        System.out.println("Задание 3");
        int year = 1585;
        int a = year % 400;
        int b = year % 100;
        int c = year % 4;
        if (year < 1584){
            System.out.println("До 1584 понятие високосного года не существовало!");
        }else if ((year >= 1584 && c == 0 && b != 0) ||(year > 1584 && a == 0)){
            System.out.println(year + " год является високосным!");
        } else {
            System.out.println(year + " год не являеться високосным");
        }

        System.out.println("Задание 4");
        int deliveriDistance = 105;
        int intervalA = 20;
        int intervalB = intervalA + 40;
        int intervalC = intervalB + 40;
        int dayA = 1;
        int dayB = 2;
        int dayC = 3;
        if (deliveriDistance <= intervalA) {
            System.out.println("Потребуется дней: " + dayA);
        }
        if (deliveriDistance > intervalA && deliveriDistance <= intervalB) {
            System.out.println("Потребуется дней: " + dayB);
        } else if (deliveriDistance > intervalB && deliveriDistance < intervalC) {
            System.out.println("Потребуется дней: " + dayC);
        } else {
            System.out.println("Доставка не осуществляется");
        }

        System.out.println("Задание 5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
            case 2:
            case 12:
                System.out.println("Зимний месяц");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весенний месяц");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Летний месяц");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осенний месяц");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }
    }
}