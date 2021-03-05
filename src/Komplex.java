public class Komplex {


    public double re;
    public double im;

    public Komplex(double r, double i) {

        this.re = r;
        this.im = i;
    }

    @Override
    public String toString() {                      // skriver talet
        return "Komplex{" +
                "re=" + re +
                ", im=" + im +
                '}';
    }

    public Komplex add(Komplex out) {                //Beräkning
        double real = this.re + out.re;
        double img = this.im + out.im;
        Komplex svar = new Komplex(real, img);
        return svar;

    }

    public Komplex multiply(Komplex out) {           //Beräkning
        double real = this.re * out.re;
        double img = this.im * out.im;
        Komplex svar = new Komplex(real, img);
        return svar;

    }

    public double arg() {
        return 0;
    }
}
