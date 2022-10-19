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
    private static int [][] maiorMenorEPosicoes (double [] arr){
        int [][] posicaoDosMesesETemperatura = new int [2];
        double maiorTemperatura = arr[0];
        double menorTemperatura = arr[0];
        for (int i = 0; i< arr.length; i++){
            if (arr[i]>maiorTemperatura){
                maiorEMenorTemperaturas[0] = arr[i];
                posicaoDosMeses[0] = i;
            }
        }

        for (int j = 1; j< arr.length; j++){
            if (arr[j]<menorTemperatura){
                maiorEMenorTemperaturas[1] = arr[j];
                posicaoDosMeses[1] = j;
            }
        }
        return posicaoDosMeses;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double [] listaTemp= registrarTemp(sc);
        exibeArrayDouble(listaTemp);
        int[] x = maiorEMenor(listaTemp);
        exibeArrayInt(x);


    }
}