public class AufgabeCountdown {

    public AufgabeCountdown(int start, int end){

        for(int i = start; i >= end; i--){
            System.out.println(i);
        }

        System.out.println("Ich werde mich nun abschalten. Einen schönen Tag noch");

    }
}
