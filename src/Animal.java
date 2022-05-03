public abstract class Animal {
    private String name;



    public Animal(String name) {
        this.name = name;


    }


    public String getName() {
        return name;
    }

    public void print() {
        System.out.println(name);

    }

    public abstract void swim(int a);

    public abstract void run(int b);

//    public void sumAnimal(int c){
//        c++;
//        System.out.println("Êîëëè÷åñòâî æèâîòíûõ: "+ c);
//
//    }



}
