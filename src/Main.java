public class Main {
    public static void main(String[] args) {
       // Домашнее Задание 1
        System.out.println("Домашнее Задание 1");
        var dog = 8.0;
        System.out.println(dog);
        dog = dog+4.0;
        System.out.println(dog);
        dog = dog-3.5;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        cat = cat+4.0;
        System.out.println(cat);
        cat = cat-1.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        paper = paper+4;
        System.out.println(paper);
        paper = paper-7639;
        System.out.println(paper);

        // Домашнее Задание 2
        System.out.println("Домашнее Задание 2");
        var friend = 19;
        System.out.println(friend);
        friend = friend+2;
        System.out.println(friend);
        friend = friend/7;
        System.out.println(friend);
        var frog = 3.5;
        System.out.println(frog);
        frog = frog*10;
        System.out.println(frog);
        frog = frog/3.5;
        System.out.println(frog);
        frog = frog+4;
        System.out.println(frog);

        // Домашнее Задание 3
        System.out.println("Домашнее Задание 3");
        var firstBoxerWeight = 78.2;
        System.out.println("Вес первого боксера " + firstBoxerWeight + " кг");
        var secondBoxerWeight = 82.7;
        System.out.println("Вес второго боксера " + secondBoxerWeight + " кг");
        var totalWeight = firstBoxerWeight + secondBoxerWeight;
        System.out.println("Общий вес боксеров " + totalWeight + " кг");
        var weightDifference= (secondBoxerWeight-firstBoxerWeight);
        System.out.println("Разница веса двух боксеров " + weightDifference + " кг");
        var weightDifference2 = totalWeight % firstBoxerWeight;
        System.out.println("Разница веса двух боксеров " + weightDifference2 + " кг");

        var totalTime = 640;
        System.out.println("Всего часов " + totalTime);
        var everyEmployee = 8;
        System.out.println("Каждый сотрудник уделяет " + everyEmployee + " часов");
        var employeesInTheCompany = totalTime / everyEmployee;
        System.out.println("Всего работников в компании " + employeesInTheCompany + " человек");
        var moreBy94 = employeesInTheCompany + 94;
        var timeMoreBy94 = totalTime / moreBy94;
        System.out.println("Если в компании работает " + moreBy94 + " человека, то всего " + timeMoreBy94 +
                " часа работы может быть поделено между сотрудниками");
    }
}