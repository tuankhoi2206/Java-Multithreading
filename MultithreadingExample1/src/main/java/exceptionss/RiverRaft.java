package exceptionss;

public class RiverRaft implements AutoCloseable {

   public RiverRaft() throws Exception {
      System.out.println("Start raft");
   }

   public void crossRapid() throws Exception {
      System.out.println("Cross rapid");
      throw new Exception("Cross Rapid exception");
   }

   @Override
   public void close() throws Exception {
      System.out.println("Reach river bank");
      throw new Exception("Close exception");
   }
}
