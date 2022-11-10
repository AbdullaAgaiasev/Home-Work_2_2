public class Main {
    public static void main(String[] args) {

       // Mersedes mersedes = new Mersedes("Maneken", "one", 430, "Отличный");

       // Ford ford = new Ford("Maneken 2", "two", "Большая");

      //  Bmw bmw = new Bmw("Maneken 3", "three", (int) 6.8, "Очень");
        //Dog dog = new Dog("Botsman");


        Printable[] printables = {Transport("bmv"),Transport("Ford"),Transport("Mersedes")};
        for (Printable print:printables) {
          print.print();
        }


        for (int i = 0; i < printables.length; i++) {

            if (printables[i] instanceof Transport) {
                System.out.println(((Transport) printables[i]).getName() + " Транспорт -> ");
            }
            if (printables[i] instanceof Animal) {
                System.out.println(((Animal) printables[i]).getNameDog());
            }

                System.out.println("-------------");

            printables[i].print();
            }





    }
    public static Printable Transport(String clasName) {
        switch (clasName) {
            case "bmv":
                Bmw bmw = new Bmw("Maneken3", (int) 6.8, "Очень");
                return bmw;
            case "Ford":
                Ford ford = new Ford("Maneken2", "Большая");
                return ford;
            case "Mersedes":
                Mersedes mersedes = new Mersedes("Maneken", 430, "Отличный");
                return mersedes;
        }
        return null;
    }
        }


