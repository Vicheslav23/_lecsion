public class Main {
    public static void main(String[] args) {

       //        1-й экземпляр
        Wine myWine = new Wine();
        myWine.name = "Sauvignon";
        myWine.sort = "dry";
        myWine.year = 2014;

        System.out.println("Название вина: " + myWine.name + ", сорт: " + myWine.sort + ", год выпуска: " + myWine.year);
        System.out.println();
        System.out.println(myWine.toString());
        System.out.println();


//        2-й экземпляр
        Wine WineSemidry = new Wine();
        WineSemidry.name = "Merlot";
        WineSemidry.sort = "semi-dry";
        WineSemidry.year = 2018;

        System.out.println("Название вина: " + WineSemidry.name + ", сорт: " + WineSemidry.sort + ", год выпуска: " + WineSemidry.year);
        System.out.println();
        System.out.println(WineSemidry.toString());
        System.out.println();

//        3-й экземпляр
        Wine WineSweet = new Wine();
        WineSweet.name = "Bastardo";
        WineSweet.sort = "sweet";
        WineSweet.year = 2012;

        System.out.println("Название вина: " + WineSweet.name + ", сорт: " + WineSweet.sort + ", год выпуска: " + WineSweet.year);
        System.out.println();
        System.out.println(WineSweet.toString());
        System.out.println();

        System.out.println(myWine.onStock(10));
        System.out.println(WineSemidry.onStock(20));
        System.out.println(WineSweet.onStock(15));
        System.out.println();

        System.out.println(myWine.getYear());


    }
}