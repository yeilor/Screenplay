package co.compensar.interactions;

public class EsperaImplicita {

    public void EsperaImplicita ( int segundos){
        try {
            Thread.sleep(segundos*1000);
        } catch (InterruptedException e) {
            e.printStackTrace(System.out);
        }

    }
}


