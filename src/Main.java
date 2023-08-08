// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        // Press Alt+Enter with your caret at the highlighted text to see how
        // IntelliJ IDEA suggests fixing it.
        zd1();
        zd2();
        zd3();
        zd4();
        zd5();
        zd6();
        zd7();
    }
    public static void zd1(){
        var slovo = "Если возраст человека равен ";
        int age = 18;
        System.out.println();
        if (age >= 18){
            System.out.println(slovo + age+" , то он совершеннолетний.");
        }
        else {
            System.out.println(slovo + age + " , то он не достиг совершеннолетия, нужно немного подождать.");
        }
    }
    public static void zd2(){
        int t = 5;
        System.out.println();
        if (t >= 5){
            System.out.println("На улице "+ t +" градусов, можно идти без шапки.");
        }
        else {
            System.out.println("На улице " + t + " градусов, нужно надеть шапку.");
        }
    }
    public static void zd3(){
        int speed = 220;
        System.out.println();
        if (speed > 60){
            System.out.println("Если скорость "+speed+" км/ч, то придется заплатить штраф.");
        }
        else{
            System.out.println("Если скорость "+speed+" км/ч, то можно ездить спокойно.");
        }
    }
    public static void zd4(){
        int age = 300;
        System.out.println();
        if (age < 2) {
            System.out.println("Если возраст человека равен " + age + ", то ему пора спать.");
        }
        else {
            if (age >= 2 && age < 7) {
                System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад.");
            }
            else {
                if (age > 6 && age < 19) {
                    System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу.");
                }
                else {
                    if (age > 18 && age < 25) {
                        System.out.println("Если возраст человека равен " + age + ", то его место в университете.");
                    }
                    else {
                        if (age > 24 && age < 61) {
                            System.out.println("Если возраст человека равен " + age + ", то ему пора ходить на работу.");
                        }
                        else {
                            System.out.println("Если возраст человека равен " + age + ", то он может отдохнуть.");
                        }
                    }
                }
            }
        }
//        if (age > 100) {
//            System.out.println("Если возраст человека равен " + age + ", то он уже отдыхает.");
//        }
    }
    public static void zd5(){
        int age = 44;
        System.out.println();
        if (age < 5){
            System.out.println("Если возраст ребенка равен "+ age + ", то ему нельзя кататься на аттракционе.");
        }
        else {
            if (age > 4 && age < 14) {
                System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе в сопровождении взрослого.");
            }
            else {
                System.out.println("Если возраст ребенка равен " + age + ", то ему можно кататься на аттракционе без сопровождения взрослого.");
            }
        }
    }
    public static void zd6() {
        int generelPlace = 102;
        int sitePlace = 60;
        int upPlace = generelPlace - sitePlace;
        int busyPlace = 102;
        System.out.println();
        if (busyPlace < 102) {
            if (busyPlace < 61) {
                System.out.println("В вагоне свободно " + (sitePlace - busyPlace) + " сидячих мест и " + upPlace + " стоячих.");
            } else {
                if (busyPlace == 101) {
                    System.out.println("В вагоне 1 стоячие место.");
                } else {
                    System.out.println("В вагоне заняты сидячие места, но свободно " + (generelPlace - busyPlace) + " стоячих.");
                }
            }
        }
        else{
            System.out.println("Вагон забит.");
        }

    }
    public static void zd7(){
        int one = 10;
        int two = 4;
        int three = 3;
        System.out.println();
        if (one > two && one > three){
            System.out.println(one+" наибольшее число.");
        }
        else {
            if (two > three){
                System.out.println(two+ " наибольшее число.");
            }
            else {
                System.out.println(three+" наибольшее число.");
            }
        }
    }




}
