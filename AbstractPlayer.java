package Abstract;


public abstract class AbstractPlayer {
    public abstract void playStyle();
    public abstract void Bowlers();
}
class Indians extends AbstractPlayer{
    @Override
    public void playStyle() {
        System.out.println("Indians are hard hitters, inspite of the batting order");
    }

    @Override
    public void Bowlers() {
        System.out.println("2 out of 3 bowlers are spinners");
    }
}
class Australians extends AbstractPlayer{
    @Override
    public void playStyle() {
        System.out.println("Australians are versatile in their way of playing");
    }

    @Override
    public void Bowlers() {
        System.out.println("The average no of spinners in a team in 1");
    }
}
class Cricket{
    public static void main(String[] args) {
        Indians ind=new Indians();
        Australians aus=new Australians();
        ind.playStyle();
        ind.Bowlers();
        aus.playStyle();
        aus.Bowlers();
    }
}
