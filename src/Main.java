public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        short age = 21;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        }
        short age1 = 13;
        if (age1 < 18) {
            System.out.println("Если возраст человека равен " + age1 + ", он не достиг совершеннолетия, нужно немного подождать");
        }


    }

    public static void task2 () {
        System.out.println("Задача 2");
        short temperature = -3;
        if (temperature < 5) {
            System.out.println("На улице " + temperature + " градуса, нужно надеть шапку");
        }
        short temperature1 = 8;
        if (temperature1 > 5) {
            System.out.println("На улице " + temperature1 + " градусов, можно идти без шапки");
        }

    }

    public static void task3 () {
        System.out.println("Задача 3");
        short speed = 62;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + " км/ч, то придется заплатить штраф");
        }
        short speed1 = 47;
        if (speed1 <= 60) {
            System.out.println("Если скорость " + speed1 + " км/ч, то можно ездить спокойно ");
        }

    }

    public static void task4 () {
        System.out.println("Задача 4");
        byte age = 3;
        if (age >= 2 && age <=6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        }
        else if (age >=7 && age <=18) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        }
        else if (age >18 && age <24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет");
        }
        else if (age >=24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу");
        }
        age = 11;
        if (age >= 2 && age <=6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        }
        else if (age >=7 && age <=18) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        }
        else if (age >18 && age <24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет");
        }
        else if (age >=24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу");
        }
        age = 20;
        if (age >= 2 && age <=6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        }
        else if (age >=7 && age <=18) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        }
        else if (age >18 && age <24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет");
        }
        else if (age >=24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу");
        }
        age = 25;
        if (age >= 2 && age <=6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        }
        else if (age >=7 && age <=18) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        }
        else if (age >18 && age <24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в университет");
        }
        else if (age >=24) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить на работу");
        }
    }

    public static void task5 () {
        System.out.println("Задача 5. Решение с else");
        byte age = 3;
        if (age <=5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на атракционе");
        }
        else if (age >5 && age <=14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на атракционе только в сопровождении взрослого");
        }
        else if (age >14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на атракционе без сопровождения взрослого");
        }
        age = 8;
        if (age <=5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на атракционе");
        }
        else if (age >5 && age <=14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на атракционе только в сопровождении взрослого");
        }
        else if (age >14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на атракционе без сопровождения взрослого");
        }
        age = 16;
        if (age <=5) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему нельзя кататься на атракционе");
        }
        else if (age >5 && age <=14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на атракционе только в сопровождении взрослого");
        }
        else if (age >14) {
            System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на атракционе без сопровождения взрослого");
        }
    }

    public static void task6 () {
        System.out.println("Задача 6");
        byte seatAvailable = 54;
        if (seatAvailable <=60) {
            System.out.println("В вагоне есть и сидячие, и стоячие места");
        }
        else if (seatAvailable >60 && seatAvailable <=102) {
            System.out.println("В вагоне есть только стоячие места");
        }
        else if (seatAvailable >102) {
            System.out.println("В вагоне нет свободных мест");
        }
        seatAvailable = 78;
        if (seatAvailable <=60) {
            System.out.println("В вагоне есть и сидячие, и стоячие места");
        }
        else if (seatAvailable >60 && seatAvailable <=102) {
            System.out.println("В вагоне есть только стоячие места");
        }
        else if (seatAvailable >102) {
            System.out.println("В вагоне нет свободных мест");
        }
        seatAvailable = 104;
        if (seatAvailable <=60) {
            System.out.println("В вагоне есть и сидячие, и стоячие места");
        }
        else if (seatAvailable >60 && seatAvailable <=102) {
            System.out.println("В вагоне есть только стоячие места");
        }
        else if (seatAvailable >102) {
            System.out.println("В вагоне нет свободных мест");
        }
    }

    public static void task7 () {
        System.out.println("Задача 7");
        int one = 999;
        int two = 68;
        int three = 327596;
        if (one > two && one > three) {
            System.out.println("Наибольшее число " + one);
        }
        else if (two > one && two > three) {
            System.out.println("Наибольшее число " + two);
        }
        else {
            System.out.println("Наибольшее число " + three);
        }
    }

}