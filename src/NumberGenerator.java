import java.util.Random;

public class NumberGenerator {
    public static void main(String[] args) {

        int num, i, j;
        int [] mega = new int[6];  //6 = qtd de num que deve ser gerado

        Random r = new Random();
        for(i = 0; i < mega.length; i++){
            num = r.nextInt(60) + 1;

            for(j = 0; j < mega.length; j++){
                if(num == mega[j] && j != i){
                    num = r.nextInt(60) + 1;
                } else {
                    mega[i] = num;
                }
            }

        }

        for(i = 0; i < mega.length; i++) {
            for(j = i; j < mega.length; j++) {
                if(mega[i] > mega[j]) {
                    num = mega[i];
                    mega[i] = mega[j];
                    mega[j] = num;
                }
            }
        }

        for(i = 0; i < mega.length; i++) {
            System.out.println(mega[i]);
        }
    }
}