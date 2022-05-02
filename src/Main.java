public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Мурзик");
        Dog dog = new Dog("Бобик");
        Dog wolf = new Dog("Wolf");
        Dog tyz = new Dog("Тузик");


        cat.print();
//        cat.sumCat(1);
        cat.run(250);
        cat.swim(5);



        System.out.println(" ");
        dog.print();
//        dog.sumDog(1);
        dog.run(400);
        dog.swim(9);
        System.out.println(" ");

        wolf.print();
//        wolf.sumDog(1);
        wolf.run(600);
        wolf.swim(8);
        System.out.println(" ");

        tyz.print();
//        tyz.sumDog(1);
        tyz.run(800);
        tyz.swim(53);




    }
}
