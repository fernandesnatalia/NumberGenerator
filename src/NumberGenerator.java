import java.util.Random;

public class NumberGenerator {
    public static void main(String[] args) {

        //numero será o valor gerado randomicamente, i será a contagem, j verificará a repetição
        int num, i, j;
        int [] mega = new int[6];  //6 = qtd de num que deve ser gerado

        Random r = new Random();
        for(i = 0; i < mega.length; i++){
            num = r.nextInt(60) + 1;
            //60 = num limite de opções para jogar; +1 para não contar até 59

            for(j = 0; j < mega.length; j++){
                if(num == mega[j] && j != i){
                    num = r.nextInt(60) + 1;  //j verifica se houve repetição, e chama outro num
                } else {
                    mega[i] = num;  //se não houve repetição, recebe o numero
                }
            }

        }

        //ordena o array de forma crescente
        for(i = 0; i < mega.length; i++) {
            for(j = i; j < mega.length; j++) {
                if(mega[i] > mega[j]) {
                    num = mega[i];
                    mega[i] = mega[j];
                    mega[j] = num;
                }
            }
        }

        //apresenta o resultado
        for(i = 0; i < mega.length; i++) {
            System.out.println(mega[i]);
        }
    }
}