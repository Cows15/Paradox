public class Paradox {

     boolean dead = false;

    void goDeeper() {
        this.dead = dead;

        System.out.println("Dream within a dream, need to go deeper");
        goDeeper();
    }




    public static void main(String[] args) {
    Paradox pd = new Paradox();
    pd.goDeeper();//creates a stack overflowerror
    }
}
