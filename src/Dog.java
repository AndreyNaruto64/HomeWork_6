public class Dog extends Animal {
    public Dog(String name) {

        super(name);
    }

    @Override
    public void swim(int a) {
        if (a <= 10 && a >= 0) {
            System.out.println("������� " + a + "�");
        } else {
            System.out.println("������," + " �� ������ " + (a - 10) + "�");
        }
    }

    @Override
    public void run(int b) {
        if (b < 500 && b >= 0) {
            System.out.println("�������� " + b + "�");
        } else {
            System.out.println("���� " + "�� ������� " + (b - 500) + "�");
        }
    }


//    public void sumDog(int d) {
//
//        d++;
//        System.out.println("����� �����: "+d);
//
//    }


}
