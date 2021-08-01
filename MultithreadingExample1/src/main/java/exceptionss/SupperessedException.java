package exceptionss;

public class SupperessedException {
   public static void main(String[] args) {

      try (RiverRaft riverRaft = new RiverRaft();) {
         riverRaft.crossRapid();
      } catch (Exception e) {
         System.out.println("Exception caught: " + e);
         Throwable[] exs = e.getSuppressed();
         if (exs.length > 0) {
            System.out.println(exs[0]);
         }
      }
   }
}
