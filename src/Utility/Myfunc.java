package Utility;

public class Myfunc {
    public static void Bekle(int saniye){
        try {
            Thread.sleep(saniye*3000);
        }
        catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }
}
