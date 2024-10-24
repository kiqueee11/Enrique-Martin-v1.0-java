import java.util.Random;

public class Dados {

    public static void main(String[] args) {
        int caras;
        Random random = new Random();


        if (args.length == 1) {
            caras = random.nextInt(1, 6);
            System.out.println("El dado tiene " + caras + " caras");
        } else {

            if (args.length == 2) {
                int dados = random.nextInt(1, 6);
                System.out.println("Tienes " + dados + " dados");
                for (int a = 1; a <= dados; a++) {
                    caras = random.nextInt(1, 6);
                    System.out.println("El dado " + a + " tiene " + caras + " caras");

                }


            }
        }
    }

}
