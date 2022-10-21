import java.util.Scanner;
public class Main {
    private static void exibeArrayInt (int [] arr){
        for (int i = 0; i< arr.length; i++){
            System.out.println(arr[i]);
        }
    }
    private static double [] registrarTemp (Scanner sc){
        double [] temperatura = new double [12];
        for (int i = 0; i < temperatura.length; i++){
            System.out.print("Temperatura do "+(i+1)+"º mes do ano");
            temperatura[i]=sc.nextDouble();
        }
        return temperatura;
    }
    private static int [] posicaoDoMaiorEMenor (double [] arr){
        int [] posicaoDosMeses = new int [2];
        double maiorTemperatura = arr[0];
        double menorTemperatura = arr[0];
        int posicaoDoMaior = 0;
        int posicaoDoMenor = 0;
        for (int i = 0; i< arr.length; i++){
            if (arr[i]>maiorTemperatura){
                maiorTemperatura = arr[i];
                posicaoDosMeses[0] = i;
            }else if (arr[i]<menorTemperatura){
                menorTemperatura = arr[i];
                posicaoDosMeses[1] = i;
            }
        }
        return posicaoDosMeses;
    }

    private static void exibeNomeDosMeses (int [] indexDosMeses, double [] registroDosMeses){
        String [] meses = {
                "Janeiro", "Fevereiro", "Marco", "Abril",
                "Maio", "Junho", "Julho", "Agosto",
                "Setembro", "Outubro", "Novembro", "Dezembro"
        };
        System.out.println("Mes com maior temp.: "+meses[indexDosMeses[0]]);
        System.out.println("Com a temperatura de: " + registroDosMeses[indexDosMeses[0]]);
        System.out.println("Mes com menor temp.: "+meses[indexDosMeses[1]]);
        System.out.println("Com a temperatura de: " + registroDosMeses[indexDosMeses[1]]);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] registro = registrarTemp(sc);
        int [] posicao = posicaoDoMaiorEMenor(registro);
        exibeArrayInt(posicao);
        exibeNomeDosMeses(posicao, registro);

    }
}