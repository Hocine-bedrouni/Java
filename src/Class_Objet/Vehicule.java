package Class_Objet;

public abstract class Vehicule {

    public static class Avion extends Vehicule {

        public static void Marche(){

            System.out.println("Ce véhicule est un avion et circule dans les airs");
        }
    }
    public class Vélo extends Vehicule {

        public static void Marche(){

            System.out.println("Ce véhicule à deux roues et circule sur route");
        }
    }
    public class Bateau extends Vehicule {

        public static void Marche(){

            System.out.println("Ce véhicule navigue sur les flots");
        }
    }
    public class Camion extends Vehicule {

        public static void Marche(){

            System.out.println("Ce véhicule est un poid lourd et circule route");
        }
    }




}
