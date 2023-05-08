package DifferentialEquation;
public class DiffEquation {

    public static void main (String[] args) {
        int k = 2; //кол-во цифр после запятой.

        double Xo, Yo, Y1; //переменные для начального условия
        double k1, k2, k4, k3, h; //переменнные для приближенных точек и шага(h)

        /*
         *Начальные условия
         */
        Xo = 0; //Время  (t0)
        Yo = 0.8; //

        h = 0.1; // шаг

        System.out.println("\tX\t\tY\t\t");
        for(; r(Xo,2)<1.0; Xo += h){ //исправить границу по формуле t1=L/R.

            k1 = g(Xo, Yo);

            k2 = g(Xo + h/2.0, Yo + h*k1/2.0);

            k3 = g(Xo + h/2.0, Yo + h*k2/2.0);

            k4 = g(Xo + h, Yo + h*k3);

            Y1 = Yo + (k1 + 2.0*k2 + 2.0*k3 + k4)/6.0; // формула вычисления усредненной точки.
            System.out.println("\t" + r(Xo + h, k) + "\t\t" + r(Y1 ,k));
            Yo = Y1;

        }

    }
    /**
     * функция для округления и отбрасывания "хвоста"
     */
    public static double r(double value, int k){
        return (double)Math.round((Math.pow(10, k)*value))/Math.pow(10, k);
    }


    /**
     * функции, которые получаются из системы
     */

    public static double g(double x, double y){
        return (y); //E-R*I/L
    }

}