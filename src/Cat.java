public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void swim(int a) {
        System.out.println("�� ����� �������");


    }

    @Override
    public void run(int b) {
        if (b <= 200 && b >= 0) {
            System.out.println("�������� " + b + "�");
        } else {
            System.out.println("����" + " �� ������� " + (b - 200) + "�");
        }
    }


//    public void sumCat(int d) {
//        d++;
//        System.out.println("����� �����: "+d);
//    }
}
