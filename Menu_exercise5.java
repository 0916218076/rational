public class Menu_exercise5 {
    public int timUSCL(int a, int b) {
        do {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }

        } while (a > 0 && b > 0);
        return a;
    }

    public void add(Rational ps, Rational ps1) {
        int tuso = ps.gettuso() * ps1.getmauso() + ps.gettuso() * ps1.getmauso();
        int mauso = ps.getmauso() * ps1.getmauso();
        Rational phanSoTong = new Rational(tuso, mauso);
        phanSoTong.produce();
        System.out.println("Tong hai phan so = " + phanSoTong.gettuso() + "/" + phanSoTong.getmauso());
    }

    public void subtract(Rational ps, Rational ps1) {
        int tuso = ps.gettuso() * ps1.getmauso() - ps.gettuso() * ps1.getmauso();
        int mauso = ps.getmauso() * ps1.getmauso();
        Rational phanSoHieu = new Rational(tuso, mauso);
        phanSoHieu.produce();
        System.out.println("Hieu hai phan so = " + phanSoHieu.gettuso() + "/" + phanSoHieu.getmauso());
    }

    public void mutiple(Rational ps, Rational ps1) {
        int tuso = ps.gettuso() * ps.gettuso();
        int mauso = ps.getmauso() * ps1.getmauso();
        Rational phanSoNhan = new Rational(tuso, mauso);
        phanSoNhan.produce();
        System.out.println("Tich hai phan so = " + phanSoNhan.gettuso() + "/" + phanSoNhan.getmauso());
    }

    public void device(Rational ps, Rational ps1) {
        int tuso = ps.gettuso() * ps1.getmauso();
        int mauso = ps.getmauso() * ps1.gettuso();
        Rational phanSoChia = new Rational(tuso, mauso);
        phanSoChia.produce();
        System.out.println("Thuong hai phan so = " + phanSoChia.gettuso() + "/" + phanSoChia.getmauso());
    }
}
