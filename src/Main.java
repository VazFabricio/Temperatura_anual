import java.util.Scanner;
public class Main {
    private static double [] registrarTemp (Scanner sc){
        double [] temperatura = new double [12];
        for (int i = 0; i < temperatura.length; i++){
            System.out.println("Temperatura do "+(i+1)+"º mes do ano");
            temperatura[i]=sc.nextDouble();
        }
        return temperatura;
    }
    private static void exibeArrayDouble (double [] arr){
        for (int i = 0; i< arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    private static void exibeArrayInt (int [] arr){
        for (int i = 0; i< arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    private static int [] posicaoDoMaiorEMenor (double [] arr){
        int [] posicaoDosMeses = new int [2];
        double maiorTemperatura = arr[0];
        double menorTemperatura = arr[0];
        for (int i = 0; i< arr.length; i++){
            if (arr[i]>maiorTemperatura){
                posicaoDosMeses[0] = i;
            }
        }
        for (int j = 0; j< arr.length; j++){
            if (arr[j]<menorTemperatura){
                posicaoDosMeses[1] = j;
            }
        }
        return posicaoDosMeses;
    }
    private static void maiorEMenorTemperatura (int [] arr){
        switch (arr[0]){
            case 0:
                System.out.println("Janeiro");
            case 1:
                System.out.println("Fevereiro");
            case 2:
                System.out.println("Marco");
            case 3:
                System.out.println("Abril");
            case 4:
                System.out.println("Maio");
            case 5:
                System.out.println("Junho");
            case 6:
                System.out.println("Julho");
            case 7:
                System.out.println("Agosto");
            case 8:
                System.out.println("Setembro");
            case 9:
                System.out.println("Outubro");
            case 10:
                System.out.println("Novembro");
            case 11:
                System.out.println("Dezembro");
        }


    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] registro = registrarTemp(sc);
        int [] posicao = posicaoDoMaiorEMenor(registro);
        exibeArrayInt(posicao);
        maiorEMenorTemperatura(posicao);




    }
}