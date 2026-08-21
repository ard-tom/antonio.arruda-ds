import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Double> listaNotas = new ArrayList<Double>();

        Scanner sc = new Scanner(System.in);

        System.out.println("Adicione 5 notas.");

        double i = 0;

        for (i = 0; i < 5; i++){
            System.out.println("Adicione a " +(int) i + "° nota: ");
            double numeroUser = sc.nextInt();
            listaNotas.add((int) i, numeroUser);
        }

        System.out.println(listaNotas);

        System.out.println("Escolha uma das notas para ser removida. Cite a POSIÇÃO do número, não o valor dele.");
        int a1 = sc.nextInt();

        listaNotas.remove(a1);

        System.out.println(listaNotas);

        double soma1 = 0;
        double soma2 = 0;
        //double valor=0;
        for (int j = 0; j < 4; j++){
            soma1 = listaNotas.get(j);
            soma2 = soma2 + soma1;
          //  valor += listaNotas.get(j);
        }

        System.out.println("Soma dos números: " + soma2);
        System.out.println("Média final: " + soma2 / 4.0);

        //ordenando a lista para ordem decrescente
        listaNotas.sort(Comparator.reverseOrder());
        System.out.println(listaNotas);

        sc.close();
    }
}