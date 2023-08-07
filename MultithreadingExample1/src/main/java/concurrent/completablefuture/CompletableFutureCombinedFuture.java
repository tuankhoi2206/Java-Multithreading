package concurrent.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

import static java.lang.System.*;

/**
 * @author : root
 * @created : 07/08/2023, Monday
 * @Description:
 **/
public class CompletableFutureCombinedFuture {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        out.println("Retrieve weight: ");
        CompletableFuture<Double> weightInKgFuture = CompletableFuture.supplyAsync(CompletableFutureCombinedFuture::getWeight);
        out.println("Retrieve height: ");
        CompletableFuture<Double> heightInCmFuture = CompletableFuture.supplyAsync(CompletableFutureCombinedFuture::getHeight);

        CompletableFuture<Double> combinedFuture = weightInKgFuture.thenCombine(heightInCmFuture, (weightInKg, heightInCm) -> {
            out.println("Calculating BMI: Completed!");
            Double heightInMeter = heightInCm / 100;
            return weightInKg / (heightInMeter * heightInMeter);
        });

        out.println("Your BMI is - " + combinedFuture.get());
    }

    private static Double getWeight() {
        out.println("Retriveing weight ...");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
        out.println("Retrieving weight: Completed!");
        return 65.0;
    }

    private static Double getHeight() {
        out.println("Retriveing weight ...");
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        }
        out.println("Retrieving weight: Completed!");
        return 1.7;
    }
}
