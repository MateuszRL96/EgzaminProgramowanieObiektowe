// 16. Znajdź, omów i popraw błędy w poniższym programie, oraz zaproponuj poprawny program (idk co autorka miała na myśli -
// - w programie jest tylko jeden błąd)
class Parent {
    private String name;

    Parent(String name){
        this.name = name;
    }
    String getName(){
        return name;
    }
    void setName(String name){
        this.name = name;
    }
}

class Child extends Parent {
    public Child(){
        //super(); // błąd - trzeba podać parametr typu String, gdyż konstruktor nadrzędny (Parent) go oczekuje
        super("Billy");
    }
    public static void main(String[] args) {
        Child child = new Child();
        child.setName("Benny");
        System.out.println(child.getName());

        /*
        Parent parent = new Child();
        parent.setName("Jenny");
        System.out.println(parent.getName());

        Parent parent2 = new Parent("Penny");
        System.out.println(parent2.getName());
        */
    }
}
