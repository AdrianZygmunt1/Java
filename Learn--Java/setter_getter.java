class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) { // ustawia / zmienia wartość pola
        this.name = name;
    }

    public int getAge() { // getter zwraca
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }
}

public class setter_getter {
    public static void main(String[] args) {
        Person p = new Person();
        p.setName("Kamil");
        p.setAge(20);

        System.out.println(p.getName());
        System.out.println(p.getAge());
    }
}