package Class_Objet;

public class Cercle {


    private double r;

    public Cercle(double r) {
        this.r = r;
    }

      public double circonference(){
          double circ= Math.PI * 2 *r;
          return circ;
        }

        public double surface(){
            double surf = Math.PI *(r*r);
            return surf;
        }

    }

