package java8;

public class OuterWorld {
    public InnerPeace i = new InnerPeace();

    private class InnerPeace {
        private String reason = "none";
    }

    void m() {
        System.out.println(i.reason);
    }
}
