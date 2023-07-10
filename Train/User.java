package Train;

public class User {
    private String name;
    private int age;
    private char ber;

    public User(String name, int age, char ber) {
        this.name = name;
        this.age = age;
        this.ber = ber;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setBer(char data){
        this.ber = data;
    }

    public char getBer() {
        return ber;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name+" "+age+" "+ber;
    }
}
