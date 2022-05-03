public class Dog extends Animal {
    public Dog(String name) {

        super(name);
    }

    @Override
    public void swim(int a) {
        if (a <= 10 && a >= 0) {
            System.out.println("Проплыл " + a + "м");
        } else {
            System.out.println("Утонул," + " не доплыл " + (a - 10) + "м");
        }
    }

    @Override
    public void run(int b) {
        if (b < 500 && b >= 0) {
            System.out.println("Пробежал " + b + "м");
        } else {
            System.out.println("Упал " + "не добежал " + (b - 500) + "м");
        }
    }


//    public void sumDog(int d) {
//
//        d++;
//        System.out.println("Всего собак: "+d);
//
//    }


}
