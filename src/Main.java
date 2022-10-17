public class Main {
    public static void main(String[] args) {

        ///Task 1

        var dog = 8;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("dog:" + dog);
        System.out.println("cat:" + cat);
        System.out.println("paper:" + paper);

        var newDog = dog + 4;
        var newCat = cat + 4;
        var newPaper = paper + 4;

        System.out.println("dog+4:" + newDog);
        System.out.println("cat+4:" + newCat);
        System.out.println("paper+4:" + newPaper);

        var dimDog = dog - 3.5;
        var dimCat = cat - 1.6;
        var dimPaper = paper - 7639;

        System.out.println("Diminished dog:" + dimDog);
        System.out.println("Diminished cat:" + dimCat);
        System.out.println("Diminished paper:" + dimPaper);


        ///Task 2


        var friend = 19;
        System.out.println(friend);
        var friend1 = friend + 2;
        System.out.println(friend1);
        var friend2 = friend / 7;
        System.out.println(friend2);

        var frog = 3.5;
        System.out.println(frog);
        var frog1 = frog*10;
        System.out.println(frog1);
        var frog2 = frog / 3.5;
        System.out.println(frog2);
        var frog3 = frog + 4;
        System.out.println(frog3);


        ///Task 3


        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var dif = boxer2 - boxer1;
        System.out.println(dif);
        var sum = boxer2 + boxer1;
        System.out.println(sum);
        var sum1 = boxer2 % boxer1;
        System.out.println(sum1);


        var total = 640;
        var indiv = 8;
        var number = total/indiv;
        System.out.println("Всего работников в компании - " + number + " человек.");
        var numberInc = number + 94;
        var totalInc = numberInc * indiv;
        System.out.println("Если всего в компании работает " + numberInc + " человек, то всего " + totalInc + " часов " +
                "работы может быть поделено между сотрудниками.");


    }
}