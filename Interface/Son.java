package Interface;

public class Son implements Hair,Voice {
    @Override
    public void hairColor() {
        System.out.println("My hair is brown same as my mom");
    }
    public void hairstyle(){
        System.out.println("my hair is curly");
    }
    public void voiceType(){
        System.out.println("I sound like my father");
    }
}
