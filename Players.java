package generics;

public class Players<T> {
        private T player1;
        private T player2;

        public Players(T player1, T player2) {
            this.player1 = player1;
            this.player2 = player2;
        }

        public T getPlayer1() {
            return player1;
        }

        public void setPlayer1(T player1) {
            this.player1 = player1;
        }

        public T getPlayer2() {
            return player2;
        }

        public void setPlayer2(T player2) {
            this.player2 = player2;
        }

        public void printPlayers() {
            System.out.println("Player 1: " + player1);
            System.out.println("Player 2: " + player2);
        }

    public static void main(String[] args) {
        Players<String> p1=new Players<>("Ram","Kumar");
        System.out.println(p1.getPlayer1());
        System.out.println(p1.getPlayer2());
        p1.setPlayer1("hari");
        p1.setPlayer2("arun");
        p1.printPlayers();
    }
}
