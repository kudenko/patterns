package test;

public class Box3 extends Box2 {
    int a = 3;

    @Override
    public void go(){
        System.out.println(super.a);

    }

    public static void main(String[] args) {
        Box3 b = new Box3();
        b.go();

    }

}
