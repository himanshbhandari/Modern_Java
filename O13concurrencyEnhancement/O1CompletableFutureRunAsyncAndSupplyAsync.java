package O13concurrencyEnhancement;

import java.util.concurrent.CompletableFuture;

public class O1CompletableFutureRunAsyncAndSupplyAsync {
    public static void main(String[] args) {
        /*
        CompleatbleFuture- part of java.util.concurrent package.
        CompletableFuture is a part of the java.util.concurrent package that allows you to write non-blocking, asynchronous code. It represents a future result of an asynchronous computation.
        Think of it as a Promise in JavaScript.
        You can run tasks in the background and process the result once it's available—without blocking the main thread.
        runAsync() vs supplyAsync()
            Feature	runAsync()	supplyAsync()
            Return value	CompletableFuture<Void>	CompletableFuture<T>
            Purpose	Executes code without returning result	Executes code and returns a result
            Example Use	Logging, background task	Fetch data, calculate value asynchronously
         */

        CompletableFuture<Void> future=CompletableFuture. //runAsync(Cosumer<>) interanlly used Consumer interface
                runAsync(()-> System.out.println("run Async is running "+Thread.currentThread().getName()));
        future.join();

        System.out.println("This is running main thread : "+Thread.currentThread().getName());

        CompletableFuture<String>future1=CompletableFuture.  //supplyAsync(Supplier<>) internally used Supplier interface
                supplyAsync(()->Thread.currentThread().getName()+" execute successfully");

        System.out.println(future1.join());

    }
}
