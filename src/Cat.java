public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void swim(int a) {
        System.out.println("Не умеет плавать");


    }

    @Override
    public void run(int b) {
        if (b <= 200 && b >= 0) {
            System.out.println("Пробежал " + b + "м");
        } else {
            System.out.println("Упал" + " не добежал " + (b - 200) + "м");
        }
    }


//    public void sumCat(int d) {
//        d++;
//        System.out.println("Всего котов: "+d);
//    }
}
