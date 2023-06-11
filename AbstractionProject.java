public abstract class AbstractionProject {
    abstract void planNo(int n);
    abstract void details(String domain,String[] members,int estimate);
}
class Team extends AbstractionProject {

    @Override
    void planNo(int n) {
        System.out.println("plan no "+n);
    }

    @Override
    void details(String domain, String[] members, int estimate) {
        System.out.println("The domain is "+domain+"\nThe members are");
        for (int i = 0; i < members.length; i++) {
            System.out.println(i+1+". "+members[i]);
        }
        System.out.println(estimate+" is the appx estimation of our project");
    }

    public static void main(String[] args) {
        Abstract.Team a=new Team();
        a.planNo(5);
        a.details("MACHINE LEARNING",new String[]{"Ravi","Kumar"},100000);
    }
}
