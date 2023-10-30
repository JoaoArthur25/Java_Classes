import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        ArrayList<Aluno> EC2MA = new ArrayList<Aluno>();

        EC2MA.add(new Aluno("João Arthur Silva", 23300040, 18, new double[] { 10, 10, 10, 10, 10 }));
        EC2MA.add(new Aluno("Enzo Kikuchi", 23300001, 19, new double[] { 9.3, 8, 8.5, 10, 10 }));
        EC2MA.add(new Aluno("Mario Anijar", 23300035, 18, new double[] { 7.5, 8, 10, 10, 8.7 }));
        EC2MA.add(new Aluno("Igor Acatauassu", 23300038, 21, new double[] { 10, 10, 10, 8, 9.5 }));
        EC2MA.add(new Aluno("Kelton Sousa", 23300010, 19, new double[] { 10, 10, 8.3, 7.9, 10 }));

        for (Aluno aluno : EC2MA) {
            System.out.println(aluno);
            System.out.println();
        }

        System.out.println("Média das notas: " + calcularMedia(EC2MA));
    }

    public static double calcularMedia(ArrayList<Aluno> lista) {
        double soma = 0;
        for (Aluno aluno : lista) {
            for (double nota : aluno.getNotas()) {
                soma += nota;
            }
        }
        return soma / (lista.size() * 5);
    }
}
