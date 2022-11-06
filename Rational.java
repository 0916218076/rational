public class Rational {
    private int tuso;
    private int mauso;

    public Rational() {

    }

    public Rational(int tuso, int mauso) {
        this.tuso = tuso;
        this.mauso = mauso;
    }

    public int gettuso() {
        return this.tuso;
    }

    public int getmauso() {
        return this.mauso;
    }

    public void settuso(int tuso) {
        this.tuso = tuso;
    }

    public void setmauso(int mauso) {
        this.mauso = mauso;
    }

    public void produce() {
        Menu_exercise5 mn = new Menu_exercise5();
        int i = mn.timUSCL(this.gettuso(), this.getmauso());
        this.settuso(this.getmauso() / i);
        this.setmauso(this.getmauso() / i);
    }

}