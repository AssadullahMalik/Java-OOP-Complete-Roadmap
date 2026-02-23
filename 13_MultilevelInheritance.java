class GrandParent {
    void showGrandParent() {
        System.out.println("I am GrandParent");
    }
}

class Parent extends GrandParent {
    void showParent() {
        System.out.println("I am Parent");
    }
}

class Child extends Parent {
    void showChild() {
        System.out.println("I am Child");
    }
}

public class MultilevelInheritanceDemo {
    public static void main(String[] args) {
        Child c = new Child();
        c.showGrandParent();
        c.showParent();
        c.showChild();
    }
}
