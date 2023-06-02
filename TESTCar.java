public class TESTCar {
    public static void main(String[]args){

        CAR myCar = new CAR();
        myCar.printCar();

        System.out.println();

        CAR newCar = new CAR(2021,"Ferrari", 200 );
        newCar.printCar();

        System.out.println();

        CAR thirdCar = new CAR(1998, "Audi", 160);
        thirdCar.printCar();
    }
}
