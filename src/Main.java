public class Main {
    public static void main(String[] args) {
        System.out.println("Задача 1");
        int age = 16;
        if (age >= 18){
            System.out.println("Если возраст человека " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека " + age + ", то он не достиг совершенолетия, нужно немного подождать");
        }

        System.out.println("Задача 2");
        int temperature = 3;
        if (temperature < 5){
            System.out.println("На улице " + temperature+ " градусов, нужно надеть шапку!");
        } if (temperature > 5){
            System.out.println("На улице " + temperature + " градусов, можно идти без шапки!");
        }

        System.out.println("Задача 3");
        double speed = 60.7;
        if (speed > 60){
            System.out.println("Если скорость " + speed + " то придеться заплатить штраф!");
        } else {
            System.out.println("Если скорость " + speed + " можно ездить спокойно!");
        }

        System.out.println("Задача 4");
        int ageMan = 7;
        if (ageMan >= 2 && ageMan < 6){
            System.out.println("Если возраст человека " + ageMan + ", ему нужно ходить в детский сад");
        } if (ageMan >= 7 && ageMan <= 17){
            System.out.println("Если возраст человека " + ageMan + ", ему нужно ходить в школу");
        } else if (ageMan >= 18 && ageMan <= 24){
            System.out.println("Если возраст человека " + ageMan + ", ему нужно ходить в университет");
        } else if (ageMan > 24){
            System.out.println("Если возраст человека " + ageMan + ", ему нужно ходить на работу");
        }

        System.out.println("Задача 5");
        int childAge = 3;
        if (childAge < 5){
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему нельзя кататься на аттракционе");
        } if (childAge >= 5 && childAge < 14){
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        } else if (childAge >= 14) {
            System.out.println("Если возраст ребенка равен " + childAge + ", то ему можно кататься на аттракционе без сопровождения");
        }

        System.out.println("Задача 6");
        int capaсityCarriage = 60;
        int totalCapacity = 102;
        int seatPlace = 60;
        if (capaсityCarriage < seatPlace && capaсityCarriage < totalCapacity){
            System.out.println("В вагоне есть и сидячие, и стоячие места");
        } else if (capaсityCarriage >= seatPlace && capaсityCarriage < totalCapacity){
            System.out.println("В вагоне есть только стоячие места");
        } else {
            System.out.println("В вагоне нет мест");
        }
        System.out.println("Задача 7");
        int one = 45;
        int two = 34;
        int three = 48;
        if (one > two && three < one){
            System.out.println(one);
        } else if (two > three && one < two){
            System.out.println(two);
        } else if (three > two && three > one){
            System.out.println(three);
        }






    }
}