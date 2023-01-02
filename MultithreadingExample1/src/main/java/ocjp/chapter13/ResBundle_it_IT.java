package ocjp.chapter13;

import java.util.ListResourceBundle;

public class ResBundle_it_IT extends ListResourceBundle {
    @Override
    protected Object[][] getContents() {
        return contents;
    }

    static final Object[][] contents = {
            {"MovieName", "Che Bella Giornata"},
            {"GrossRevenue", "43000000"},
            {"Year", (Integer)2011}
    };
}
