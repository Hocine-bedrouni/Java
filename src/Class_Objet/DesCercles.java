package Class_Objet;

public class DesCercles {
    public static void main(String[] args) {

        Cercle c1 = new Cercle(10);
        System.out.printf("La circonference d'un cercle de 10 cm est de %.2f\n", c1.circonference());
        System.out.printf("La surface d'un cercle de 10 cm est de %.2f\n", c1.surface());

        Cercle c2 = new Cercle(45);
        System.out.printf("La circonference d'un cercle de 10 cm est de %.2f\n", c2.circonference());
        System.out.printf("La surface d'un cercle de 10 cm est de %.2f\n", c2.surface());

    }

}
