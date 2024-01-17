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
    }
}