package O13concurrencyEnhancement;

import java.util.concurrent.CompletableFuture;

public class O2ChainingTaskAttachCallback {
    public static void main(String[] args) {
        /*
        Feature	thenApply()	thenAccept()	thenRun()
            Takes input	    ✅ Yes (uses result from previous task)	✅ Yes (uses result from previous task)	❌ No (ignores previous result)
            Returns value	✅ Yes (transforms the result)	❌ No (just consumes the result)	❌ No (just runs after completion)
            Use case	    Transform result	Perform side-effect with result	Run task after previous task ends
         */

        CompletableFuture<Integer>future=CompletableFuture.supplyAsync(()->5)
                .thenApply(num->num*2)  //thenApply(Function<>) it internally use Function interface.
                .thenApply(num->num*2);
        System.out.println(future.join());

        System.out.println("************************************************************** b");

        CompletableFuture<Void>futureAccept=CompletableFuture.supplyAsync(()->6)
                .thenAccept((num)-> System.out.println("value inside then accept is: "+num));  //it return nothing only consume that means -null return
        System.out.println(futureAccept.join());

        System.out.println("***********************************");

        CompletableFuture<Void>futureRun=CompletableFuture.supplyAsync(()->6)
                .thenRun(()-> System.out.println("future run is running")); //it return nothing so that means -null
        System.out.println(futureRun.join());

    }
}
